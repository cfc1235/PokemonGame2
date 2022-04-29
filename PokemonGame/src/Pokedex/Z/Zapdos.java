package Pokedex.Z;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.Pressure;
import PokemonCreation.AllAbilities.SnowCloak;
import PokemonCreation.AllAbilities.Static;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Zapdos extends Pokemon {
    public Zapdos(int level, GlobalVariables globalVariables){
        this.hasGender = false;
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new Static());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addThunderWave(), addLightScreen(), addRest(), addSnore(), addProtect(),
                addSteelWing(), addSandstorm(), addRainDance(), addSunnyDay(),
                addHail(), addFacade(), addSwift(), addWeatherBall(), addUTurn(),
                addRound(), addVoltSwitch(), addEerieImpulse(), addThunderbolt(),
                addThunder(), addAgility(), addSubstitute(), addEndure(),
                addSleepTalk(), addBatonPass(), addHeatWave(), addBraveBird(),
                addWildCharge(), addHurricane(), addRoar(), addHail(),
                addDoubleTeam(), addShockWave(), addSandstorm(), addAerialAce(),
                addVoltSwitch(), addRoost(), addChargeBeam(), addFlash(),
                addSwagger(), addPluck(), addDefog(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addThunderWave()), new CreateOrderedMap<>(5, addThunderShock()),
                new CreateOrderedMap<>(10, addLightScreen()), new CreateOrderedMap<>(15, addPluck()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addCharge()), new CreateOrderedMap<>(35, addDrillPeck()),
                new CreateOrderedMap<>(40, addRoost()), new CreateOrderedMap<>(45, addDischarge()),
                new CreateOrderedMap<>(50, addRainDance()), new CreateOrderedMap<>(55, addThunder()),
                new CreateOrderedMap<>(60, addDetect()), new CreateOrderedMap<>(65, addMagneticFlux()),
                new CreateOrderedMap<>(70, addZapCannon()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(85, 90, 90, 125, 90,
                100, 145, 3, 116.0,
                "Flying", "Slow", level, 261);
        this.type2 = "Electric";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Zapdos.png", globalVariables);
        this.setPokeCry("145Cry.wav");
    }
}
