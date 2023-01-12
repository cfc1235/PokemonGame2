package Moveset.Psychic;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class MirrorCoat extends Moves {
    public MirrorCoat() {
        this.name = "Mirror Coat";
        this.type = "Psychic";
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = lastDamage * 2;
    }
}
