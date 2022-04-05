package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class SnowCloak extends Abilities {
    public SnowCloak(){
        this.changeSelfEvas = true;
        this.changeSelfEvasion = 1;
        this.isMultiplier = true;
        this.WeatherRequirement = true;
        this.WeatherReq = "Hail";
    }
}
