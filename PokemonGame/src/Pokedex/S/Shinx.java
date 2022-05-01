package Pokedex.S;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.CheriBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.AllAbilities.G.Guts;
import PokemonCreation.AllAbilities.I.Intimidate;
import PokemonCreation.AllAbilities.R.Rivalry;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Shinx extends Pokemon {
    public Shinx(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Rivalry(showGender()),
                new Intimidate(), new Guts());
        getAbilities();
        this.savedAbility = this.ability;
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
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(4, addThunderShock()),
                new CreateOrderedMap<>(8, addCharge()), new CreateOrderedMap<>(12, addBite()),
                new CreateOrderedMap<>(16, addSpark()), new CreateOrderedMap<>(20, addRoar()),
                new CreateOrderedMap<>(24, addVoltSwitch()), new CreateOrderedMap<>(28, addScaryFace()),
                new CreateOrderedMap<>(32, addThunderWave()), new CreateOrderedMap<>(36, addCrunch()),
                new CreateOrderedMap<>(40, addDischarge()), new CreateOrderedMap<>(44, addSwagger()),
                new CreateOrderedMap<>(48, addWildCharge()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(34, 65, 45, 40,
                34, 45, 403, 235,
                53, "Electric", "Medium Slow",
                level, 43);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Shinx.png", globalVariables);
        this.EvolTiming = 15;
        this.setPokeCry("411Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(35, new CheriBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()));
        getWildItem();
    }
}
