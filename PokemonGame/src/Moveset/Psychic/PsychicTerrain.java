package Moveset.Psychic;

import BattleMechanics.Moves;
import Terrain.Psychic;

public class PsychicTerrain extends Moves {
    public PsychicTerrain(){
        this.name = "Psychic Terrain";
        this.PP = 10;
        this.CanMiss = false;
        this.savedPP = this.PP;
        this.toTerrain = new Psychic();
        this.terrainChange = true;
        this.type = "Psychic";
        this.TMNum = 91;
    }
}
