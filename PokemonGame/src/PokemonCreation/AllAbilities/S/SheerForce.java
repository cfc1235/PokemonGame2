package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

public class SheerForce extends Abilities {
    public SheerForce(){
        this.name = "Sheer Force";
        this.attackerNoSecondary = true;
        this.powersRawDamage = true;
        this.onMoveAddDamage = .3;
    }
}
