package Pokedex;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class GalarianArticuno extends Pokemon {
    public GalarianArticuno(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new SnowCloak());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addReflect(), addRest(), addSnore(), addProtect(), addIcyWind(),
                addSteelWing(), addSandstorm(), addRainDance(), addSunnyDay(),
                addHail(), addFacade(), addSwift(), addWeatherBall(), addIcicleSpear(),
                addUTurn(), addAvalanche(), addRound(), addAirSlash(), addIceBeam(),
                addAgility(), addSubstitute(), addEndure(), addSleepTalk(),
                addBraveBird(), addHurricane(), addWaterPulse(), addRoar(),
                addHail(), addDoubleTeam(), addAerialAce(), addPluck(),addUTurn(),
                addDefog(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addMist()), new CreateOrderedMap<>(5, addPowderSnow()),
                new CreateOrderedMap<>(10, addReflect()), new CreateOrderedMap<>(15, addIceShard()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addTailwind()), new CreateOrderedMap<>(35, addFreezeDry()),
                new CreateOrderedMap<>(40, addRoost()), new CreateOrderedMap<>(50, addHail()),
                new CreateOrderedMap<>(55, addHurricane()), new CreateOrderedMap<>(60, addMindReader()),
                new CreateOrderedMap<>(65, addBlizzard()), new CreateOrderedMap<>(70, addSheerCold()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 3, 0, 0, 0);
        setBaseStats(100, 85, 90, 95, 125,
                85, 144, 3, 122.1,
                "Ice", "Slow", level, 261);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Articuno.png", globalVariables);
        this.setPokeCry("144Cry.wav");
    }
}
