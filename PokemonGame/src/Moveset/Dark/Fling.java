package Moveset.Dark;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class Fling extends Moves {
    public Fling(){
        this.name = "Fling";
        this.type = "Dark";
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 59;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = attacker.showItem().showFlingDamage();
        attacker.showItem().useBerry(defender,
                false, defender.showAbility().showName());
    }
}
