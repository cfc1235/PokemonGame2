package PokemonCreation.AllAbilities.R;

import PokemonCreation.Abilities;

public class Rivalry extends Abilities {

    public Rivalry(String gender){
        this.needsGenderForPos = true;
        this.needsGenderForNeg = true;
        if(gender.equals("Female")){
            this.requiredGenderForPos = "Female";
            this.requiredGenderForNeg = "Male";
        }
        if(gender.equals("Male")){
            this.requiredGenderForPos = "Male";
            this.requiredGenderForNeg = "Female";
        }
        this.possSelfAccuracy = 1.25;
        this.possSelfAccuracy2 = .75;
        this.isMultiplier = true;
    }
}
