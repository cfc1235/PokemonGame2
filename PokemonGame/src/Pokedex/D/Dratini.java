package Pokedex.D;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.EvolItems.DragonScale;
import Items.NoItem;
import PokemonCreation.AllAbilities.MarvelScale;
import PokemonCreation.AllAbilities.ShedSkin;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Dratini extends Pokemon {
    public Dratini(int level, GlobalVariables globalVariables){
        this.setFirstEVs();
        this.setGivesEVs(0, 1, 0, 0, 0, 0);
        this.setBaseStats(45, 64, 41, 50, 50,
                50, 147, 45, 7.3,
                "Dragon","Slow", level, 60);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new ShedSkin());
        this.possibleAbilities.add(new MarvelScale());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addWrap()), new CreateOrderedMap<>(0, addLeer()),
                new CreateOrderedMap<>(5, addTwister()), new CreateOrderedMap<>(10, addThunderWave()),
                new CreateOrderedMap<>(15, addDragonTail()), new CreateOrderedMap<>(20, addAgility()),
                new CreateOrderedMap<>(25, addSlam()), new CreateOrderedMap<>(31, addAquaTail()),
                new CreateOrderedMap<>(35, addDragonRush()), new CreateOrderedMap<>(40, addSafegaurd()),
                new CreateOrderedMap<>(45, addRainDance()), new CreateOrderedMap<>(50, addDragonDance()),
                new CreateOrderedMap<>(55, addOutrage()), new CreateOrderedMap<>(60, addHyperBeam()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addFireSpin(),
                addThunderWave(), addLightScreen(), addSafegaurd(), addRest(), addSnore(),
                addProtect(), addIcyWind(), addAttract(), addRainDance(), addSunnyDay(),
                addHail(), addWhirlpool(), addFacade(), addSwift(), addRound(), addBrutalSwing(),
                addBreakingSwing(), addBodySlam(), addFlamethrower(), addHydroPump(),
                addSurf(), addIceBeam(), addBlizzard(), addThunderbolt(), addThunder(),
                addAgility(), addFireBlast(), addWaterfall(), addSubstitute(), addOutrage(),
                addEndure(), addSleepTalk(), addIronTail(), addDragonDance(), addDragonPulse(),
                addWaterPulse(), addHail(), addLightScreen(), addDoubleTeam(), addShockWave(),
                addSwagger());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.EvolTiming = 30;
        this.setFullDirName("Dratini.png", globalVariables);
        this.setPokeCry("147Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new DragonScale()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
