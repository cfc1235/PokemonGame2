package Moveset.Electric;

import BattleMechanics.Moves;
import Terrain.Electric;

public class ElectricTerrrain extends Moves {
    public ElectricTerrrain(){
        this.name = "Electric Terrain";
        this.PP = 10;
        this.savedPP = this.PP;
        this.toTerrain = new Electric();
        this.terrainChange = true;
        this.type = "Electric";
        this.TMNum = 90;
    }
}
