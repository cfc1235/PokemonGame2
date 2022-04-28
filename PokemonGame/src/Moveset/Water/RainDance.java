package Moveset.Water;

import BattleMechanics.Moves;
import Weather.HeavyRain;

public class RainDance extends Moves {
    public RainDance(){
        this.name = "Rain Dance";
        this.type = "Water";
        this.PP = 5;
        this.weatherChange = true;
        this.savedPP = this.PP;
        this.TMNum = 33;
        this.toWeather = new HeavyRain();
    }
}
