package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class Berserk extends Abilities {
    public Berserk(){
        this.name = "Berserk";
        this.HPReq = (1/2.0);
        this.hasReqsinDamage = true;
        this.onDealtDamage = true;
        this.changeSelfSpecAtt = true;
        this.changeSSpecAtt = 1.5;
    }
}
