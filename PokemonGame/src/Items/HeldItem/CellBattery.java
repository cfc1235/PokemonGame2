package Items.HeldItem;

import Interfaces.CreateOrderedMap;
import Items.Items;

public class CellBattery extends Items {
    public CellBattery(){
        this.name = "Cell Battery";
        this.flingDamage = 30;
        this.purchasePrice = 5000;
        this.sellPrice = 2500;
        this.typesAffected.add(new CreateOrderedMap<>("Electric", 0.0));
        this.changeSelfAtt = true;
        this.changeSAtt = 1;
    }
}
