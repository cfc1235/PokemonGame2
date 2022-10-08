package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

import java.util.Collections;

public class StrongJaw extends Abilities {
    public StrongJaw(){
        this.name = "Strong Jaw";
        Collections.addAll(this.affectedMoveList,
                "Bite", "Crunch",
                "Fire Fang", "Fishious Rend",
                "Hyper Fang", "Jaw Lock",
                "Ice Fang", "Poison Fang",
                "Psychic Fangs", "ThunderFang");
        this.onMoveAddDamage = .5;
        this.onMove = true;
    }
}
