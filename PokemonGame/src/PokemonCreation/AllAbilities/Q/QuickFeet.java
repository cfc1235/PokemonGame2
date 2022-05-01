package PokemonCreation.AllAbilities.Q;

import PokemonCreation.Abilities;

public class QuickFeet extends Abilities {
    public QuickFeet(){
        this.name = "Quick Feet";
        this.onAllStat = true;
        this.ignoresParalysisSpeed = true;
        this.changeSelfSpeed = true;
        this.changeSSpeed = 1.5;
    }
}
