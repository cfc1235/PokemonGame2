package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.CheriBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.Guts;
import PokemonCreation.AllAbilities.Intimidate;
import PokemonCreation.AllAbilities.Rivalry;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Luxio extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(49, 85, 60, 60,
                49, 60 ,404, 120, 67.2,
                "Electric", "Medium Slow", level, 127);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addThunderWave(), addLightScreen(),
                addRest(), addThief(), addSnore(), addProtect(), addScaryFace(),
                addAttract(), addRainDance(), addFacade(), addSwift(),
                addHelpingHand(), addFakeTears(), addThunderFang(), addIceFang(),
                addFireFang(), addRound(), addVoltSwitch(), addSnarl(),
                addEerieImpulse(), addThunderbolt(), addThunder(), addSubstitute(),
                addEndure(), addSleepTalk(), addIronTail(), addCrunch(),
                addElectroBall(), addWildCharge(), addPlayRough(), addPsychicFangs(),
                addRoar(), addDoubleTeam(), addShockWave(), addFacade(),
                addChargeBeam(), addFlash(), addSwagger(), addStrength());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addThunderShock()),
                new CreateOrderedMap<>(0, addCharge()), new CreateOrderedMap<>(12, addBite()),
                new CreateOrderedMap<>(18, addSpark()), new CreateOrderedMap<>(24, addRoar()),
                new CreateOrderedMap<>(31, addVoltSwitch()), new CreateOrderedMap<>(36, addScaryFace()),
                new CreateOrderedMap<>(42, addThunderWave()), new CreateOrderedMap<>(48, addCrunch()),
                new CreateOrderedMap<>(54, addDischarge()), new CreateOrderedMap<>(60, addSwagger()),
                new CreateOrderedMap<>(68, addWildCharge()));
        this.EvolTiming = 30;
        this.setPokeCry("404Cry.wav");
    }
    public Luxio(int level, List<Moves> oldMoves, String Nature,
                 String name, List<Integer> oldIVs, double HPmissing,
                 List<Integer> OldEVs, int Gender, Abilities ability,
                 Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Shinx")){
            this.name = "Luxio";
        }
        if (!(name.equals("Shinx"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Luxio.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Luxio(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Rivalry(showGender()),
                new Intimidate(), new Guts());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Luxio.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(35, new CheriBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()));
        getWildItem();
    }
}

