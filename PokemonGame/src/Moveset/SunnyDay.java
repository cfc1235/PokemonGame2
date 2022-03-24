package Moveset;

import BattleMechanics.Moves;
import Weather.Sunny;

public class SunnyDay extends Moves {
    public SunnyDay(){
        this.name = "Sunny Day";
        this.type = "Fire";
        this.PP = 5;
        this.weatherChange = true;
        this.savedPP = PP;
        this.TMNum = 34;
        this.toWeather = new Sunny();
    }

}
