import pickle
import CreateNewPokeAI.Data.getTensors
import CreateNewPokeAI.Data.MeanPixelValues

baseModel = 'C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Models\\OfficialModels\\SavedModels\\'
weightModel = pickle.load(open(baseModel + "weightModel.model", 'rb'))
distributionModel = pickle.load(open(baseModel + "distributionModel.model", 'rb'))
diffusionModel = pickle.load(open(baseModel + "diffusionModel.model", 'rb'))
typeModel = pickle.load(open(baseModel + "typeModel.model", 'rb'))
EXPModel = pickle.load(open(baseModel + "EXPModel.model", 'rb'))
legendaryModel = pickle.load(open(baseModel + "legendaryModel.model", 'rb'))
captureRateModel = pickle.load(open(baseModel + "captureRateModel.model", 'rb'))
statDistributionModel = pickle.load(open(baseModel + "statDistributionModel.model", 'rb'))
randomStats = pickle.load(open(baseModel + "randomStats.model", 'rb'))
creations = {}

def getRawPixels(xBase):
    features = []
    for feature in xBase:
        features.append(feature)
    x = np.array(features)[:i]
    return x

def statDistribution(xBase, isLegendary):
    features = []
    for feature in xBase:
        features.append(feature)
    features.append(isLegendary)
    x = np.array(features)[:i]
    return x

def EXPCaptureDistribution(xBase, isLegendary, Stats):
    features = []
    for feature in xBase:
        features.append(feature)
    features.append(isLegendary)
    features.append(Stats)
    x = np.array(features)[:i]
    return x

times = input("How many times would you like to run?")
times = int(times)
i = 1
while i <= times:
    title = "Creation " + str(i)
    creation = {}
    image = diffusionModel.predict()
    saveArea = 'C:\\Users\\chris\\IdeaProjects\\PokemonGame2\\PokemonGame\\src\\CreateNewPokeAI\\Models\\results\\'
    pickle.dump(image, open(saveArea + title + ".png", 'wb'))
    saveGrey = saveArea + title + "GreyFeatures.npy"
    saveRGB = saveArea + title + "RGBFeatures.npy"
    xGrayScale = CreateNewPokeAI.Data.MeanPixelValues.getGrey(image, saveGrey)
    xRGB = CreateNewPokeAI.Data.MeanPixelValues.getGrey(image, saveRGB)
    rawRGB = getRawPixels(xRGB)
    rawGrey = getRawPixels(xGrayScale)
    isLegendary = legendaryModel.predict(rawGrey)
    newWeight = weightModel.predict(rawGrey)
    type1, type2 = typeModel.predict(rawRGB)
    distributionType = distributionModel.predict(rawRGB)
    statDistributionTotal = statDistributionModel.predict(statDistribution(rawGrey, isLegendary))
    expCapture = EXPCaptureDistribution(rawGrey, isLegendary, statDistributionTotal)
    captureRate = captureRateModel.predict(expCapture)
    expYield = EXPModel.predict(expCapture)
    HP, physAtt, specAtt, physDef, specDef, Speed = randomStats.getStats(statDistributionTotal, distributionType)
    creation["Title"] = title
    creation["Legendary"] = isLegendary
    creation["Weight"] = newWeight
    creation["Type 1"] = type1
    creation["Type 2"] = type2
    creation["Distribution Type"] = distributionType
    creation["Stat Total"] = statDistributionTotal
    creation["EXP"] = expYield
    creation["Capture Rate"] = captureRate
    creation["HP"] = HP
    creation["Att"] = physAtt
    creation["Def"] = physDef
    creation["Spec Att"] = specAtt
    creation["Spec Def"] = specDef
    creation["Speed"] = Speed
    creations[title] = creation
    i += 1
for creation in creations:
    for stats in creation:
        print(stats)
    print("")
