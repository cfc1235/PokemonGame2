package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

public class SandRush extends Abilities {
    public SandRush(){
        this.name = "Sand Rush";
        this.WeatherReq = "Sandstorm";
        this.WeatherRequirement = true;
        this.changeSelfSpeed = true;
        this.changeSSpeed = 2.0;
        this.isMultiplier = true;
    }
}
