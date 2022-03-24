package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class Chlorophyll extends Abilities {
    public Chlorophyll(){
        this.name = "Chlorophyll";
        this.WeatherReq = "Sunny";
        this.changeSelfSpeed = true;
        this.changeSSpeed = 2;
        this.onStart = true;
    }
}
