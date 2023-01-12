package Moveset.Normal;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class Return extends Moves {

    public Return(){
        this.name = "Return";
        this.PP = 20;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.type = "Normal";
        this.TMNum = 327;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = (int) (Math.floor((((double) attacker.showHP())/
                        attacker.showSavedHP()) * 120));
    }
}
