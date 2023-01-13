package Locations;

import Locations.AreaTypes.*;

import java.util.ArrayList;
import java.util.Collections;

public class WorldMap {
    private AreaTypes home;
    private AreaTypes homeTown;
    private AreaTypes route1;
    private AreaTypes firstTown;
    private AreaTypes center1;
    private Boolean lostBattle = false;
    private ArrayList<AreaTypes> fullMap;

    public WorldMap(){
        this.fullMap = new ArrayList<>();
        this.home = new Home();
        this.homeTown = new HomeTown();
        this.route1 = new Route1();
        this.firstTown = new FirstTown();
        this.center1 = new PokemonCenter1();
        this.createMap();
    }

    public void createMap(){
        this.home.addToNextArea(this.homeTown);
        this.home.addToTotalAreas(this.homeTown);

        this.homeTown.addToPreviousArea(this.home);
        this.homeTown.addToNextArea(this.route1);
        this.homeTown.addToTotalAreas(this.home);
        this.homeTown.addToTotalAreas(this.route1);

        this.route1.addToPreviousArea(this.homeTown);
        this.route1.addToNextArea(this.firstTown);
        this.route1.addToTotalAreas(this.homeTown);
        this.route1.addToTotalAreas(this.firstTown);

        this.firstTown.addToPreviousArea(this.route1);
        this.firstTown.addToNextArea(this.center1);
        this.firstTown.addToTotalAreas(this.firstTown);
        this.firstTown.addToTotalAreas(this.center1);

        this.center1.addToPreviousArea(this.firstTown);
        this.center1.addToTotalAreas(this.firstTown);

        Collections.addAll(this.fullMap, this.home, this.homeTown,
                this.route1, this.firstTown, this.center1);
    }
    public ArrayList<AreaTypes> getFullMap(){return this.fullMap;}

    public AreaTypes goHome(){
        return this.home;
    }

    public Boolean getLostBattle(){return this.lostBattle;}
    public void setLostBattle(){this.lostBattle = true;}
    public void resetLostBattle(){this.lostBattle = false;}
}
