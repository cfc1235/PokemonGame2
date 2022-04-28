package Moveset.Rock;

import BattleMechanics.Moves;

public class Sandstorm extends Moves {

    public Sandstorm(){
        this.name = "Sandstorm";
        this.type = "Rock";
        this.PP = 10;
        this.weatherChange = true;
        this.savedPP = this.PP;
        this.TMNum = 32;
        this.toWeather = new Weather.Sandstorm();
    }
}
