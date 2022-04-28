package Moveset.Fighting;

import BattleMechanics.Moves;

public class Counter extends Moves {

    public Counter() {
        this.name = "Counter";
        this.type = "Fighting";
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.speedPriority = -5;
        this.retaliatingMove = true;
    }

    @Override
    public void createPower(int power) {
        if (power == 0){
            this.power = 1;
        }
        else {
            this.power = 2 * power;
            if(this.power > 75){
                this.power = 75;
            }
        }
    }
}
