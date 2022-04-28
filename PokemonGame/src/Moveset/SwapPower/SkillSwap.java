package Moveset.SwapPower;

import BattleMechanics.Moves;

public class SkillSwap extends Moves {
    public SkillSwap(){
        this.name = "Skill Swap";
        this.TMNum = 140;
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Psychic";
        this.abilitySwap = true;
    }
}
