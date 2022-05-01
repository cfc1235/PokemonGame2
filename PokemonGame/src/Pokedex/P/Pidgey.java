package Pokedex.P;

import PokemonCreation.AllAbilities.B.BigPecks;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.T.TangledFeet;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Pidgey extends Pokemon {

    public Pidgey(int level, GlobalVariables globalVariables){
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new TangledFeet(), new BigPecks());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(), addSunnyDay(), addProtect(), addRainDance(),
                addRoost(), addFrustration(), addReturn(), addDoubleTeam(), addAerialAce(), addFacade(), addRest(),
                addAttract(), addThief(), addRound(), addSteelWing(), addSwagger(), addSleepTalk(), addUTurn(), addSubstitute(),
                addSecretPower(), addConfide(), addFly());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(5, addSandAttack()), new CreateOrderedMap<>(9, addGust()),
                new CreateOrderedMap<>(13, addQuickAttack()), new CreateOrderedMap<>(17, addWhirlwind()),
                new CreateOrderedMap<>(21, addTwister()), new CreateOrderedMap<>(25, addFeatherDance()),
                new CreateOrderedMap<>(29, addAgility()), new CreateOrderedMap<>(33, addWingAttack()),
                new CreateOrderedMap<>(37, addTailwind()), new CreateOrderedMap<>(41, addAerialAce()),
                new CreateOrderedMap<>(45, addAirSlash()), new CreateOrderedMap<>(53, addHurricane()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        this.EvolTiming = 18;
        this.type2 = "Flying";
        setBaseStats(40, 45, 40, 35, 35, 56, 16, 255, 4.0,
                "Normal", "Medium Slow", level, 55);
        setFirstEVs();
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pidgey.png", globalVariables);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setPokeCry("016Cry.wav");
    }
}
