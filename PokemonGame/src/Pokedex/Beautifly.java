package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Consumable.DazzlingHoney;
import Items.Consumable.MediumEXPCandy;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SpoiledApricorn;
import Items.HeldItem.ShedShell;
import Moveset.Flying.Gust;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.Rivalry;
import PokemonCreation.AllAbilities.Swarm;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Beautifly extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(50, 70, 60, 100, 50,
                65 ,267, 45, 62.6, "Bug",
                "Medium Fast", level, 161);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Gust();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addStringShot()),
                new CreateOrderedMap<>(0, addHarden()), new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addBugBite()), new CreateOrderedMap<>(12, addAbsorb()),
                new CreateOrderedMap<>(15, addStunSpore()), new CreateOrderedMap<>(17, addMorningSun()),
                new CreateOrderedMap<>(20, addAirCutter()), new CreateOrderedMap<>(22, addMegaDrain()),
                new CreateOrderedMap<>(27, addAttract()), new CreateOrderedMap<>(30, addWhirlwind()),
                new CreateOrderedMap<>(32, addGigaDrain()), new CreateOrderedMap<>(35, addBugBuzz()),
                new CreateOrderedMap<>(37, addProtect()), new CreateOrderedMap<>(40, addQuiverDance()));
        Collections.addAll(this.TMmoves, addSunnyDay(), addHyperBeam(),
                addProtect(), addGigaDrain(), addSafegaurd(), addSolarBeam(),
                addPsychic(), addShadowBall(), addDoubleTeam(), addAerialAce(),
                addFacade(), addRest(), addAttract(), addThief(), addRoost(),
                addEnergyBall(), addEndure(), addBugBuzz(), addGigaImpact(),
                addFlash(), addSleepTalk(), addSwagger(), addUTurn(),
                addSubstitute(), addDefog());
        this.setPokeCry("267Cry.wav");
    }

    public Beautifly(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs,
                   double HPmissing, List<Integer> OldEVs,
                   int Gender, Abilities ability, Boolean isShiny,
                   Items item){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Silcoon")){
            this.name = "Beautifly";
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
        setFullDirNameEvolution(isShiny, "Beautifly.png");
        this.savedItem = item;
        this.item = this.savedItem;
    }

    public Beautifly(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new Swarm());
        this.possibleAbilities.add(new Rivalry(this.showGender()));
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Beautifly.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new ShedShell()),
                new CreateOrderedMap<>(35, new DazzlingHoney()), new CreateOrderedMap<>(15, new SpoiledApricorn()),
                new CreateOrderedMap<>(100, new MediumEXPCandy()), new CreateOrderedMap<>(20, new SeedOfMastery()));
        getWildItem();
    }
}
