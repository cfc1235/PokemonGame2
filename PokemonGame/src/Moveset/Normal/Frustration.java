package Moveset.Normal;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class Frustration extends Moves {

    public Frustration(){
        this.name = "Frustration";
        this.PP = 20;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.type = "Normal";
        this.TMNum = 321;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = (int) Math.floor((attacker.showSavedHP() -
                (attacker.showSavedHP() - attacker.showHP()))/1.5);
    }
}
