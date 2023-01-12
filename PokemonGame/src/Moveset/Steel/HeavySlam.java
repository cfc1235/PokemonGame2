package Moveset.Steel;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class HeavySlam extends Moves {
    public HeavySlam(){
        this.name = "Heavy Slam";
        this.type = "Steel";
        this.makesContact = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.TMNum = 179;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        double weightPerc = defender.showWeight()/attacker.showWeight();
        if(weightPerc <= .2){
            this.power = 120;
        }
        else if(weightPerc <= .25){
            this.power = 100;
        }
        else if(weightPerc <= .33){
            this.power = 80;
        }
        else if(weightPerc <= .5){
            this.power = 60;
        }
        else {
            this.power = 40;
        }
    }
}
