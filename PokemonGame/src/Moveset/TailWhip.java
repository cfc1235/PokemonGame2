package Moveset;

import BattleMechanics.Moves;

public class TailWhip extends Moves {
    public TailWhip() {
        this.name = "Tail Whip";
        this.type = "Normal";
        this.PP = 30;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = "defense";
        this.savedPP = this.PP;
    }
}
