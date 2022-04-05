package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Competitve extends Abilities {
    public Competitve(){
        this.name = "Competitive";
        this.changeSelfSpecAtt = true;
        this.changeSSpecAtt = 2;
        this.onChangingStat = true;
    }
}
