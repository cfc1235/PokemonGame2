package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.CheriBerry;
import Items.Consumable.MediumEXPCandy;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.G.Guts;
import PokemonCreation.AllAbilities.I.Intimidate;
import PokemonCreation.AllAbilities.R.Rivalry;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Luxray extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(79, 120, 80, 95,
                79, 70 ,405, 45, 92.6,
                "Electric", "Medium Slow", level, 235);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(),
                addThunderWave(), addLightScreen(), addRest(), addThief(),
                addSnore(), addProtect(), addScaryFace(), addAttract(),
                addRainDance(), addFacade(), addSwift(), addHelpingHand(),
                addFakeTears(), addThunderFang(), addIceFang(), addFireFang(),
                addRound(), addVoltSwitch(), addSnarl(), addElectricTerrain(),
                addEerieImpulse(), addThunderbolt(), addThunder(), addAgility(),
                addSubstitute(), addEndure(), addSleepTalk(), addIronTail(),
                addCrunch(), addSuperpower(), addElectroBall(), addWildCharge(),
                addPlayRough(), addPsychicFangs(), addThroatChop(), addRoar(),
                addDoubleTeam(), addShockWave(), addFacade(), addChargeBeam(),
                addFlash(), addSwagger(), addStrength());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addThunderShock()),
                new CreateOrderedMap<>(0, addCharge()), new CreateOrderedMap<>(0, addElectricTerrain()),
                new CreateOrderedMap<>(12, addBite()), new CreateOrderedMap<>(18, addSpark()),
                new CreateOrderedMap<>(24, addRoar()), new CreateOrderedMap<>(33, addVoltSwitch()),
                new CreateOrderedMap<>(40, addScaryFace()), new CreateOrderedMap<>(48, addThunderWave()),
                new CreateOrderedMap<>(56, addCrunch()), new CreateOrderedMap<>(64, addDischarge()),
                new CreateOrderedMap<>(72, addSwagger()), new CreateOrderedMap<>(80, addWildCharge()));
        this.setPokeCry("405Cry.wav");
    }
    public Luxray(int level, List<Moves> oldMoves, String Nature,
                 String name, List<Integer> oldIVs, double HPmissing,
                 List<Integer> OldEVs, int Gender, Abilities ability,
                 Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Luxio")){
            this.name = "Luxray";
        }
        if (!(name.equals("Luxio"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Luxray.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Luxray(int level, GlobalVariables globalVariables){
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
        setFullDirName("Luxray.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(35, new CheriBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(20, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new MediumEXPCandy()));
        getWildItem();
    }
}
