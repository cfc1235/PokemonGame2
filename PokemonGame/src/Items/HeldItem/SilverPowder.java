package Items.HeldItem;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Items;

public class SilverPowder extends Items {

    public SilverPowder(){
        this.name = "Silver Powder";
        this.flingDamage = 10;
        this.purchasePrice = 100;
        this.sellPrice = 50;
        this.affectsType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Bug", 1.2));
    }
}
