package Items.Berries;

import Items.Items;

public class OranBerry extends Items {
    public OranBerry(){
        this.name = "Oran Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.healAm = 10;
        this.canHeal = true;
        this.purchasePrice = 20;
        this.sellPrice = 10;
    }
}
