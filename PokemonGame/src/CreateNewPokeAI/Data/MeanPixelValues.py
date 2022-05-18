import csv

import numpy as np
from skimage.io import imread
import pickle

def getRGB(image, featureArray):
    readImage = imread(image)
    print(readImage.shape)
    resized = np.resize(readImage, (250, 250, 4))
    features = np.reshape(resized,
        (resized.shape[2] * resized.shape[1] * resized.shape[0]))
    print(features.shape)
    print(features)
    np.save(file=featureArray, arr=features)
    return True

def getGrey(image, featureArray):
    readImage = imread(image, as_gray=True)
    resized = np.resize(readImage, (250, 250))
    print(readImage.shape)
    features = np.reshape(resized,
        (resized.shape[0] * resized.shape[1]))
    print(features.shape)
    print(features)
    np.save(file=featureArray, arr=features)
    return True

def createBasePixelVals(base):
    with open(base + 'CreateNewPokeAI\\Data\\CSVs\\CurrentPokeCSV.csv') as csvFile:
        file = csv.reader(csvFile)
        again = True
        run = 0
        while again:
            again = False
            for row in file:
                name = row[0]
                if 'Name' in row:
                    continue
                imName = row[1]
                image = base + 'GraphicalImages\\Pokemon\\NonShiny\\' + imName
                featureArray = base + 'CreateNewPokeAI\\Data\\ImageFeatures\\RGBBase\\' + name + "RGBFeatures.npy"
                try:
                    np.load(featureArray)
                except FileNotFoundError:
                    again = getRGB(image, featureArray)
                featureArray = base + 'CreateNewPokeAI\\Data\\ImageFeatures\\GreyBase\\' + name + "GreyFeatures.npy"
                try:
                    np.load(featureArray)
                except FileNotFoundError:
                    again = getGrey(image, featureArray)
            print("RUN " + str(run) + " is done")
            run += 1
        print("Feature set built")

