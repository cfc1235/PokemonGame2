package Moveset.Normal;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class SpitUp extends Moves {

    public SpitUp(){
        this.name = "Spit Up";
        this.PP = 10;
        this.isSpecial = true;
        this.type = "Normal";
        this.savedPP = this.PP;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        if(attacker.getStockpile() == 0){
            this.power = 1;
        }
        if(attacker.getStockpile() == 1){
            this.power = 100;
        }
        if(attacker.getStockpile() == 2){
            this.power = 200;
        }
        if(attacker.getStockpile() == 3){
            this.power = 300;
        }
        attacker.resetStockpile();
    }
}
