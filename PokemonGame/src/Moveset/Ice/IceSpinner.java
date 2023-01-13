package Moveset.Ice;

import BattleMechanics.Moves;
import Terrain.NormalTerrain;

public class IceSpinner extends Moves {
    public IceSpinner(){
        this.name = "Ice Spinner";
        this.PP = 15;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.toTerrain = new NormalTerrain();
        this.terrainChange = true;
        this.type = "Ice";
        this.dealsDamage = true;
        this.acc = 100;
        this.makesContact = true;
        this.power = 80;
    }
}
