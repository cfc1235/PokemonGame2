package Pokedex.C;

import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.AllAbilities.S.ShieldDust;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;

import java.util.Collections;

public class Caterpie extends Pokemon {
    public Caterpie(int level, GlobalVariables globalVariables){
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(35, 30, 45, 20, 20, 45, 10, 255, 6.4,
                "Bug", "Medium Fast", level, 39);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = "Caterpie";
        this.possibleAbilities.add(new ShieldDust());
        this.possibleAbilities.add(new RunAway());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(9, addBugBite()));
        addFirstMoves();
        setFirstEVs();
        this.TMmoves.add(addElectroweb());
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.EvolTiming = 7;
        this.HP = this.savedHP;
        setFullDirName("Caterpie.png", globalVariables);
        this.setPokeCry("010Cry.wav");
    }
}
