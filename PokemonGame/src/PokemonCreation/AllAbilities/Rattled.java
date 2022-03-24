package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Rattled extends Abilities {

    public Rattled(){
        this.name = "Rattled";
        this.onDealtDamage = true;
        this.requiresType = true;
        Collections.addAll(this.onMultTypes,
                "Bug", "Ghost", "Dark");
        this.changeSelfSpeed = true;
        this.changeSSpeed = 1;
    }
}
