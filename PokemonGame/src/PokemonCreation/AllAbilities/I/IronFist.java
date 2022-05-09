package PokemonCreation.AllAbilities.I;

import PokemonCreation.Abilities;

import java.util.Collections;

public class IronFist extends Abilities {

    public IronFist(){
        this.name = "Iron Fist";
        Collections.addAll(this.affectedMoveList,
                "Bullet Punch", "Comet Punch",
                "Dizzy Punch", "Double Iron Bash",
                "Drain Punch", "Dynamic Punch",
                "Fire Punch", "Focus Punch",
                "Hammer Arm", "Ice Hammer", "Ice Punch",
                "Mach Punch", "Mega Punch", "Meteor Mash",
                "Power-Up Punch", "Shadow Punch",
                "Sky Uppercut", "Thunderpunch");
        this.onMoveAddDamage = .2;
        this.onMove = true;
    }
}
