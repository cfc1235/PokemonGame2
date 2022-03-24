package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class Hustle extends Abilities {

    public Hustle(){
        this.name = "Hustle";
        this.changeSelfAtt = true;
        this.changeSAtt = 1.5;
        this.changeSelfAcc = true;
        this.changeSelfAccuracy = .8;
        this.requiresPhys = true;
        this.isMultiplier = true;
    }
}
