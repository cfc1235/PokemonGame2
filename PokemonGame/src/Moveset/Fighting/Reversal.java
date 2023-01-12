package Moveset.Fighting;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class Reversal extends Moves {

    public Reversal(){
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Reversal";
        this.type = "Fighting";
        this.TMNum = 121;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        double HPPerc = ((double) attacker.showHP()/attacker.showSavedHP()) * 100;
        if (HPPerc >= 67.16) {
            this.power = 20;
        } else if (HPPerc >= 34.38) {
            this.power = 40;
        } else if (HPPerc >= 20.31) {
            this.power = 80;
        } else if (HPPerc >= 9.38) {
            this.power = 100;
        } else if (HPPerc >= 3.13) {
            this.power = 150;
        } else {
            this.power = 200;
        }
    }
}
