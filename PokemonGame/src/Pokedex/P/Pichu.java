package Pokedex.P;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.OranBerry;
import Items.Berries.PechaBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import Items.NoItem;
import PokemonCreation.AllAbilities.L.LightningRod;
import PokemonCreation.AllAbilities.S.Static;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.Random;

public class Pichu extends Pokemon {
    public Pichu(int level, GlobalVariables globalVariables){
        Collections.addAll(this.possibleAbilities, new Static(),
                new LightningRod());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addThunderPunch(),
                addThunderWave(), addLightScreen(), addReflect(), addRest(), addSnore(),
                addProtect(), addCharm(), addAttract(), addRainDance(), addFacade(),
                addSwift(), addHelpingHand(), addFling(), addRound(), addVoltSwitch(),
                addElectroweb(), addElectricTerrain(), addBodySlam(), addSurf(), addThunderbolt(),
                addThunder(), addSubstitute(), addReversal(), addEndure(), addSleepTalk(),
                addEncore(), addIronTail(), addUproar(),addNastyPlot(), addGrassKnot(),
                addWildCharge(), addPlayRough(), addDoubleTeam(), addShockWave(), addChargeBeam(),
                addFlash(), addSwagger());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addThunderShock()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(4, addPlayNice()),
                new CreateOrderedMap<>(8, addSweetKiss()), new CreateOrderedMap<>(12, addNuzzle()),
                new CreateOrderedMap<>(16, addNastyPlot()), new CreateOrderedMap<>(20, addCharm()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(15, 40, 20, 35, 35,
                60, 172, 190, 4.4,
                "Electric", "Medium Fast", level, 42);
        setFirstEVs();
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pichu.png", globalVariables);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setPokeCry("172Cry.wav");
        this.EvolTiming = 12;
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(35, new OranBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()),
                new CreateOrderedMap<>(10, new SeedOfMastery()));
        getWildItem();
        Random random = new Random();
        if(random.nextDouble() > .75){
            this.isAlolan = true;
        }
    }
}
