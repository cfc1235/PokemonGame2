package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

public class SolarPower extends Abilities{
    public SolarPower(){
        this.name = "Solar Power";
        this.WeatherReq = "Sunny";
        this.Healback = (1/8.0);
        this.HealWeather = true;
        this.WeatherRequirement = true;
        this.changeSelfSpecAtt = true;
        this.changeSSpecAtt = 1.5;
        this.DealSelf = true;
        this.isMultiplier = true;
    }
}
