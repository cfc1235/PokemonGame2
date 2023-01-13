package Items.Berries;

import Items.Items;

public class CheriBerry extends Items {
    public CheriBerry(){
        this.name = "Cheri Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.curesParalysis = true;
        this.purchasePrice = 20;
        this.sellPrice = 10;
    }
}
