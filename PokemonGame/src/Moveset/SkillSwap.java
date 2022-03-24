package Moveset;

import BattleMechanics.Moves;

public class SkillSwap extends Moves {
    public SkillSwap(){
        name = "Skill Swap";
        TMNum = 140;
        PP = 10;
        savedPP = PP;
        type = "Psychic";
        abilitySwap = true;
    }
}
