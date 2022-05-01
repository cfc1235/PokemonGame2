package Pokedex.P;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.Q.QuickFeet;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Poochyena extends Pokemon{
    public Poochyena(int level, GlobalVariables globalVariables) {
        this.setFirstEVs();
        this.setGivesEVs(0, 1, 0, 0, 0, 0);
        this.setBaseStats(35, 55, 35, 30, 30,
                35, 261, 255, 30.0, "Dark",
                "Medium Fast", level, 56);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new RunAway(), new Rattled(),
                new QuickFeet());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addHowl()), new CreateOrderedMap<>(7, addSandAttack()),
                new CreateOrderedMap<>(10, addBite()), new CreateOrderedMap<>(13, addMudSlap()),
                new CreateOrderedMap<>(16, addRoar()), new CreateOrderedMap<>(19, addSwagger()),
                new CreateOrderedMap<>(22, addAssurance()), new CreateOrderedMap<>(25, addScaryFace()),
                new CreateOrderedMap<>(28, addHeadbutt()), new CreateOrderedMap<>(31, addTaunt()),
                new CreateOrderedMap<>(34, addCrunch()), new CreateOrderedMap<>(37, addYawn()),
                new CreateOrderedMap<>(40, addTakeDown()), new CreateOrderedMap<>(43, addSuckerPunch()),
                new CreateOrderedMap<>(46, addPlayRough()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addRoar(), addSunnyDay(), addTaunt(),
                addProtect(), addRainDance(), addIronTail(), addDig(), addShadowBall(),
                addDoubleTeam(), addTorment(), addFacade(), addRest(), addAttract(),
                addThief(), addEndure(), addNastyPlot(), addPayback(), addSnarl(),
                addDarkPulse(), addSleepTalk(), addSwagger(), addSubstitute(),
                addRockSmash());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.EvolTiming = 18;
        this.setFullDirName("Poochyena.png", globalVariables);
        this.setPokeCry("261Cry.wav");
    }
}
