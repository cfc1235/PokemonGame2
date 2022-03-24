package Moveset;

import BattleMechanics.Moves;

public class Toxic extends Moves {

    public Toxic(){
        this.TMNum = 6;
        this.type = "Poison";
        this.PP = 10;
        this.canPoison = true;
        this.CanMiss = true;
        this.acc = 90;
        this.poisonChance = 100;
        this.onlyCanPoison = true;
        this.name = "Toxic";
        this.savedPP = this.PP;
    }
}
