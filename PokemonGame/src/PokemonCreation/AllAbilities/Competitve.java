package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Competitve extends Abilities {
    public Competitve(){
        this.name = "Competitive";
        this.changeSelfAcc = true;
        this.changeSelfAccuracy = 2;
        this.onStatChange = true;
        this.positiveMultChange = false;
    }
}
