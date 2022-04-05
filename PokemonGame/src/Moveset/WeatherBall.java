package Moveset;

import BattleMechanics.Moves;

public class WeatherBall extends Moves {
    public WeatherBall(){
        this.name = "Weather Ball";
        this.type = "Normal";
        this.power = 50;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.savedPP =  this.PP;
        this.TMNum = 46;
    }
}
