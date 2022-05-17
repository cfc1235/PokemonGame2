import csv

import numpy as np
from skimage.io import imread
import pickle

def getRGB(image):
    readImage = imread(image)
    features = np.reshape(readImage,
        (readImage.shape[2] * readImage.shape[1] * readImage.shape[0]))
    return features

with open('C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\'
          'src\\CreateNewPokeAI\\Data\\CSVs\\CurrentPokeCSV.csv') as csvFile:
    file = csv.reader(csvFile)
    again = True
    while again:
        again = False
        for row in file:
            print(row)
            name = row[0]
            print(name)
            if 'Name' in row:
                continue
            featureArray = 'ImageFeatures\\' + name + "RGBFeatures.data"
            try:
                pickle.load(open(featureArray, 'rb'))
            except FileNotFoundError:
                imName = row[1]
                image = 'C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame' \
                        '\\src\\GraphicalImages\\Pokemon\\NonShiny\\' + imName
                pickle.dump(getRGB(image), open(featureArray, 'wb'))

