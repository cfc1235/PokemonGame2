import pandas as pd


def createCSV(data):
    readFile = pd.read_excel(data + '\\Data\\CSVs\\CurrentPokeEditable.xlsx').fillna(value = 0.0)
    readFile.to_csv(data + '\\Data\\CSVs\\CurrentPokeCSV.csv', header=True, index=False)





