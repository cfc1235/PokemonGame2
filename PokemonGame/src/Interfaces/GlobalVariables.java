package Interfaces;

import Locations.BattleLocs.Ocean;
import Locations.WorldMap;
import PlayerMechanics.*;
import Terrain.Terrain;
import UserInterfaces.GameScreen;
import Weather.*;
import Terrain.*;

public class GlobalVariables {
    private int[] battleCount = new int[898];
    private GameScreen gameScreen = new GameScreen();
    private WorldMap worldMap = new WorldMap();
    private PlayerMechanics.TMInventory TMInventory = new TMInventory();
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

    public ItemInventory getItemInventory(){return this.itemInventory;}
    public void setHasSoundAbility(){this.hasSwarmAbility = true;}
    public Boolean getHasSoundAbility(){return this.hasSoundAbility;}
    public void setHasSwarmAbility(){this.hasSwarmAbility = true;}
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
        return time;
    }

    public Boolean getHasShinyCharm() {
        return hasShinyCharm;
    }

    public void setHasShinyCharm() {
        hasShinyCharm = true;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public AreaMechanics getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaMechanics areaType) {
        this.areaType = areaType;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public int[] getBattleCount() {
        return battleCount;
    }

    public WorldMap getWorldMap() {
        return worldMap;
    }

    public TMInventory getTMInventory() {
        return TMInventory;
    }

    public PlayerParty getParty() {
        return party;
    }

    public Computer getComputer() {
        return computer;
    }

    public void addBattleCount(int ID) {
        battleCount[ID] += 1;
    }

    public BallInventory getBallInventory() {
        return ballInventory;
    }
}




