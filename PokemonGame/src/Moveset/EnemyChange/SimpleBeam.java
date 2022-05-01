package Moveset.EnemyChange;

import BattleMechanics.Moves;
import PokemonCreation.AllAbilities.S.Simple;

public class SimpleBeam extends Moves {
    public SimpleBeam(){
        this.name = "Simple Beam";
        this.PP = 15;
        this.savedPP = this.PP;
        this.affectsAbilities = true;
        this.toAbility = new Simple();
        this.type = "Normal";
    }
}
