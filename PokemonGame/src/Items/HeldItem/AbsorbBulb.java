package Items.HeldItem;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Items;

public class AbsorbBulb extends Items {
    public AbsorbBulb(){
        this.flingDamage = 30;
        this.purchasePrice = 200;
        this.sellPrice = 100;
        this.typesAffected.add(new CreateOrderedMap<>("Water", 0.0));
        this.changeSelfSpecAtt = true;
        this.changeSSpecAtt = 1;
        this.isConsumable = true;
    }
}
