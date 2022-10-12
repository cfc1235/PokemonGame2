package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Block extends Moves {
    public Block(){
        this.name = "Block";
        this.causesCannotFlee = true;
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Normal";
    }
}
