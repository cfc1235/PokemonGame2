package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class Tailwind extends BaseVortex {
    public Tailwind(){
        this.Name = "Tailwind";
        this.vortexSpeed = true;
        this.noRandomLength = true;
        this.turnLength = 4;
    }
}
