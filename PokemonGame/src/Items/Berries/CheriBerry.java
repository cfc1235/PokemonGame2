package Items.Berries;

import PokemonCreation.Items;

public class CheriBerry extends Items {
    public CheriBerry(){
        this.name = "Cheri Berry";
        this.isBerry = true;
        this.isConsumable = true;
        this.flingDamage = 10;
        this.curesParalysis = true;
    }
}
