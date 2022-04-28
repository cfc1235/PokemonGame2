package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Charge extends Moves {

    public Charge(){
        this.name = "Charge";
        this.type = "Electric";
        this.PP = 20;
        this.savedPP = this.PP;
        this.chargesElectric = true;
        this.affectsSpecDef = true;
        this.MultChange = 1;
        this.changeTypeName = " special defense ";
    }
}
