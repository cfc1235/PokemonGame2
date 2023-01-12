package Moveset.Fire;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class HeatCrash extends Moves {
    public HeatCrash(){
        this.name = "Heat Crash";
        this.type = "Fire";
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 188;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        double weightPerc = defender.showWeight()/
                attacker.showWeight();
        if(weightPerc >= .5){
            this.power = 40;
        }
        if(weightPerc < .5){
            this.power = 60;
        }
        if(weightPerc < .33){
            this.power = 80;
        }
        if(weightPerc < .25){
            this.power = 100;
        }
        if(weightPerc < .20){
            this.power = 120;
        }
    }
}
