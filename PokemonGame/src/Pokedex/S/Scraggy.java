package Pokedex.S;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.I.Intimidate;
import PokemonCreation.AllAbilities.M.Moxxie;
import PokemonCreation.AllAbilities.S.ShedSkin;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Scraggy extends Pokemon {
    public Scraggy(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Intimidate(),
                new Moxxie(), new ShedSkin());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(),
                addIcePunch(), addThunderPunch(), addDig(), addRest(), addRockSlide(),
                addThief(), addSnore(), addProtect(), addScaryFace(), addAttract(),
                addRainDance(), addSunnyDay(), addBeatUp(), addFacade(), addRevenge(),
                addBrickBreak(), addFakeTears(), addRockTomb(), addPayback(),
                addAssurance(), addFling(), addDrainPunch(), addLowSweep(), addRound(),
                addRetaliate(), addSnarl(), addLowKick(), addAmnesia(), addSubstitute(),
                addSludgeBomb(), addEndure(), addSleepTalk(), addIronTail(), addCrunch(),
                addTaunt(), addIronDefense(), addDragonClaw(), addBulkUp(), addDragonDance(),
                addPoisonJab(), addDarkPulse(), addDragonPulse(), addFocusBlast(), addZenHeadbutt(),
                addIronHead(), addStoneEdge(), addGrassKnot(), addFoulPlay(), addWorkUp());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addLowKick()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(4, addPayback()),
                new CreateOrderedMap<>(8, addHeadbutt()), new CreateOrderedMap<>(12, addSandAttack()),
                new CreateOrderedMap<>(16, addFacade()), new CreateOrderedMap<>(20, addProtect()),
                new CreateOrderedMap<>(24, addBeatUp()), new CreateOrderedMap<>(28, addScaryFace()),
                new CreateOrderedMap<>(32, addBrickBreak()), new CreateOrderedMap<>(36, addSwagger()),
                new CreateOrderedMap<>(40, addCrunch()), new CreateOrderedMap<>(44, addHighJumpKick()),
                new CreateOrderedMap<>(48, addFocusPunch()), new CreateOrderedMap<>(52, addHeadSmash()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(70, 75, 50, 35, 70,
                48, 559, 180, 26.0,
                "Dark", "Medium Fast", level, 70);
        this.type2 = "Fighting";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Scraggy.png", globalVariables);
        this.EvolTiming = 39;
        this.setPokeCry("559Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getShedShell()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
    }
}
