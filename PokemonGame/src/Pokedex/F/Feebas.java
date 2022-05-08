package Pokedex.F;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.A.Adaptability;
import PokemonCreation.AllAbilities.O.Oblivious;
import PokemonCreation.AllAbilities.S.SwiftSwim;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Feebas extends Pokemon {
    public Feebas(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Adaptability(),
                new SwiftSwim(), new Oblivious());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addLightScreen(), addRest(),
                addSnore(), addProtect(), addIcyWind(), addAttract(),
                addRainDance(), addHail(), addWhirlpool(), addFacade(),
                addSwift(), addDive(), addMudShot(), addBrine(), addRound(),
                addSurf(), addIceBeam(), addBlizzard(), addWaterfall(),
                addSubstitute(), addEndure(), addSleepTalk(), addIronTail(),
                addMuddyWater(), addDragonPulse(), addScald(), addWaterPulse(),
                addDoubleTeam());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSplash()),
                new CreateOrderedMap<>(15, addTackle()), new CreateOrderedMap<>(25, addFlail()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(20, 15, 20, 10, 55,
                80, 349, 255, 16.3,
                "Water", "Erratic", level, 40);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Feebas.png", globalVariables);
        this.setPokeCry("349Cry.wav");
        this.itemEvolReqs.add("Prism Scale");
    }
}
