package Moveset.SelfChange;

import BattleMechanics.Moves;

public class AcidArmor extends Moves {
    public AcidArmor(){
        this.name = "Acid Armor";
        this.type = "Poison";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.MultChange = 2;
        this.changeTypeName = " defense sharply";
        this.savedPP = this.PP;
    }
}
