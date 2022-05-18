#For set Management
import collections
#For Time Management
import timeit
#ML Models, pipeline, and classifications
from sklearn.model_selection import KFold
from sklearn import linear_model
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsRegressor
from sklearn.svm import SVR
from sklearn.tree import DecisionTreeRegressor
from sklearn.ensemble import RandomForestRegressor
from sklearn import metrics
#Data
import pandas as pd
import csv
import pickle
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
            yFull.append(float(row[13]))
            name = row[0]
            xBase = np.load('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Data\\ImageFeatures\\GreyBase\\' + name + 'GreyFeatures.npy')
            for feature in xBase:
                features.append(feature)
            features.append(float(row[2]))
            features.append(float(row[11]))
            xFull.append(features)
            i += 1
            if(len(features) != 62502):
                print("Error!")
        print(i)
        x = np.array(xFull)[:i]
        print(x.shape)
        y = np.array(yFull)[:i]
        print(y.shape)
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
rSquaredScores = {}
#Average recall for each model
avgRSquaredScores = {}
models["Linear_Regression"] = make_pipeline(linear_model.LinearRegression())
models["Lasso_Regression"] = make_pipeline(linear_model.Lasso())
models["SVM_RBF"] = make_pipeline(StandardScaler(), SVR(kernel='rbf'))
models["SVM_LINEAR"] = make_pipeline(StandardScaler(), SVR(kernel='linear'))
models["SVM_POLY"] = make_pipeline(StandardScaler(), SVR(kernel='poly'))
models["SVM_SIGMOID"] = make_pipeline(StandardScaler(), SVR(kernel='sigmoid'))
models["KNN_Neighbor1"] = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=1))
models["KNN_Neighbor3"] = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=3))
models["KNN_Neighbor5"] = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=5))
models["KNN_Neighbor7"] = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=7))
models["KNN_Neighbor9"] = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=9))
models["DescTree_NoMaxDepth"] = DecisionTreeRegressor(max_depth=None)
models["DescTree_MaxDepth100"] = DecisionTreeRegressor(max_depth=100)
models["DescTree_MaxDepth500"] = DecisionTreeRegressor(max_depth=500)
models["DescTree_MaxDepth1000"] = DecisionTreeRegressor(max_depth=1000)
models["RandomForest_MaxTrees50"] = RandomForestRegressor(n_estimators=50)
models["RandomForest_MaxTrees100"] = RandomForestRegressor(n_estimators=100)
models["RandomForest_MaxTrees150"] = RandomForestRegressor(n_estimators=150)
modelTime = timeit.default_timer()
print("Pipeline Made at " + str(modelTime - loadTime) + " seconds\n")

for modelType in models:
    #Iterate through models
    print(modelType)
    model = models[modelType]
    modelTypeBeginTime = timeit.default_timer()
    i = 1
    totalRSquared = 0
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
        #Save Recall score
        print("R Squared SCORE: ")
        rSquared = metrics.r2_score(yTest, attempts)
        print(rSquared)
        rSquaredScores[title] = rSquared
        totalRSquared += rSquared
        thisRun = timeit.default_timer()
        print("Run Completed at " + str(thisRun - runBeginTime) + " seconds.")
        print("")
        i+=1
    modelEndTime = timeit.default_timer()
    avgRSquaredScores[modelType] = totalRSquared/10.0
    print(modelType + " all runs completed at " + str(modelEndTime - modelTypeBeginTime) + " seconds.")

#Get Best Models
sorted_scores = sorted(rSquaredScores.items(), key=lambda kv: kv[1])
sorted_scores.reverse()
rSquaredScores = collections.OrderedDict(sorted_scores)
sorted_avgScores = sorted(avgRSquaredScores.items(), key=lambda kv: kv[1])
sorted_avgScores.reverse()
avgRSquaredScores = collections.OrderedDict(sorted_avgScores)
#Display Models
print("R^2 SCORES GREATEST TO LOWEST:")
for score in rSquaredScores:
    print(score + ": " + str(rSquaredScores[score]))
print("")
print("AVG R^2 SCORES GREATEST TO LOWEST:")
for avgScore in avgRSquaredScores:
    print(avgScore + ": " + str(avgRSquaredScores[avgScore]))
done = timeit.default_timer()
print("")
print("Finished at " + str(done - beginTime) + " seconds")

