package Moveset.SelfChange;

import BattleMechanics.Moves;

public class ShellSmash extends Moves {
    public ShellSmash(){
        this.name = "Shell Smash";
        this.type = "Normal";
        this.PP = 15;
        this.StateChangeAlly = true;
        this. affectsPhysDef = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = "defense and special defense ";
        this.savedPP = this.PP;
        this.statChangeAlly2 = true;
        this.affectsPhysAtt2 = true;
        this.affectsSpecAtt2 = true;
        this.affectsSpeed2 = true;
        this.MultChange2 = 2;
        this.changeTypeName2 = "speed, attack, and special attack harshly ";
    }
}
