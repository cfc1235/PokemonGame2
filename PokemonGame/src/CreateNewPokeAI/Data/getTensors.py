import csv
import pickle

import torch
from torchvision import transforms
from PIL import Image

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
                featureArray = base + 'CreateNewPokeAI\\Data\\ImageFeatures\\TensorsBase\\' + name + "TensorsFeatures.data"
                try:
                    pickle.load(open(featureArray, 'rb'))
                except FileNotFoundError:
                    image = Image.open(base + 'GraphicalImages\\Pokemon\\NonShiny\\' + imName)
                    tensors = convertTensor(image)
                    pickle.dump(tensors, open(featureArray, 'wb'))
                    again = True
            print("RUN " + str(run) + " is done")
            run += 1
        print("Feature set built")
