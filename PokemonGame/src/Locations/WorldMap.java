package Locations;

import Locations.AreaTypes.*;

public class WorldMap {
    private AreaTypes home;
    private AreaTypes homeTown;
    private AreaTypes route1;
    private AreaTypes firstTown;
    private AreaTypes center1;
    private Boolean lostBattle = false;

    public WorldMap(){
        home = new Home();
        homeTown = new HomeTown();
        route1 = new Route1();
        firstTown = new FirstTown();
        center1 = new PokemonCenter1();

        home.addToNextArea(homeTown);
        home.addToTotalAreas(homeTown);

        homeTown.addToPreviousArea(home);
        homeTown.addToNextArea(route1);
        homeTown.addToTotalAreas(home);
        homeTown.addToTotalAreas(route1);

        route1.addToPreviousArea(homeTown);
        route1.addToNextArea(firstTown);
        route1.addToTotalAreas(homeTown);
        route1.addToTotalAreas(firstTown);

        firstTown.addToPreviousArea(route1);
        firstTown.addToNextArea(center1);
        firstTown.addToTotalAreas(firstTown);
        firstTown.addToTotalAreas(center1);

        center1.addToPreviousArea(firstTown);
        center1.addToTotalAreas(firstTown);


    }

    public AreaTypes goHome(){
        return home;
    }

    public Boolean getLostBattle(){return lostBattle;}
    public void setLostBattle(){lostBattle = true;}
    public void resetLostBattle(){lostBattle = false;}
}
