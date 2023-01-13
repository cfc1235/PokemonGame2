package Items.HeldItem;

import Items.Items;

public class Leftovers extends Items {
    public Leftovers(){
        this.name = "Leftovers";
        this.sellPrice = 10000;
        this.purchasePrice = 20000;
        this.flingDamage = 10;
        this.healByPercMax = 1.0/16;
    }
}
