package Moveset.Ice;

import BattleMechanics.Moves;
import Weather.Snowstorm;

public class Snowscape extends Moves {
    public Snowscape(){
        this.name = "Snowscape";
        this.type = "Ice";
        this.PP = 10;
        this.weatherChange = true;
        this.savedPP = this.PP;
        this.toWeather = new Snowstorm();
    }
}
