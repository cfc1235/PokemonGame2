package Pokedex.M;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.S.Synchronize;
import PokemonCreation.Pokemon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

public class Mew extends Pokemon {
    private void Initialize() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException{
        Class<?> moveset = Class.forName("Interfaces.AddMoveset");
        Method[] methods = moveset.getMethods();
        for(Method move : methods){
            if (move.getName().startsWith("add") && !move.getName().startsWith("addMetronome")){
                this.TMmoves.add((Moves) move.invoke(moveset));
            }
        }
    }
    public Mew(int level, GlobalVariables globalVariables){
        try {
            Initialize();
        } catch (ClassNotFoundException
                | InvocationTargetException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
        this.hasGender = false;
        setFirstEVs();
        setNature();
        setIVs();
        this.ability = new Synchronize();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(0, addReflectType()),  new CreateOrderedMap<>(10, addAmnesia()),
                new CreateOrderedMap<>(20, addBatonPass()), new CreateOrderedMap<>(30, addAncientPower()),
                new CreateOrderedMap<>(40, addLifeDew()), new CreateOrderedMap<>(50, addNastyPlot()),
                new CreateOrderedMap<>(60, addMetronome()), new CreateOrderedMap<>(70, addImprison()),
                new CreateOrderedMap<>(80, addTransform()), new CreateOrderedMap<>(90, addAuraSphere()),
                new CreateOrderedMap<>(100, addPsychic()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 3);
        setBaseStats(100, 100, 100, 100, 100,
                100, 151, 45, 8.8,
                "Psychic", "Medium Slow", level, 270);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Mew.png", globalVariables);
        this.setPokeCry("151Cry.wav");
    }
}
