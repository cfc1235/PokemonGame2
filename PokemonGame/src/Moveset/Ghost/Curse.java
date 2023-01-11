package Moveset.Ghost;

import BattleMechanics.Moves;

public class Curse extends Moves {
    public Curse(){
        this.name = "Curse";
        this.type = "Ghost";
        this.PP = 10;
        this.savedPP = this.PP;
    }

    public void isCurse(String type1, String type2){
        if(type1.equals("Ghost") || type2.equals("Ghost")){
            this.cutHPBy = .5;
            this.createCurse = true;
        }
        else {
            this.StateChangeAlly = true;
            this.affectsSpeed = true;
            this.MultChange = -1;
            this.changeTypeName = " speed ";
            this.statChangeAlly2 = true;
            this.affectsPhysAtt2 = true;
            this.affectsPhysDef2 = true;
            this.MultChange2 = 1;
            this.changeTypeName2 = " attack and defense ";
        }
    }
}
