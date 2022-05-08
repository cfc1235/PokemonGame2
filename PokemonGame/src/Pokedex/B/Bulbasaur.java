package Pokedex.B;
import PokemonCreation.AllAbilities.O.Overgrowth;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;

import java.util.Collections;

public class Bulbasaur extends Pokemon {

    public Bulbasaur(int level, GlobalVariables globalVariables) {
        this.setFirstEVs();
        this.setGivesEVs(0, 0, 1, 0, 0, 0);
        this.setBaseStats(49, 45, 45, 65,
                65, 45, 1, 45, 12.5,
                "Grass","Medium Slow", level, 64);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new Overgrowth());
        this.possibleAbilities.add(new Chlorophyll());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(3, addVineWhip()), new CreateOrderedMap<>(6, addGrowth()),
                new CreateOrderedMap<>(9, addLeechSeed()), new CreateOrderedMap<>(12, addRazorLeaf()),
                new CreateOrderedMap<>(15, addPoisonPowder()), new CreateOrderedMap<>(15, addSleepPowder()),
                new CreateOrderedMap<>(18, addSeedBomb()), new CreateOrderedMap<>(21, addTakeDown()),
                new CreateOrderedMap<>(24, addSweetScent()), new CreateOrderedMap<>(27, addSynthesis()),
                new CreateOrderedMap<>(30, addWorrySeed()), new CreateOrderedMap<>(33, addDoubleEdge()),
                new CreateOrderedMap<>(36, addSolarBeam()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addMagicalLeaf(), addLightScreen(), addSafegaurd(), addRest(), addSnore(), addProtect(),
                addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(), addHelpingHand(), addWeatherBall(),
                addVenoshock(), addBulletSeed(), addRound(), addGrassyTerrain(), addFalseSwipe(), addSwordsDance(),
                addBodySlam(), addAmnesia(), addSubstitute(), addSludgeBomb(), addEndure(), addSleepTalk(), addEnergyBall(),
                addLeafStorm(), addPowerWhip(), addGrassKnot(), addWorkUp());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.EvolTiming = 16;
        this.setFullDirName("Bulbasaur.png", globalVariables);
        this.setPokeCry("001Cry.wav");
    }
}