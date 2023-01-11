package PokemonCreation.AllAbilities.D;

import PokemonCreation.Abilities;
import Weather.HeavyRain;

public class Drizzle extends Abilities {
    public Drizzle(){
        this.name = "Drizzle";
        this.weatherOnThrow = new HeavyRain();
        this.throwWeather = true;
    }
}
