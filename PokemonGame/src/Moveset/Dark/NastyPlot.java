package Moveset.Dark;

import BattleMechanics.Moves;

public class NastyPlot extends Moves {

    public NastyPlot(){
        this.name = "Nasty Plot";
        this.type = "Dark";
        this.StateChangeAlly = true;
        this.MultChange = 2;
        this.affectsSpecAtt = true;
        this.changeTypeName = " special attack harshly ";
        this.PP = 20;
        this.savedPP = this.PP;
        this.TMNum = 168;
    }
}
