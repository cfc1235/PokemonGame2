package Pokedex;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Spinarak extends Pokemon {

    public Spinarak(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Swarm(), new Insomnia(), new Sniper());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSunnyDay(), addProtect(), addGigaDrain(),
                addSolarBeam(), addDig(), addPsychic(), addDoubleTeam(), addSludgeBomb(),
                addFacade(), addRest(), addAttract(), addThief(), addEndure(), addBugBuzz(),
                addFlash(), addXScissor(), addSleepTalk(), addPoisonJab(), addSwagger(),
                addSubstitute());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(5, addAbsorb()),
                new CreateOrderedMap<>(8, addInfestation()), new CreateOrderedMap<>(12, addScaryFace()),
                new CreateOrderedMap<>(15, addNightShade()), new CreateOrderedMap<>(19, addShadowSneak()),
                new CreateOrderedMap<>(22, addFurySwipes()), new CreateOrderedMap<>(26, addSuckerPunch()),
                new CreateOrderedMap<>(29, addLeechLife()), new CreateOrderedMap<>(33, addAgility()),
                new CreateOrderedMap<>(36, addPinMissle()), new CreateOrderedMap<>(40, addPsychic()),
                new CreateOrderedMap<>(43, addPoisonJab()), new CreateOrderedMap<>(47, addCrossPoison()),
                new CreateOrderedMap<>(43, addStickyWeb()), new CreateOrderedMap<>(47, addToxicThread()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(40, 60, 40, 40, 40,
                30, 167, 255, 18.7, "Bug",
                "Fast", level, 50);
        this.type2 = "Poison";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Spinarak.png", globalVariables);
        this.EvolTiming = 22;
        this.setPokeCry("167Cry.wav");
    }
}
