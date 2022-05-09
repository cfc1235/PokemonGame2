package Items.Berries;

import PokemonCreation.Items;

public class RawstBerry extends Items {
    public RawstBerry(){
        this.name = "Rawst Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.curesBurn = true;
        this.purchasePrice = 20;
        this.sellPrice = 10;
    }
}
