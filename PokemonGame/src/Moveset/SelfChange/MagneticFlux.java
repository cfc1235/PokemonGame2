package Moveset.SelfChange;

import BattleMechanics.Moves;

public class MagneticFlux extends Moves {
    public MagneticFlux(){
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Magnetic Flux";
        this.type = "Electric";
        this.StateChangeAlly = true;
        this.affectsSpecDef = true;
        this.MultChange = 1;
        this.affectsPhysDef = true;
        this.changeTypeName = " special and physical defense ";
    }
}
