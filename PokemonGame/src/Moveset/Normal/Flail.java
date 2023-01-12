package Moveset.Normal;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class Flail extends Moves {
    public Flail(){
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Flail";
        this.type = "Normal";
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        double HPPerc = ((double) attacker.showHP()/attacker.showSavedHP()) * 100;
        if (HPPerc >= 68.75) {
            this.power = 20;
        } else if (HPPerc >= 35.42) {
            this.power = 40;
        } else if (HPPerc >= 20.83) {
            this.power = 80;
        } else if (HPPerc >= 10.42) {
            this.power = 100;
        } else if (HPPerc >= 4.17) {
            this.power = 150;
        } else {
            this.power = 200;
        }
    }
}
