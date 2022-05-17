import csv

import numpy as np
from skimage.io import imread
import pickle

def getRGB(image, featureArray):
    readImage = imread(image)
    features = np.reshape(readImage,
        (readImage.shape[2] * readImage.shape[1] * readImage.shape[0]))
    pickle.dump(features, open(featureArray, 'wb'))
    return True

def getGrey(image, featureArray):
    readImage = imread(image, as_gray=True)
    features = np.reshape(readImage,
        (readImage.shape[0] * readImage.shape[1]))
    pickle.dump(features, open(featureArray, 'wb'))
    return True

def createBasePixelVals():
    with open('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\'
              'src\\CreateNewPokeAI\\Data\\CSVs\\CurrentPokeCSV.csv') as csvFile:
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
                image = 'C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame' \
                        '\\src\\GraphicalImages\\Pokemon\\NonShiny\\' + imName
                featureArray = 'ImageFeatures\\RGBBase' + name + "RGBFeatures.data"
                try:
                    pickle.load(open(featureArray, 'rb'))
                except FileNotFoundError:
                    again = getRGB(image, featureArray)
                featureArray = 'ImageFeatures\\GreyBase' + name + "GreyFeatures.data"
                try:
                    pickle.load(open(featureArray, 'rb'))
                except FileNotFoundError:
                    again = getGrey(image, featureArray)
                print("RUN " + str(run) + " is done")
        print("Feature set built")

