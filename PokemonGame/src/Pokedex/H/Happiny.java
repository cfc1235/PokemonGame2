package Pokedex.H;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.I.Insomnia;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.S.SereneGrace;
import PokemonCreation.AllAbilities.T.TintedLenses;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Happiny extends Pokemon {
    public Happiny(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new SereneGrace(), new KeenEyes(), new TintedLenses());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSolarBeam(),addThunderWave(), addLightScreen(),
                addSafegaurd(), addRest(), addSnore(), addProtect(), addIcyWind());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(4, addDefenseCurl()), new CreateOrderedMap<>(8, addSweetKiss()),
                new CreateOrderedMap<>(12, addDisarmingVoice()), new CreateOrderedMap<>(16, addCovet()),
                new CreateOrderedMap<>(20, addCharm()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(30, 30, 60, 36,
                56, 50, 163, 255,
                46.7, "Normal", "Medium Fast", level,
                52);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("HootHoot.png", globalVariables);
        this.EvolTiming = 20;
        this.setPokeCry("163Cry.wav");
    }
}
