package Pokedex;

import PokemonCreation.AllAbilities.Blaze;
import PokemonCreation.AllAbilities.SolarPower;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;

import java.util.Collections;

public class Charmander extends Pokemon {

    public Charmander(int level, GlobalVariables globalVariables) {
        possibleAbilities.add(new Blaze());
        possibleAbilities.add(new SolarPower());
        getAbilities();
        savedAbility = ability;
        Collections.addAll(learnedMoves, new CreateOrderedMap<>(0, addScratch()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(4, addEmber()),
                new CreateOrderedMap<>(8, addSmokescreen()), new CreateOrderedMap<>(12, addDragonBreath()),
                new CreateOrderedMap<>(17, addFireFang()), new CreateOrderedMap<>(20, addSlash()),
                new CreateOrderedMap<>(24, addFlamethrower()), new CreateOrderedMap<>(28, addScratch()),
                new CreateOrderedMap<>(32, addFireSpin()), new CreateOrderedMap<>(36, addInferno()),
                new CreateOrderedMap<>(40, addFlareBlitz()));
        addFirstMoves();
        setFirstEVs();
        Collections.addAll(TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(), addThunderPunch(), addFireSpin(),
                addDig(), addRest(),addRockSlide(), addSnore(), addProtect(), addScaryFace(), addAttract(), addBeatUp(),
                addWillOWisp(),addFacade(), addSwift(), addHelpingHand(), addBrickBreak(), addRockTomb(), addFling(),
                addShadowClaw(),addFireFang());
        setBaseStats(43, 52, 39, 60, 50, 65, 4, 45, 18.7,
                "Fire", "Medium Slow", level, 62);
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        EvolTiming = 16;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        HP = savedHP;
        pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setFullDirName("Charmander.png", globalVariables);
        this.setPokeCry("004Cry.wav");
    }
}

