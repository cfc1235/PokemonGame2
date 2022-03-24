package Moveset;

import BattleMechanics.Moves;

public class EerieImpulse extends Moves {
    public EerieImpulse(){
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Eerie Impulse";
        this.type = "Electric";
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = -2;
        this.changeTypeName = " special attack harshly ";
        this.TMNum = 93;
    }
}
