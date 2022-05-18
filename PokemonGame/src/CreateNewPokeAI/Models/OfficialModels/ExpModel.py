#For set Management
import collections
#For Time Management
import timeit
#ML Models, pipeline, and classifications
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.ensemble import RandomForestRegressor
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
#Loading Time
loadTime = timeit.default_timer()
print("Data Loaded at " + str(loadTime - beginTime) + " seconds")
#Create Models as dictionary of model name, model Type
print("Creating Models")
RandomForest_MaxTrees100 = RandomForestRegressor(n_estimators=100)
modelTime = timeit.default_timer()
print("Pipeline Made at " + str(modelTime - loadTime) + " seconds\n")
RandomForest_MaxTrees100.fit(x, y)
modelEndTime = timeit.default_timer()
print(modelType + " all runs completed at " + str(modelEndTime - loadTime) + " seconds.")
pickle.dump(RandomForest_MaxTrees100, open('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame'
                                '\\src\\CreateNewPokeAI\\Models\\OfficialModels\\SavedModels'
                                '\\EXPModel.model', 'wb'))
done = timeit.default_timer()
print("Finished at " + str(done - beginTime) + " seconds")