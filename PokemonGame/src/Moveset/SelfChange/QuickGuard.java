package Moveset.SelfChange;

import BattleMechanics.Moves;

public class QuickGuard extends Moves {
    public QuickGuard(){
        this.type = "Fighting";
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Quick Guard0";
    }
}
