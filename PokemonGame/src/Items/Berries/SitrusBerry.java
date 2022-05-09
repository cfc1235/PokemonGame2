package Items.Berries;

import PokemonCreation.Items;

public class SitrusBerry extends Items {
    public SitrusBerry(){
        this.name = "Sitrus Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.healAm = 0;
        this.healByPercMax = .25;
        this.canHeal = true;
        this.purchasePrice = 20;
        this.sellPrice = 10;
    }
}
