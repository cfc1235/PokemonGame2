package Items.HeldItem;

import Items.Items;

public class BrightPowder extends Items {
    public BrightPowder(){
        this.name = "Silver Powder";
        this.flingDamage = 10;
        this.purchasePrice = 100;
        this.sellPrice = 50;
        this.changeSelfEvas = true;
        this.changeSelfEvasion = 1.1;
    }
}
