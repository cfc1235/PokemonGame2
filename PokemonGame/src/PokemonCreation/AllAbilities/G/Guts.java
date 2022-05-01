package PokemonCreation.AllAbilities.G;

import PokemonCreation.Abilities;

public class Guts extends Abilities {
    public Guts(){
        this.name = "Guts";
        this.onAllStat = true;
        this.changeSAtt = 1.5;
        this.changeSelfAtt = true;
        this.isMultiplier = true;
    }
}
