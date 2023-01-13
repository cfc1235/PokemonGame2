package PokemonCreation.AllAbilities.B;

import PokemonCreation.Abilities;

public class Battery extends Abilities {
    public Battery(){
        this.name = "Battery";
        this.HealWeather = true;
        this.WeatherReq = "Heavy Rain";
        this.Healback = (1/16.0);
    }
}
