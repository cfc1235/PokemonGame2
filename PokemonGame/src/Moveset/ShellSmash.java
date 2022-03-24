package Moveset;

import BattleMechanics.Moves;

public class ShellSmash extends Moves {
    public ShellSmash(){
        name = "Shell Smash";
        type = "Normal";
        PP = 15;
        StateChangeAlly = true;
        affectsPhysDef = true;
        affectsSpecDef = true;
        MultChange = -1;
        changeTypeName = "defense and special defense ";
        savedPP = PP;
        statChangeAlly2 = true;
        affectsPhysAtt2 = true;
        affectsSpecAtt2 = true;
        affectsSpeed2 = true;
        MultChange2 = 2;
        changeTypeName2 = "speed, attack, and special attack harshly ";
    }
}
