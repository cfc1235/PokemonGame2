package Pokedex.L;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.E.EarlyBird;
import PokemonCreation.AllAbilities.S.Swarm;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Ledyba extends Pokemon {

    public Ledyba(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Swarm(), new EarlyBird(), new Rattled());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFocusPunch(), addSunnyDay(), addLightScreen(),
                addProtect(), addGigaDrain(), addSafegaurd(), addSolarBeam(), addDig(),
                addBrickBreak(), addDoubleTeam(), addReflect(), addAerialAce(), addFacade(),
                addRest(), addAttract(), addThief(), addRoost(), addFling(), addEndure(),
                addDrainPunch(), addBugBuzz(), addFlash(), addSwordsDance(), addSleepTalk(),
                addSwagger(), addUTurn(), addSubstitute());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(5, addSupersonic()), new CreateOrderedMap<>(8, addSwift()),
                new CreateOrderedMap<>(12, addLightScreen()), new CreateOrderedMap<>(12, addReflect()),
                new CreateOrderedMap<>(12, addSafegaurd()), new CreateOrderedMap<>(15, addMachPunch()),
                new CreateOrderedMap<>(19, addRoost()), new CreateOrderedMap<>(22, addStruggleBug()),
                new CreateOrderedMap<>(26, addBatonPass()), new CreateOrderedMap<>(29, addAgility()),
                new CreateOrderedMap<>(33, addBugBuzz()), new CreateOrderedMap<>(36, addAirSlash()),
                new CreateOrderedMap<>(40, addDoubleEdge()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 1, 0, 0, 0);
        setBaseStats(30, 20, 40, 40, 80, 55, 165, 255,
                23.8, "Bug", "Fast", level, 52);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Ledyba.png", globalVariables);
        this.EvolTiming = 18;
        this.setPokeCry("165Cry.wav");
    }
}
