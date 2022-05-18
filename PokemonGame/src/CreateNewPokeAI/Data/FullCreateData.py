import dataToCSV
import MeanPixelValues
import getTensors

base='C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\'
dataToCSV.createCSV(base)
MeanPixelValues.createBasePixelVals(base)
getTensors.getTensors(base)

