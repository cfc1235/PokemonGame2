package Pokedex.O;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.HeldItem.AbsorbBulb;
import Items.NoItem;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Oddish extends Pokemon {
    public Oddish(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Chlorophyll(),
                new RunAway());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSolarBeam(), addRest(), addSnore(), addProtect(),
                addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(),
                addBulletSeed(), addVenoshock(), addRound(), addGrassyTerrain(), addSwordsDance(),
                addSubstitute(), addSludgeBomb(), addEndeavor(), addSleepTalk(), addSeedBomb(),
                addEnergyBall(), addGrassKnot(), addDazzlingGleam(), addToxic(), addBulletSeed(),
                addSunnyDay(), addSolarBeam(), addDoubleTeam(), addRest(), addEnergyBall(),
                addEndure(), addFlash(), addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addAbsorb()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(4, addAcid()),
                new CreateOrderedMap<>(8, addSweetScent()), new CreateOrderedMap<>(12, addMegaDrain()),
                new CreateOrderedMap<>(14, addPoisonPowder()), new CreateOrderedMap<>(16, addStunSpore()),
                new CreateOrderedMap<>(18, addSleepPowder()), new CreateOrderedMap<>(20, addGigaDrain()),
                new CreateOrderedMap<>(24, addToxic()), new CreateOrderedMap<>(28, addMoonblast()),
                new CreateOrderedMap<>(32, addGrassyTerrain()), new CreateOrderedMap<>(36, addMoonlight()),
                new CreateOrderedMap<>(40, addPetalDance()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 1, 0, 0);
        setBaseStats(55, 75, 45, 75,
                65, 30, 403, 255,
                11.9, "Grass", "Medium Slow",
                level, 64);
        this.type2 = "Poison";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Oddish.png", globalVariables);
        this.EvolTiming = 21;
        this.setPokeCry("403Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new AbsorbBulb()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
