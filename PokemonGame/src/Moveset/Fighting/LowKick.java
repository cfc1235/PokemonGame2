package Moveset.Fighting;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class LowKick extends Moves {
    public LowKick(){
        this.name = "Low Kick";
        this.type = "Fighting";
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 107;
    }
    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage){
        if(defender.showWeight() < 22){
            this.power = 20;
        }
        if(defender.showWeight() >= 22){
            this.power = 40;
        }
        if(defender.showWeight() >= 55){
            this.power = 60;
        }
        if(defender.showWeight() >= 110){
            this.power = 80;
        }
        if(defender.showWeight() >= 220){
            this.power = 100;
        }
        if(defender.showWeight() >= 440){
            this.power = 120;
        }
    }
}
