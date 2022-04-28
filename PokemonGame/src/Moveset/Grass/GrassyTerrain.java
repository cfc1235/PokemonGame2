package Moveset.Grass;

import BattleMechanics.Moves;
import Terrain.Grassy;

public class GrassyTerrain extends Moves {
    public GrassyTerrain(){
        this.name = "Grassy Terrain";
        this.PP = 10;
        this.CanMiss = false;
        this.savedPP = this.PP;
        this.toTerrain = new Grassy();
        this.terrainChange = true;
        this.type = "Grass";
        this.TMNum = 88;
    }
}
