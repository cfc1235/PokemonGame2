package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class Whirlpool extends BaseVortex {
    public Whirlpool(){
        dealsDamage = true;
        Name = "Whirlpool";
        lowestTurnLimit = 4;
        MaxTurnLimit = 5;
        damage = 1/8.0;
        cannotLeave = true;
        setTurnLength();
    }
}
