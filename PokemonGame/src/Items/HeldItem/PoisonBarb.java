package Items.HeldItem;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Items;

public class PoisonBarb extends Items {
    public PoisonBarb(){
        this.name = "Poison Barb";
        this.flingDamage = 70;
        this.purchasePrice = 3000;
        this.sellPrice = 1500;
        this.affectsType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Poison", 1.2));
    }
}
