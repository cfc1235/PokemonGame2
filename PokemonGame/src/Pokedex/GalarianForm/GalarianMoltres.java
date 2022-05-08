package Pokedex.GalarianForm;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.B.Berserk;
import PokemonCreation.AllAbilities.P.Pressure;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class GalarianMoltres extends Pokemon {
    public GalarianMoltres(int level, GlobalVariables globalVariables){
        this.hasGender = false;
        this.isGalarian = true;
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new Berserk());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addSafegaurd(), addRest(), addSnore(), addProtect(), addScaryFace(),
                addSteelWing(), addFacade(), addSwift(), addImprison(), addUTurn(),
                addPayback(), addAssurance(), addRound(), addHex(), addSnarl(),
                addAirSlash(), addAgility(), addSubstitute(), addEndure(),
                addSleepTalk(), addShadowBall(), addTaunt(), addHyperVoice(),
                addDarkPulse(), addBraveBird(), addNastyPlot(), addFoulPlay(),
                addHurricane());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(5, addPayback()),
                new CreateOrderedMap<>(10, addSafegaurd()), new CreateOrderedMap<>(15, addWingAttack()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addSuckerPunch()), new CreateOrderedMap<>(35, addAirSlash()),
                new CreateOrderedMap<>(40, addMeFirst()), new CreateOrderedMap<>(45, addFieryWrath()),
                new CreateOrderedMap<>(50, addNastyPlot()), new CreateOrderedMap<>(55, addHurricane()),
                new CreateOrderedMap<>(60, addEndure()), new CreateOrderedMap<>(65, addMemento()),
                new CreateOrderedMap<>(70, addSkyAttack()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(90, 85, 90, 100, 125,
                90, 146, 3, 145.5,
                "Dark", "Slow", level, 261);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("GalarianMoltres.png", globalVariables);
        this.setPokeCry("146Cry.wav");
    }
}
