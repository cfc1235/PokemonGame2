package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

public class SwiftSwim extends Abilities {
    public SwiftSwim(){
        this.name = "Swift Swim";
        this.WeatherReq = "Rain";
        this.WeatherRequirement = true;
        this.changeSelfSpeed = true;
        this.changeSSpeed = 2;
        this.DealSelf = true;
        this.isMultiplier = true;
    }
}
