#For set Management
import collections
#For Time Management
import timeit
#ML Models, pipeline, and classifications
from sklearn.svm import SVC
from sklearn.preprocessing import StandardScaler
from sklearn.pipeline import make_pipeline
from sklearn.model_selection import KFold
from sklearn.metrics import classification_report, f1_score
from sklearn.neighbors import KNeighborsClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier
#Data
import pandas as pd
import csv
import numpy as np

def getDataSet():
    #Create Features and classes from Data
    with open('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Data\\CSVs\\CurrentPokeCSV.csv') as csvFile:
        csvData = csv.reader(csvFile)
        i = 0
        xFull = []
        yFull = []
        for row in csvData:
            if 'Name' in row:
                continue
            features = []
            classes = []
            rowNP = np.loadtxt(row)
            i = 3
            while i <= 9:
                classes.append(rowNP[i])
            yFull.append(y)
            name = row[0]
            xBase = np.load('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Data\\ImageFeatures\\RGBBase\\' + name + 'RGBFeatures.npy')
            for feature in xBase:
                features.append(feature)
            xFull.append(features)
            i += 1
            if(len(features) != 62500):
                print("Error!")
        x = np.array(xFull)[:i]
        y = np.array(yFull)[:i]
        return x, y

beginTime = timeit.default_timer()
x, y = getDataSet()
#90% Train, 10% test
folds = KFold(n_splits=10, shuffle=True)
#Loading Time
loadTime = timeit.default_timer()
print("Data Loaded at " + str(loadTime - beginTime) + " seconds")
#Create Models as dictionary of model name, model Type
print("Creating Models")
models = {}
#Dictionary for model name and run mapped to recall score
#Recall score is how many times the model finds fraud- better than model missing fraud
f1Scores = {}
#Average recall for each model
avgF1Scores = {}
#4 SVMs- parameters are kernel functions
models["SVM_RBF"] = make_pipeline(StandardScaler(), SVC(kernel='rbf'))
models["SVM_LINEAR"] = make_pipeline(StandardScaler(), SVC(kernel='linear'))
models["SVM_POLY"] = make_pipeline(StandardScaler(), SVC(kernel='poly'))
models["SVM_SIGMOID"] = make_pipeline(StandardScaler(), SVC(kernel='sigmoid'))
#5 KNN models- changing K value
models["KNN_Neighbor1"] = make_pipeline(StandardScaler(), KNeighborsClassifier(n_neighbors=1))
models["KNN_Neighbor3"] = make_pipeline(StandardScaler(), KNeighborsClassifier(n_neighbors=3))
models["KNN_Neighbor5"] = make_pipeline(StandardScaler(), KNeighborsClassifier(n_neighbors=5))
models["KNN_Neighbor7"] = make_pipeline(StandardScaler(), KNeighborsClassifier(n_neighbors=7))
models["KNN_Neighbor9"] = make_pipeline(StandardScaler(), KNeighborsClassifier(n_neighbors=9))
#4 Desc Models- changing depth
models["DescTree_NoMaxDepth"] = DecisionTreeClassifier(max_depth=None)
models["DescTree_MaxDepth100"] = DecisionTreeClassifier(max_depth=100)
models["DescTree_MaxDepth500"] = DecisionTreeClassifier(max_depth=500)
models["DescTree_MaxDepth1000"] = DecisionTreeClassifier(max_depth=1000)
#3 Random forests- changing trees
models["RandomForest_MaxTrees50"] = RandomForestClassifier(n_estimators=50)
models["RandomForest_MaxTrees100"] = RandomForestClassifier(n_estimators=100)
models["RandomForest_MaxTrees150"] = RandomForestClassifier(n_estimators=150)
modelTime = timeit.default_timer()
print("Pipeline Made at " + str(modelTime - loadTime) + " seconds\n")

for modelType in models:
    #Iterate through models
    print(modelType)
    model = models[modelType]
    modelTypeBeginTime = timeit.default_timer()
    i = 1
    totalF1Score = 0
    for train, test in folds.split(x):
        #Iterate through folds
        title = modelType + '_RUN_' + str(i)
        print("Creating Data for " + title)
        runBeginTime = timeit.default_timer()
        #Creates the split
        xTrain = x[train]
        xTest = x[test]
        yTrain = y[train]
        yTest = y[test]
        #Fit model
        model.fit(xTrain, yTrain)
        fitTime = timeit.default_timer()
        print("Model Made at " + str(fitTime - runBeginTime) + " seconds")
        print("Finding Best Fits and Testing Model")
        #Test model
        attempts = model.predict(xTest)
        testTime = timeit.default_timer()
        print("Created Estimates at " + str(testTime - fitTime) + " seconds")
        #Display results
        print(title)
        targetNames = ["Not Fraud", "Fraud"]
        print(classification_report(attempts, yTest,
                                    target_names=targetNames))
        #Save F1 score
        print("RECALL SCORE: ")
        f1Score = f1_score(attempts, yTest)
        print(f1Score)
        f1Scores[title] = f1Score
        totalF1Score += f1Score
        thisRun = timeit.default_timer()
        print("Run Completed at " + str(thisRun - runBeginTime) + " seconds.")
        print("")
    modelEndTime = timeit.default_timer()
    avgF1Scores[modelType] = totalF1Score/10.0
    print(modelType + " all runs completed at " + str(modelEndTime - testTime) + " seconds.")

#Get Best Models
sorted_scores = sorted(f1Scores.items(), key=lambda kv: kv[1])
sorted_scores.reverse()
f1Scores = collections.OrderedDict(sorted_scores)
sorted_avgScores = sorted(avgF1Scores.items(), key=lambda kv: kv[1])
sorted_avgScores.reverse()
avgF1Scores = collections.OrderedDict(sorted_avgScores)
#Display Models
print("F1 SCORES GREATEST TO LOWEST:")
for score in recallScores:
    print(score + ": " + str(f1Scores[score]))
print("")
print("AVG F1 SCORES GREATEST TO LOWEST:")
for avgScore in avgRecallScores:
    print(avgScore + ": " + str(avgF1Scores[avgScore]))
done = timeit.default_timer()
print("")
print("Finished at " + str(done - beginTime) + " seconds")

