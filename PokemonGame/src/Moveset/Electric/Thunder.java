package Moveset.Electric;

import BattleMechanics.Moves;
import Weather.Weather;

public class Thunder extends Moves {

    public Thunder(){
        this.TMNum = 109;
        this.name = "Thunder";
        this.type = "Electric";
        this.PP = 10;
        this.CanMiss = true;
        this.acc = 70;
        this.canParalyze = true;
        this.paralysisChance = 30;
        this.power = 110;
        this.isSpecial = true;
    }

    @Override
    protected void setDamageAcc(Weather weather) {
        if(weather.showName().equals("Rain")){
            this.acc = 100;
        }
        if(weather.showName().equals("Sunshine")){
            this.acc = 50;
        }
        else {
            this.acc = 70;
        }
    }
}
