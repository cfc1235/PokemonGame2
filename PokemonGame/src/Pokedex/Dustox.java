package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Consumable.DazzlingHoney;
import Items.Consumable.MediumEXPCandy;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SpoiledApricorn;
import Items.HeldItem.ShedShell;
import Moveset.Gust;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.CompoundEyes;
import PokemonCreation.AllAbilities.ShieldDust;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Dustox extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 3, 0, 0, 0);
        setBaseStats(70, 50, 60, 50,
                90, 65, 269, 45,
                69.7, "Bug", "Medium Fast", level,
                173);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Gust();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addStringShot()),
                new CreateOrderedMap<>(0, addHarden()), new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addBugBite()), new CreateOrderedMap<>(12, addConfusion()),
                new CreateOrderedMap<>(15, addPoisonPowder()), new CreateOrderedMap<>(17, addMoonlight()),
                new CreateOrderedMap<>(20, addVenoshock()), new CreateOrderedMap<>(22, addPsybeam()),
                new CreateOrderedMap<>(25, addLeechLife()), new CreateOrderedMap<>(27, addLightScreen()),
                new CreateOrderedMap<>(30, addWhirlwind()), new CreateOrderedMap<>(32, addToxic()),
                new CreateOrderedMap<>(35, addBugBuzz()), new CreateOrderedMap<>(37, addProtect()),
                new CreateOrderedMap<>(40, addQuiverDance()));
        Collections.addAll(this.TMmoves, addToxic(), addSunnyDay(), addHyperBeam(),
                addLightScreen(), addProtect(), addGigaDrain(), addSolarBeam(),
                addPsychic(), addShadowBall(), addDoubleTeam(), addSludgeBomb(),
                addAerialAce(), addFacade(), addRest(), addAttract(), addThief(),
                addRoost(), addEnergyBall(), addEndure(), addBugBuzz(), addGigaImpact(),
                addFlash(), addSleepTalk(), addSwagger(), addUTurn(), addSubstitute(),
                addDefog());
        this.setPokeCry("269Cry.wav");
    }

    public Dustox(int level, List<Moves> oldMoves, String Nature,
                  String name, List<Integer> oldIVs,
                  double HPmissing, List<Integer> OldEVs,
                  int Gender, Abilities ability, Boolean isShiny,
                  Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Cascoon")){
            this.name = "Dustox";
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
        setFullDirNameEvolution(isShiny, "Dustox.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Dustox(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new CompoundEyes());
        this.possibleAbilities.add(new ShieldDust());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Dustox.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new ShedShell()),
                new CreateOrderedMap<>(35, new DazzlingHoney()), new CreateOrderedMap<>(15, new SpoiledApricorn()),
                new CreateOrderedMap<>(100, new MediumEXPCandy()), new CreateOrderedMap<>(20, new SeedOfMastery()));
        getWildItem();
    }
}
