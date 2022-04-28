package Moveset.SelfChange;

import BattleMechanics.Moves;

public class FollowMe extends Moves {
    public FollowMe(){
        this.name = "Follow Me";
        this.type = "Normal";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = 2;
        this.changeTypeName = " speed ";
        this.savedPP = this.PP;
    }
}
