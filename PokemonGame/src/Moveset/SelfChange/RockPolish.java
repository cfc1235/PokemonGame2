package Moveset.SelfChange;

import BattleMechanics.Moves;

public class RockPolish extends Moves {
    public RockPolish(){
        this.name = "Rock Polish";
        this.type = "Rock";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = 2;
        this.changeTypeName = " speed sharply ";
        this.savedPP = this.PP;
        this.TMNum = 269;
    }
}
