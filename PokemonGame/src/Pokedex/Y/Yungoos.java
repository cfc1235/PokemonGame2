package Pokedex.Y;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.PechaBerry;
import Items.NoItem;
import PokemonCreation.AllAbilities.A.Adaptability;
import PokemonCreation.AllAbilities.S.Stakeout;
import PokemonCreation.AllAbilities.S.StrongJaw;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Yungoos extends Pokemon {
    public Yungoos(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Adaptability(),
                new StrongJaw(), new Stakeout());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(),
                addHiddenPower(), addTaunt(), addProtect(),
                addFrustration(), addEarthquake(), addReturn(),
                addDoubleTeam(), addSandstorm(), addRockTomb(),
                addTorment(), addFacade(), addRest(), addAttract(),
                addThief(), addRound(), addEchoedVoice(), addPayback(),
                addSwagger(), addSleepTalk(), addUTurn(), addSubstitute(),
                addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(3, addLeer()), new CreateOrderedMap<>(7, addPursuit()),
                new CreateOrderedMap<>(10, addSandAttack()), new CreateOrderedMap<>(13, addOdorSleuth()),
                new CreateOrderedMap<>(16, addBide()), new CreateOrderedMap<>(19, addBite()),
                new CreateOrderedMap<>(22, addMudSlap()), new CreateOrderedMap<>(25, addSuperFang()),
                new CreateOrderedMap<>(28, addTakeDown()), new CreateOrderedMap<>(31, addScaryFace()),
                new CreateOrderedMap<>(34, addCrunch()), new CreateOrderedMap<>(37, addHyperFang()),
                new CreateOrderedMap<>(40, addYawn()), new CreateOrderedMap<>(43, addThrash()),
                new CreateOrderedMap<>(46, addRest()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(30, 70, 48, 30, 30,
                45, 734, 255, 13.2,
                "Normal", "Medium Fast", level, 48);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Yungoos.png", globalVariables);
        this.setPokeCry("734Cry.wav");
        this.EvolTiming = 20;
        this.timeEvolReq = true;
        this.timeReqdEvol = true;
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new PechaBerry()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
