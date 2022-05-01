package Pokedex.C;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Apricorn.Apricorn;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import Moveset.SelfChange.Harden;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.S.ShedSkin;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Cascoon extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(55, 35, 50, 25, 25,
                15 ,268, 120, 25.4, "Bug",
                "Medium Fast", level, 72);
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Harden();
        this.learnedMoves.add(new CreateOrderedMap<>(0, addHarden()));
        this.EvolTiming = 10;
        this.setPokeCry("268Cry.wav");
    }

    public Cascoon(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                   double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Wurmple")){
            this.name = "Cascoon";
        }
        else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Cascoon.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Cascoon(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.ability = new ShedSkin();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Cascoon.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(40, new Apricorn()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()));
        getWildItem();
    }
}
