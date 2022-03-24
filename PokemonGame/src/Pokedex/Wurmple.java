package Pokedex;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Apricorn.Apricorn;
import Items.Berries.PechaBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import Items.HeldItem.BrightPowder;
import PokemonCreation.AllAbilities.RunAway;
import PokemonCreation.AllAbilities.ShieldDust;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Wurmple extends Pokemon {
    public Wurmple(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new ShieldDust(), new RunAway());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(5, addPoisonSting()),
                new CreateOrderedMap<>(15, addBugBite()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(35, 45, 45, 20, 30,
                20, 265, 255, 7.9, "Bug",
                "Medium Fast", level, 54);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Wurmple.png", globalVariables);
        this.EvolTiming = 7;
        this.setPokeCry("265Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(40, new Apricorn()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()), new CreateOrderedMap<>(50, new PechaBerry()),
                new CreateOrderedMap<>(5, new BrightPowder()));
        getWildItem();
    }
}
