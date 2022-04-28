package Moveset.Poison;

import BattleMechanics.Moves;

public class Toxic extends Moves {

    public Toxic(){
        this.TMNum = 206;
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
