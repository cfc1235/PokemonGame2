import pandas as pd
import csv
import pickle
import numpy as np
from sklearn.neighbors import KNeighborsRegressor

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
            yFull.append(float(row[11]))
            name = row[0]
            xBase = np.load('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Data\\ImageFeatures\\GreyBase\\' + name + 'GreyFeatures.npy')
            for feature in xBase:
                features.append(feature)
            features.append(float(row[2]))
            xFull.append(features)
            i += 1
            if(len(features) != 62501):
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
KNN_Neighbor3 = make_pipeline(StandardScaler(), KNeighborsRegressor(n_neighbors=3))
modelTime = timeit.default_timer()
print("Pipeline Made at " + str(modelTime - loadTime) + " seconds\n")
KNN_Neighbor3.fit(x, y)
modelEndTime = timeit.default_timer()
print(modelType + " all runs completed at " + str(modelEndTime - loadTime) + " seconds.")
pickle.dump(KNN_Neighbor3, open('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame'
                                '\\src\\CreateNewPokeAI\\Models\\OfficialModels\\SavedModels'
                                '\\statDistributionModel.model', 'wb'))
done = timeit.default_timer()
print("Finished at " + str(done - beginTime) + " seconds")