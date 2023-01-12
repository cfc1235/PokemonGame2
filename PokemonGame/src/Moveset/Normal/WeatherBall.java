package Moveset.Normal;

import BattleMechanics.Moves;
import Weather.Weather;

public class WeatherBall extends Moves {
    public WeatherBall(){
        this.name = "Weather Ball";
        this.power = 50;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.savedPP =  this.PP;
        this.TMNum = 46;
    }

    @Override
    protected void setDamageType(Weather weather) {
        if(weather.showName().equals("Sunny")){
            this.type = "Fire";
        }
        if(weather.showName().equals("Heavy Rain")){
            this.type = "Water";
        }
        if(weather.showName().equals("Hail")){
            this.type = "Ice";
        }
        if(weather.showName().equals("Sandstorm")){
            this.type = "Rock";
        }
    }
}
