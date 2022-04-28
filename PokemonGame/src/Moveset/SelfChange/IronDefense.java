package Moveset.SelfChange;

import BattleMechanics.Moves;

public class IronDefense extends Moves {
    public IronDefense(){
        this.name = "Iron Defense";
        this.type = "Steel";
        this.PP = 15;
        this.StateChangeAlly = true;
        this.affectsPhysDef =true;
        this.MultChange = 2;
        this.changeTypeName = " defense sharply ";
        this.savedPP = this.PP;
        this.TMNum = 146;
    }
}
