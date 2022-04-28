package Pokedex.GalarianForm;

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
        Collections.addAll(this.possibleAbilities, new Pressure(), new Competitve());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addLightScreen(), addReflect(), addRest(), addSnore(), addProtect(),
                addScaryFace(), addSteelWing(), addFacade(), addSwift(),
                addImprison(), addUTurn(), addPowerSwap(), addGuardSwap(),
                addPsychoCut(), addTrickRoom(), addRound(), addAirSlash(),
                addPsychic(), addAgility(), addSubstitute(), addPsyshock(),
                addEndure(), addShadowBall(), addFutureSight(), addSkillSwap(),
                addSleepTalk(), addHyperVoice(), addCalmMind(), addBraveBird(),
                addStoredPower(), addAllySwitch());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addPsychoShift()), new CreateOrderedMap<>(5, addConfusion()),
                new CreateOrderedMap<>(10, addReflect()), new CreateOrderedMap<>(15, addHypnosis()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addTailwind()), new CreateOrderedMap<>(35, addPsychoCut()),
                new CreateOrderedMap<>(40, addRecover()), new CreateOrderedMap<>(45, addFreezingGlare()),
                new CreateOrderedMap<>(50, addDreamEater()), new CreateOrderedMap<>(55, addHurricane()),
                new CreateOrderedMap<>(60, addMindReader()), new CreateOrderedMap<>(65, addFutureSight()),
                new CreateOrderedMap<>(70, addTrickRoom()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 3, 0, 0, 0);
        setBaseStats(85, 85, 90, 125, 100,
                95, 144, 3, 112.2,
                "Flying", "Slow", level, 290);
        this.type2 = "Psychic";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("GalarianArticuno.png", globalVariables);
        this.setPokeCry("144Cry.wav");
    }
}
