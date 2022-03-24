package Moveset;

import BattleMechanics.Moves;

import java.util.Collections;

public class Synthesis extends Moves {
    public Synthesis(){
        this.Healally = true;
        this.PP = 5;
        this.savedPP = this.PP;
        this.ReqdWeather = "Sunny Day";
        this.weatherReq = true;
        this.HealAmount = .5;
        this.ModHealAm = .66;
        this.ModHealAm2 = .25;
        Collections.addAll(this.ReqdWeatherDown, "Hail",
                "Rain", "Sandstorm");
        this.weatherReqDown = true;
        this.type = "Grass";
    }
}
