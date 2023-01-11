package Pokedex.W;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.H.Hydration;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RainDish;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Wingull extends Pokemon {
    public Wingull(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new RainDish(), new Hydration());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(5, addQuickAttack()),
                new CreateOrderedMap<>(10, addSupersonic()), new CreateOrderedMap<>(15, addWingAttack()),
                new CreateOrderedMap<>(20, addWaterPulse()), new CreateOrderedMap<>(26, addAgility()),
                new CreateOrderedMap<>(30, addAirSlash()), new CreateOrderedMap<>(35, addMist()),
                new CreateOrderedMap<>(40, addRoost()), new CreateOrderedMap<>(45, addHurricane()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addTakeDown(), addAgility(),
                addProtect(), addWaterPulse(), addAcrobatics(), addThief(),
                addChillingWater(), addFacade(), addAerialAce(), addSwift(),
                addIcyWind(), addAirCutter(), addEndure(), addRainDance(),
                addSnowscape(), addUTurn(), addAirSlash(), addSleepTalk(),
                addWaterfall(), addRest(), addFly(), addSubstitute(),
                addLiquidation(), addTailwind(), addSurf(), addHelpingHand(),
                addIceBeam(), addHydroPump(), addBlizzard(), addHurricane(),
                addBraveBird());
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(30, 30, 40, 55, 30,
                85, 278, 190, 20.9, "Water",
                "Medium Fast", level, 54);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Wingull.png", globalVariables);
        this.EvolTiming = 25;
        this.setPokeCry("278Cry.wav");
    }
}
