package Interfaces;

import Items.Apricorn.*;
import Items.Berries.*;
import Items.Consumable.*;
import Items.EvolItems.*;
import Items.HeldItem.*;
import Items.HeldItem.Leftovers;
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
    static Items getRazzBerry(){return new RazzBerry();}
    static Items getOvalStone(){return new OvalStone();}
    static Items getLeftovers(){return new Leftovers();}
    static Items getKingsRock(){return new KingsRock();}
    static Items getPoisonBarb(){return new PoisonBarb();}

    static Items getRandomItem(){
        Random random = new Random();
        Items randItem = getNoItem();
        int rand = random.nextInt(31);
        if(rand == 0){randItem = getApricorn();}
        if (rand == 1){randItem = getCheriBerry();}
        if(rand == 2){randItem = getPechaBerry();}
        if(rand == 3){randItem = getDazzlingHoney();}
        if(rand == 4){randItem = getMediumEXPCandy();}
        if(rand == 5){randItem = getSeedOfMastery();}
        if(rand == 6){randItem = getSmallExpCandy();}
        if(rand == 7){randItem = getSpoiledApricorn();}
        if(rand == 8){randItem = getDragonScale();}
        if(rand == 9){randItem = getLeafStone();}
        if(rand == 10){randItem = getSunStone();}
        if(rand == 11){randItem = getAbsorbBulb();}
        if(rand == 12){randItem = getBrightPowder();}
        if(rand == 13){randItem = getEverstone();}
        if(rand == 14){randItem = getRazorClaw();}
        if(rand == 15){randItem = getScopeLens();}
        if(rand == 16){randItem = getShedShell();}
        if(rand == 17){randItem = getSilverPowder();}
        if(rand == 18){randItem = getSitrusBerry();}
        if(rand == 19){randItem = getOranBerry();}
        if(rand == 20){randItem = getPrismScale();}
        if(rand == 21){randItem = getLeek();}
        if(rand == 22){randItem = getMoonStone();}
        if(rand == 23){randItem = getRawstBerry();}
        if(rand == 24){randItem = getMudBall();}
        if(rand == 25){randItem = getBlackTumblestone();}
        if(rand == 26){randItem = getRazzBerry();}
        if(rand == 27){randItem = getOvalStone();}
        if(rand == 28){randItem = getLeftovers();}
        if(rand == 29){randItem = getKingsRock();}
        if(rand == 30){randItem = getPoisonBarb();}
        return randItem;
    }
}
