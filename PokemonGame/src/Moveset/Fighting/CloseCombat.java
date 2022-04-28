package Moveset.Fighting;

import BattleMechanics.Moves;

public class CloseCombat extends Moves {
    public CloseCombat(){
        this.name = "Close Combat";
        this.type = "Fighting";
        this.power = 120;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;
        this.affectsSpecDef = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special and physical defense ";
    }
}
