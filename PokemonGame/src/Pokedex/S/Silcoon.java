package Pokedex.S;

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
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Silcoon extends Pokemon {
    public void Initialize(int level){
            setGivesEVs(2, 0, 0, 0, 0, 0);
            setBaseStats(55, 35, 50, 25, 25,
                    15 ,266, 120, 22.0, "Bug",
                    "Medium Fast", level, 71);
            this.pokedexType = this.getClass().getSimpleName();
            this.OnEvol = new Harden();
            this.learnedMoves.add(new CreateOrderedMap<>(0, addHarden()));
            this.EvolTiming = 10;
            this.setPokeCry("266Cry.wav");
    }

    public Silcoon(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
            Initialize(level);
            this.Gender = Gender;
            this.IV = oldIVs;
            this.nature = Nature;
            if (name.equals("Wurmple")){
                this.name = "Silcoon";
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
            setFullDirNameEvolution(isShiny, "Silcoon.png");
            this.savedItem = items;
            this.item = this.savedItem;
    }

    public Silcoon(int level, GlobalVariables globalVariables){
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
            setFullDirName("Silcoon.png", globalVariables);
            Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(40, new Apricorn()),
                    new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                    new CreateOrderedMap<>(100, new SmallEXPCandy()));
            getWildItem();
    }
}
