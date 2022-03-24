package Pokedex;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Hoothoot extends Pokemon {

    public Hoothoot(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Insomnia(), new KeenEyes(), new TintedLenses());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addScreech(), addReflect(), addRest(),
                addThief(), addSnore(), addProtect(), addSteelWing(), addAttract(),
                addRainDance(), addSunnyDay(), addFacade(), addSwift(), addImprison(),
                addRound(), addAirSlash(), addPsychic(), addAgility(), addAmnesia(),
                addSubstitute(), addEndure(), addSleepTalk(), addShadowBall(), addUproar(),
                addHeatWave(), addHyperVoice(), addCalmMind(), addWorkUp(), addProtect(),
                addDoubleTeam(), addAerialAce(), addRest(), addThief(), addRoost(),
                addNastyPlot(), addRecycle(), addPsychUp(), addDreamEater(),  addSwagger(),
                addPluck(), addDefog());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(3, addTackle()),
                new CreateOrderedMap<>(6, addEchoedVoice()), new CreateOrderedMap<>(9, addConfusion()),
                new CreateOrderedMap<>(12, addReflect()), new CreateOrderedMap<>(15, addPsychoShift()),
                new CreateOrderedMap<>(18, addAirSlash()), new CreateOrderedMap<>(21, addExtrasensory()),
                new CreateOrderedMap<>(24, addTakeDown()), new CreateOrderedMap<>(27, addUproar()),
                new CreateOrderedMap<>(30, addRoost()), new CreateOrderedMap<>(33, addMoonblast()),
                new CreateOrderedMap<>(36, addHypnosis()), new CreateOrderedMap<>(39, addDreamEater()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(30, 30, 60, 36, 56, 50, 163, 255,
                46.7, "Normal", "Medium Fast", level, 52);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("HootHoot.png", globalVariables);
        this.EvolTiming = 20;
        this.setPokeCry("163Cry.wav");
    }
}
