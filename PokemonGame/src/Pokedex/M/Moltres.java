package Pokedex.M;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.FlameBody;
import PokemonCreation.AllAbilities.Pressure;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Moltres extends Pokemon {
    public Moltres(int level, GlobalVariables globalVariables){
        this.hasGender = false;
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new FlameBody());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addSolarBeam(), addFireSpin(), addSafegaurd(), addRest(), addSnore(),
                addProtect(), addSteelWing(), addSandstorm(), addRainDance(),
                addSunnyDay(), addWillOWisp(), addFacade(), addSwift(), addWeatherBall(),
                addUTurn(), addRound(), addMysticFire(), addAirSlash(), addFlamethrower(),
                addAgility(), addFireBlast(), addSubstitute(), addEndure(),
                addSleepTalk(), addHeatWave(), addOverheat(), addFlareBlitz(),
                addBraveBird(), addHurricane(), addRoar(), addDoubleTeam(),
                addAerialAce(), addRoost(), addSwagger(), addPluck(),
                addUTurn(), addDefog(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(5, addEmber()),
                new CreateOrderedMap<>(10, addSafegaurd()), new CreateOrderedMap<>(15, addWingAttack()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addIncinerate()), new CreateOrderedMap<>(35, addAirSlash()),
                new CreateOrderedMap<>(40, addRoost()), new CreateOrderedMap<>(45, addHeatWave()),
                new CreateOrderedMap<>(50, addSunnyDay()), new CreateOrderedMap<>(55, addHurricane()),
                new CreateOrderedMap<>(60, addEndure()), new CreateOrderedMap<>(65, addBurnUp()),
                new CreateOrderedMap<>(70, addSkyAttack()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(90, 100, 90, 125, 85,
                90, 146, 3, 132.3,
                "Fire", "Slow", level, 261);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Moltres.png", globalVariables);
        this.setPokeCry("146Cry.wav");
    }
}
