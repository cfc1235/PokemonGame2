package Moveset.SwapPower;

import BattleMechanics.Moves;
import PokemonCreation.Pokemon;

public class SpeedSwap extends Moves {
    public SpeedSwap(){
        this.name = "Speed Swap";
        this.type = "Psychic";
        this.swapPower = true;
        this.swapSpeed = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 62;
    }
}
