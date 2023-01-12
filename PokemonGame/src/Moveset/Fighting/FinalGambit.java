package Moveset.Fighting;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class FinalGambit extends Moves {
    public FinalGambit(){
        this.name = "Final Gambit";
        this.type = "Fighting";
        this.PP = 5;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = 1;
        this.savedPP = this.PP;
        this.isSpecial = true;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = attacker.showHP();
    }
}
