package Pokedex;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.Overcoat;
import PokemonCreation.AllAbilities.Sturdy;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Pineco extends Pokemon {
    public Pineco(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Sturdy(), new Overcoat());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSunnyDay(), addLightScreen(),
                addProtect(), addGigaDrain(), addSolarBeam(), addEarthquake(),
                addDig(), addDoubleTeam(), addReflect(), addSandstorm(),
                addRockTomb(), addFacade(), addRest(), addAttract(), addEndure(),
                addBugBuzz(), addExplosion(), addPayback(), addGyroBall(),
                addRockSlide(), addSleepTalk(), addBulldoze(), addSwagger(),
                addSubstitute(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addProtect()), new CreateOrderedMap<>(6, addSelfDestruct()),
                new CreateOrderedMap<>(9, addBugBite()), new CreateOrderedMap<>(12, addTakeDown()),
                new CreateOrderedMap<>(17, addRapidSpin()), new CreateOrderedMap<>(20, addAutotomize()),
                new CreateOrderedMap<>(23, addRollout()), new CreateOrderedMap<>(28, addSpikes()),
                new CreateOrderedMap<>(31, addPayback()), new CreateOrderedMap<>(34, addExplosion()),
                new CreateOrderedMap<>(39, addIronDefense()), new CreateOrderedMap<>(42, addGyroBall()),
                new CreateOrderedMap<>(45, addDoubleEdge()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(1, 0, 0, 0, 0, 0);
        setBaseStats(90, 65, 50, 35, 35,
                15, 204, 190, 15.9, "Bug",
                "Medium Fast", level, 58);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pineco.png", globalVariables);
        this.EvolTiming = 31;
        this.setPokeCry("204Cry.wav");
    }
}
