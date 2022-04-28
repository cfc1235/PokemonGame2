package Moveset.Normal;

import BattleMechanics.Moves;

public class EchoedVoice extends Moves {

    public EchoedVoice(){
        this.name = "Echoed Voice";
        this.type = "Normal";
        this.isSpecial = true;
        this.dealsDamage = true;
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.power = 55;
    }
}
