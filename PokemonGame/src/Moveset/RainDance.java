package Moveset;

import BattleMechanics.Moves;
import Weather.HeavyRain;

public class RainDance extends Moves {
    public RainDance(){
        name = "Rain Dance";
        type = "Water";
        PP = 5;
        weatherChange = true;
        savedPP = PP;
        TMNum = 33;
        toWeather = new HeavyRain();
    }
}
