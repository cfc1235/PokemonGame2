package Pokedex.G;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.S.Swarm;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Grubbin extends Pokemon {
    public Grubbin(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Swarm());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addThunderWave(), addDig(),
                addScratch(), addLightScreen(), addRest(), addSnore(),
                addProtect(), addAttract(), addRainDance(), addFacade(),
                addFacade(), addMudShot(), addRound(), addAcrobatics(),
                addVoltSwitch(), addElectroweb(), addThunderbolt(),
                addSubstitute(), addEndure(), addSleepTalk(), addCrunch(),
                addPoisonJab(), addXScissor(), addWildCharge());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addViseGrip()),
                new CreateOrderedMap<>(0, addMudSlap()), new CreateOrderedMap<>(5, addStringShot()),
                new CreateOrderedMap<>(10, addBugBite()), new CreateOrderedMap<>(15, addBite()),
                new CreateOrderedMap<>(21, addSpark()), new CreateOrderedMap<>(25, addStickyWeb()),
                new CreateOrderedMap<>(30, addXScissor()), new CreateOrderedMap<>(35, addCrunch()),
                new CreateOrderedMap<>(40, addDig()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(45, 62, 47, 55, 45,
                46, 736, 255, 9.7,
                "Bug", "Medium Fast", level, 60);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Grubbin.png", globalVariables);
        this.setPokeCry("736Cry.wav");
        this.EvolTiming = 20;
    }
}
