package Items.Consumable;

import Items.Items;

public class MediumEXPCandy extends Items {
    public MediumEXPCandy(){
        this.name = "Exp. Candy M";
        this.givesEXP = true;
        this.EXPGiven = 3000;
        this.isConsumable = true;
    }
}
