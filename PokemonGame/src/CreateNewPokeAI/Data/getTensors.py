import csv
import pickle

import torch
from torchvision import transforms
from PIL import Image
import numpy as np

def getTensors(base):
    with open(base + 'CreateNewPokeAI\\Data\\CSVs\\CurrentPokeCSV.csv') as csvFile:
        file = csv.reader(csvFile)
        again = True
        run = 0
        convertTensor = transforms.ToTensor()
        while again:
            again = False
            for row in file:
                name = row[0]
                if 'Name' in row:
                    continue
                imName = row[1]
                featureArray = base + 'CreateNewPokeAI\\Data\\ImageFeatures\\TensorsBase\\' + name + "TensorsFeatures.npy"
                try:
                    np.load(featureArray)
                except FileNotFoundError:
                    image = Image.open(base + 'GraphicalImages\\Pokemon\\NonShiny\\' + imName)
                    tensors = convertTensor(image)
                    np.save(file=featureArray, arr=tensors)
                    again = True
            print("RUN " + str(run) + " is done")
            run += 1
        print("Feature set built")
