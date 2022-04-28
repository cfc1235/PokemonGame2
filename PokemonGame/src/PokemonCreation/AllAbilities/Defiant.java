package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class Defiant extends Abilities {
    public Defiant(){
        this.name = "Defiant";
        this.changeSelfAtt = true;
        this.changeSAtt = 2;
        this.onStatChange = true;
        this.positiveMultChange = false;
    }
}
