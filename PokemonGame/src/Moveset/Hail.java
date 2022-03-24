package Moveset;

import BattleMechanics.Moves;

public class Hail extends Moves {
    public Hail(){
        this.name = "Hail";
        this.type = "Ice";
        this.PP = 10;
        this.weatherChange = true;
        this.savedPP = this.PP;
        this.TMNum = 35;
        this.toWeather = new Weather.Hail();
    }
}
