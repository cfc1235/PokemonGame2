package Pokedex.P;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.A.Analytic;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Patrat extends Pokemon {
    public Patrat(int level, GlobalVariables globalVariables){
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new RunAway(), new Analytic());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(),
                addSunnyDay(), addProtect(), addRainDance(), addFrustration(),
                addThunderbolt(), addReturn(), addShadowBall(), addDoubleTeam(),
                addFacade(), addRest(), addAttract(), addRound(), addFling(),
                addSwordsDance(), addGrassKnot(), addSwagger(), addSleepTalk(),
                addSubstitute(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(3, addLeer()), new CreateOrderedMap<>(6, addBite()),
                new CreateOrderedMap<>(8, addBide()), new CreateOrderedMap<>(11, addDetect()),
                new CreateOrderedMap<>(13, addSandAttack()), new CreateOrderedMap<>(16, addCrunch()),
                new CreateOrderedMap<>(18, addHypnosis()), new CreateOrderedMap<>(21, addSuperFang()),
                new CreateOrderedMap<>(23, addMeFirst()), new CreateOrderedMap<>(26, addFocusEnergy()),
                new CreateOrderedMap<>(28, addWorkUp()), new CreateOrderedMap<>(31, addHyperFang()),
                new CreateOrderedMap<>(33, addNastyPlot()), new CreateOrderedMap<>(36, addMeanLook()),
                new CreateOrderedMap<>(38, addBatonPass()), new CreateOrderedMap<>(41, addSlam()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        this.EvolTiming = 20;
        setBaseStats(39, 55, 45, 35, 39,
                42, 504, 255, 25.6,
                "Normal", "Medium Fast", level, 51);
        setFirstEVs();
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Patrat.png", globalVariables);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setPokeCry("504Cry.wav");
    }
}
