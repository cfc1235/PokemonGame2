package Moveset.Electric;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class ElectroBall extends Moves {
    public ElectroBall(){
        this.name = "Electro Ball";
        this.acc = 100;
        this.type = "Electric";
        this.PP = 10;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.TMNum = 180;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        double targetSpeedPerc = (double) defender.showSpeed(1)/
                attacker.showSpeed(1);
        if(targetSpeedPerc > .5){
            this.power = 60;
        }
        else if(targetSpeedPerc > .33){
            this.power = 80;
        }
        else if(targetSpeedPerc > .25){
            this.power = 120;
        }
        else{
            this.power = 150;
        }
    }
}
