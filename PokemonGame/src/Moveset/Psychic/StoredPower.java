package Moveset.Psychic;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class StoredPower extends Moves {

    public StoredPower(){
        this.name = "Stored Power";
        this.type = "Psychic";
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.acc = 100;
        this.TMNum = 183;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = 20;
        double increases = attacker.showAccMult()
                + attacker.showDefMult() + attacker.showEvasMult()
                + attacker.showSpeedMult() + attacker.showSpecAttMult()
                + attacker.showSpecDefMult();
        this.power += (int) (20 * increases);
    }
}
