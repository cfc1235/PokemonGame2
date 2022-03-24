package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class RainDish extends Abilities {
    public RainDish(){
        this.name = "Rain Dish";
        this.HealWeather = true;
        this.WeatherReq = "Heavy Rain";
        this.Healback = (1/16.0);
    }
}
