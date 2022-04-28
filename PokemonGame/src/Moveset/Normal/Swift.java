package Moveset.Normal;

import BattleMechanics.Moves;

public class Swift extends Moves {
    public Swift(){
        this.name = "Swift";
        this.type = "Normal";
        this.power = 60;
        this.PP = 20;
        this.dealsDamage = true;
        this.savedPP = this.PP;
        this.TMNum = 40;
        this.isSpecial = true;
        this.makesContact =true;
    }
}
