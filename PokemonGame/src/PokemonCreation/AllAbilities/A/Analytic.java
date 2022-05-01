package PokemonCreation.AllAbilities.A;

import PokemonCreation.Abilities;

public class Analytic extends Abilities {
    public Analytic(){
        this.name = "Analytic";
        this.changeSAtt = 1.3;
        this.changeSelfAtt = true;
        this.onDealingDamage = true;
        this.speedTime = false;
        this.needsSpeedTime = true;
    }
}
