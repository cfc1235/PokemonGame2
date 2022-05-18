package Interfaces;

import Locations.AreaTypes.AreaTypes;
import Locations.BattleLocs.Ocean;
import Locations.WorldMap;
import PlayerMechanics.*;
import Terrain.Terrain;
import UserInterfaces.GameScreen;
import Weather.*;
import Terrain.*;

public class GlobalVariables {
    private final int[] battleCount = new int[898];
    private final GameScreen gameScreen = new GameScreen();
    private final WorldMap worldMap = new WorldMap();
    private Interfaces.TMInventory TMInventory = new TMInventory();
    private BallInventory ballInventory = new BallInventory();
    private PlayerParty party = new PlayerParty();
    private Computer computer = new Computer();
    private Weather weather = new Overcast();
    private AreaMechanics areaType = new Ocean();
    private Terrain terrain = new NormalTerrain();
    private Boolean hasShinyCharm = false;
    private Boolean time = true;
    private Boolean hasSwarmAbility = false;
    private Boolean hasSoundAbility = false;
    private ItemInventory itemInventory = new ItemInventory();
    private Boolean fullRandomizerOn;
    private Boolean isChampion = false;
    private Wallet wallet;
    private Boolean autoCatch;
    private Boolean shinyCheat;
    private Boolean hasFishingRod;

    public GlobalVariables(Boolean isInfinteMoney, Boolean randomizer,
                           Boolean shinyCheat, Boolean autoCatch,
                           Boolean earlyChamp, Boolean fishingCheat){
        this.fullRandomizerOn = randomizer;
        this.shinyCheat = shinyCheat;
        this.autoCatch = autoCatch;
        this.wallet = new Wallet(isInfinteMoney);
        if(earlyChamp) {
            becomeChampion();
        }
        this.hasFishingRod = fishingCheat;
    }

    public Boolean getFishingRod(){return this.hasFishingRod;}
    public void setHasFishingRod(){this.hasFishingRod = true;}
    public Wallet getWallet(){return this.wallet;}
    public void becomeChampion(){
        this.isChampion = true;
        this.hasSwarmAbility = true;
        for(AreaTypes areaType : this.worldMap.getFullMap()){
            areaType.championPokeChances();
        }
    }
    public Boolean getIsChampion(){
        return this.isChampion;
    }
    public Boolean getAutoCatch(){
        return this.autoCatch;
    }
    public Boolean getShinyCheat(){
        return this.shinyCheat;
    }
    public Boolean getFullRandomizerOn(){return this.fullRandomizerOn;}
    public void setRandomizer(Boolean randomizer){this.fullRandomizerOn = randomizer;}
    public ItemInventory getItemInventory(){return this.itemInventory;}
    public void setHasSoundAbility(){this.hasSwarmAbility = true;}
    public Boolean getHasSoundAbility(){return this.hasSoundAbility;}
    public Boolean getHasSwarmAbility(){return this.hasSwarmAbility;}
    //DAY IS TRUE NIGHT IS FALSE
    public void setDay() {
        this.time = true;
        System.out.println("It's Day!");
    }

    public void setNight() {
        this.time = false;
        System.out.println("It's Night!");
    }

    public Boolean getTime() {
        return this.time;
    }

    public Boolean getHasShinyCharm() {
        return this.hasShinyCharm;
    }

    public void setHasShinyCharm() {
        this.hasShinyCharm = true;
    }

    public Weather getWeather() {
        return this.weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public AreaMechanics getAreaType() {
        return this.areaType;
    }

    public void setAreaType(AreaMechanics areaType) {
        this.areaType = areaType;
    }

    public Terrain getTerrain() {
        return this.terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public GameScreen getGameScreen() {
        return this.gameScreen;
    }

    public int[] getBattleCount() {
        return this.battleCount;
    }

    public WorldMap getWorldMap() {
        return this.worldMap;
    }

    public TMInventory getTMInventory() {
        return this.TMInventory;
    }

    public PlayerParty getParty() {
        return this.party;
    }

    public Computer getComputer() {
        return this.computer;
    }

    public void addBattleCount(int ID) {
        this.battleCount[ID] += 1;
    }

    public BallInventory getBallInventory() {
        return this.ballInventory;
    }
}




