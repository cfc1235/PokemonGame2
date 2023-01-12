package Moveset.Ghost;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class NightShade extends Moves {

    public NightShade(){
        this.name = "Night Shade";
        this.type = "Ghost";
        this.acc = 100;
        this.CanMiss = true;
        this.isSpecial = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = attacker.showLevel();
    }
}
