package Pokedex.B;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Bellsprout extends Pokemon {
    public Bellsprout(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Chlorophyll(),
                new Gluttony());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addBulletSeed(), addSunnyDay(), addProtect(),
                addGigaDrain(), addSolarBeam(), addDoubleTeam(), addReflect(),
                addSludgeBomb(), addFacade(), addRest(), addThief(), addEnergyBall(),
                addEndure(), addFlash(), addSwordsDance(), addSleepTalk(),
                addPoisonJab(), addGrassKnot(), addSwagger(), addSubstitute(),
                addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addVineWhip()),
                new CreateOrderedMap<>(7, addGrowth()), new CreateOrderedMap<>(11, addWrap()),
                new CreateOrderedMap<>(13, addSleepPowder()), new CreateOrderedMap<>(15, addPoisonPowder()),
                new CreateOrderedMap<>(17, addStunSpore()), new CreateOrderedMap<>(23, addAcid()),
                new CreateOrderedMap<>(27, addKnockOff()), new CreateOrderedMap<>(29, addSweetScent()),
                new CreateOrderedMap<>(35, addGastroAcid()), new CreateOrderedMap<>(39, addRazorLeaf()),
                new CreateOrderedMap<>(41, addPoisonJab()), new CreateOrderedMap<>(47, addSlam()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(35, 75, 50, 70,
                30, 40, 69, 255,
                8.8, "Grass", "Medium Slow",
                level, 84);
        this.type2 = "Poison";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Bellsprout.png", globalVariables);
        this.EvolTiming = 21;
        this.setPokeCry("069Cry.wav");
    }
}
