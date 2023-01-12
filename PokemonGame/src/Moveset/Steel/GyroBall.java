package Moveset.Steel;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class GyroBall extends Moves {
    public GyroBall(){
        this.name = "Gyro Ball";
        this.type = "Steel";
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 152;
    }

    @Override
    protected void setDamage(Pokemon attacker, Pokemon defender,
                             Moves enemyMove, int lastDamage) {
        this.power = 25 * (defender.showSpeed(
                enemyMove.getSpeedPriority()) /
                attacker.showSpeed(this.speedPriority));
    }
}
