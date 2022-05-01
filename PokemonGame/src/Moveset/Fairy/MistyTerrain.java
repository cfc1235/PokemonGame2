package Moveset.Fairy;

import BattleMechanics.Moves;
import Terrain.Misty;

public class MistyTerrain extends Moves {
    public MistyTerrain(){
        this.name = "Misty Terrain";
        this.PP = 10;
        this.savedPP = this.PP;
        this.toTerrain = new Misty();
        this.terrainChange = true;
        this.type = "Fairy";
        this.TMNum = 89;
    }
}
