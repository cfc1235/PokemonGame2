package Moveset;

import BattleMechanics.Moves;

public class Sandstorm extends Moves {

    public Sandstorm(){
        this.name = "Sandstorm";
        this.type = "Rock";
        this.PP = 10;
        this.weatherChange = true;
        this.savedPP = this.PP;
        this.TMNum = 237;
        this.toWeather = new Weather.Sandstorm();
    }
}
