package Items.Berries;

import PokemonCreation.Items;

public class PechaBerry extends Items {

    public PechaBerry(){
        this.name = "Pecha Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.curesPoison = true;
        this.purchasePrice = 20;
        this.sellPrice = 10;
    }
}
