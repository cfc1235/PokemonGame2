package Moveset.Poison;

import BattleMechanics.Moves;

public class AcidSpray extends Moves {
    public AcidSpray(){
        this.name = "Acid Spray";
        this.type = "Poison";
        this.power = 40;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 13;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -2;
        this.changeTypeName = " special defense harshly ";
        this.isSpecial = true;
    }
}
