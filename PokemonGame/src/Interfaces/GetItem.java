package Interfaces;

import Items.Apricorn.*;
import Items.Berries.*;
import Items.Consumable.*;
import Items.EvolItems.*;
import Items.HeldItem.*;
import PokemonCreation.Items;
import Items.NoItem;

import java.util.Random;

public interface GetItem {

    static Items getNoItem(){return new NoItem();}
    static Items getApricorn(){return new Apricorn();}
    static Items getCheriBerry(){return new CheriBerry();}
    static Items getPechaBerry(){return new PechaBerry();}
    static Items getDazzlingHoney(){return new DazzlingHoney();}
    static Items getMediumEXPCandy(){return new MediumEXPCandy();}
    static Items getSeedOfMastery(){return new SeedOfMastery();}
    static Items getSmallExpCandy(){return new SmallEXPCandy();}
    static Items getSpoiledApricorn(){return new SpoiledApricorn();}
    static Items getDragonScale(){return new DragonScale();}
    static Items getLeafStone(){return new LeafStone();}
    static Items getSunStone(){return new SunStone();}
    static Items getAbsorbBulb(){return new AbsorbBulb();}
    static Items getBrightPowder(){return new BrightPowder();}
    static Items getEverstone(){return new Everstone();}
    static Items getRazorClaw(){return new RazorClaw();}
    static Items getScopeLens(){return new ScopeLens();}
    static Items getShedShell(){return new ShedShell();}
    static Items getSilverPowder(){return new SilverPowder();}
    static Items getSitrusBerry(){return new SitrusBerry();}
    static Items getOranBerry(){return new OranBerry();}
    static Items getPrismScale(){return new PrismScale();}
    static Items getLeek(){return new Leek();}
    static Items getMoonStone(){return new MoonStone();}
    static Items getRawstBerry(){return new RawstBerry();}
    static Items getMudBall(){return new MudBall();}
    static Items getBlackTumblestone(){return new BlackTumblestone();}

    static Items getRandomItem(){
        Random random = new Random();
        int rand = random.nextInt(24);
        if(rand == 0){getApricorn();}
        if (rand == 1){getCheriBerry();}
        if(rand == 2){getPechaBerry();}
        if(rand == 3){getDazzlingHoney();}
        if(rand == 4){getMediumEXPCandy();}
        if(rand == 5){getSeedOfMastery();}
        if(rand == 6){getSmallExpCandy();}
        if(rand == 7){getSpoiledApricorn();}
        if(rand == 8){getDragonScale();}
        if(rand == 9){getLeafStone();}
        if(rand == 10){getSunStone();}
        if(rand == 11){getAbsorbBulb();}
        if(rand == 12){getBrightPowder();}
        if(rand == 13){getEverstone();}
        if(rand == 14){getRazorClaw();}
        if(rand == 15){getScopeLens();}
        if(rand == 16){getShedShell();}
        if(rand == 17){getSilverPowder();}
        if(rand == 18){getSitrusBerry();}
        if(rand == 19){getOranBerry();}
        if(rand == 20){getPrismScale();}
        if(rand == 21){getLeek();}
        if(rand == 22){getMoonStone();}
        if(rand == 23){getRawstBerry();}
        return getNoItem();
    }
}
