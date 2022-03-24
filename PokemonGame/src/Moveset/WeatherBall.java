package Moveset;

import BattleMechanics.Moves;

public class WeatherBall extends Moves {
    public WeatherBall(){
        name = "Weather Ball";
        type = "Normal";
        power = 50;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        savedPP = PP;
        TMNum = 46;
    }
}
