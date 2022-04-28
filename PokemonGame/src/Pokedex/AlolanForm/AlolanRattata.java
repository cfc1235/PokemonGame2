package Pokedex.AlolanForm;

import Items.Berries.PechaBerry;
import Items.NoItem;
import PokemonCreation.AllAbilities.*;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class AlolanRattata extends Pokemon {

    public AlolanRattata(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Gluttony(), new ThickFat(), new Hustle());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(4, addQuickAttack()),
                new CreateOrderedMap<>(7, addFocusEnergy()), new CreateOrderedMap<>(10, addBite()),
                new CreateOrderedMap<>(13, addPursuit()), new CreateOrderedMap<>(16, addHyperFang()),
                new CreateOrderedMap<>(19, addAssurance()), new CreateOrderedMap<>(22, addCrunch()),
                new CreateOrderedMap<>(25, addSuckerPunch()), new CreateOrderedMap<>(28, addSuperFang()),
                new CreateOrderedMap<>(31, addDoubleEdge()), new CreateOrderedMap<>(34, addEndeavor()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(),
                addSunnyDay(), addTaunt(), addIceBeam(), addBlizzard(), addProtect(),
                addRainDance(), addFrustration(), addThunderbolt(), addThunder(), addReturn(),
                addShadowBall(), addDoubleTeam(), addSludgeBomb(), addTorment(), addFacade(),
                addRest(), addAttract(), addThief(), addRound(), addChargeBeam(), addQuash(),
                addEmbargo(), addShadowClaw(), addThunderWave(), addGrassKnot(), addSwagger(),
                addSleepTalk(), addUTurn(), addSubstitute(), addWildCharge(), addSnarl(),
                addDarkPulse(), addConfide());
        pokedexType = "Rattata";
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        this.EvolTiming = 20;
        setBaseStats(35, 56, 30, 25, 35, 72, 19, 255, 7.7,
                "Normal", "Medium Fast", level, 51);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        Collections.addAll(this.TMmoves);
        this.type2 = "Dark";
        this.isAlolan = true;
        setFullDirName("AlolanRatta.png", globalVariables);
        this.timeEvolReq = true;
        this.EvolTiming = 20;
        this.setPokeCry("019_1Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new PechaBerry()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
