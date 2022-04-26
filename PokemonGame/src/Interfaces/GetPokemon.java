package Interfaces;

import BattleMechanics.Moves;
import Pokedex.*;
import PokemonCreation.Abilities;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;
import Items.NoItem;

import java.util.List;
import java.util.Random;

public interface GetPokemon {

     static Pokemon getPokemon(int level, int ID, GlobalVariables globalVariables){
        Pokemon pokemon = new Pokemon();
        double regionCheck = new Random().nextDouble();
        if(ID == 1){
            pokemon = new Bulbasaur(level, globalVariables);
        }
        if(ID == 2){
            pokemon = new Ivysaur(level, globalVariables);
        }
        if(ID == 3){
            pokemon = new Venusaur(level, globalVariables);
        }
        if(ID == 4){
            pokemon = new Charmander(level, globalVariables);
        }
        if(ID == 5){
            pokemon = new Charmeleon(level, globalVariables);
        }
        if(ID == 6){
            pokemon = new Charizard(level, globalVariables);
        }
        if(ID == 7){
            pokemon = new Squirtle(level, globalVariables);
        }
        if(ID == 8){
            pokemon = new Wartortle(level, globalVariables);
        }
        if(ID == 9){
            pokemon = new Blastoise(level, globalVariables);
        }
        if(ID == 10){
            pokemon = new Caterpie(level, globalVariables);
        }
        if(ID == 11){
            pokemon = new Metapod(level, globalVariables);
        }
        if(ID == 12){
            pokemon = new Butterfree(level, globalVariables);
        }
        if(ID == 16){
            pokemon = new Pidgey(level, globalVariables);
        }
        if(ID == 17){
            pokemon = new Pidgeotto(level, globalVariables);
        }
        if(ID == 18){
            pokemon = new Pidgeot(level, globalVariables);
        }
        if(ID == 19){
            if(regionCheck < .75) {
                pokemon = new Rattata(level, globalVariables);
            }
            else {
                pokemon = new AlolanRattata(level, globalVariables);
            }
        }
        if(ID == 20){
            if(regionCheck < .75) {
                pokemon = new Raticate(level, globalVariables);
            }
            else {
                pokemon = new AlolanRaticate(level, globalVariables);
            }
        }
        if(ID == 43){
            pokemon = new Oddish(level, globalVariables);
        }
        if(ID == 44){
            pokemon = new Gloom(level, globalVariables);
        }
        if(ID == 45){
            pokemon = new Vileplume(level, globalVariables);
        }
        if(ID == 69){
            pokemon = new Bellsprout(level, globalVariables);
        }
        if(ID == 70){
            pokemon = new Weepinbell(level, globalVariables);
        }
        if(ID == 71){
            pokemon = new Victreebel(level, globalVariables);
        }
        if(ID == 144){
            if(regionCheck < .75) {
                pokemon = new Articuno(level, globalVariables);
            }
            else {
                pokemon = new GalarianArticuno(level, globalVariables);
            }
        }
        if(ID == 161){
            pokemon = new Sentret(level, globalVariables);
        }
        if(ID == 162){
            pokemon = new Furret(level, globalVariables);
        }
        if(ID == 163){
            pokemon = new Hoothoot(level, globalVariables);
        }
        if(ID == 164){
            pokemon = new Noctowl(level, globalVariables);
        }
        if(ID == 165){
            pokemon = new Ledyba(level, globalVariables);
        }
        if(ID == 166){
            pokemon = new Ledian(level, globalVariables);
        }
        if(ID == 167){
            pokemon = new Spinarak(level, globalVariables);
        }
         if(ID == 168){
             pokemon = new Ariados(level, globalVariables);
         }
         if(ID == 182){
             pokemon = new Bellossom(level, globalVariables);
         }
         if(ID == 204){
             pokemon = new Pineco(level, globalVariables);
         }
         if(ID == 205){
             pokemon = new Forretress(level, globalVariables);
         }
         if(ID == 261){
             pokemon = new Poochyena(level, globalVariables);
         }
         if(ID == 262){
             pokemon = new Mightyena(level, globalVariables);
         }
         if(ID == 265){
             pokemon = new Wurmple(level, globalVariables);
         }
         if(ID == 266){
             pokemon = new Silcoon(level, globalVariables);
         }
         if(ID == 267){
             pokemon = new Beautifly(level, globalVariables);
         }
         if(ID == 268){
             pokemon = new Cascoon(level, globalVariables);
         }
         if(ID == 269){
             pokemon = new Dustox(level, globalVariables);
         }
         if(ID == 311){
             pokemon = new Plusle(level, globalVariables);
         }
         if(ID == 312){
             pokemon = new Minun(level, globalVariables);
         }
         if(ID == 403){
             pokemon = new Shinx(level, globalVariables);
         }
         if(ID == 404){
             pokemon = new Luxio(level, globalVariables);
         }
         if(ID == 405){
             pokemon = new Luxray(level, globalVariables);
         }
        return pokemon;
    }

    static Pokemon evolvePoke(GlobalVariables globalVariables,
                              Pokemon pokemon){
        Pokemon evolution = pokemon;
        int level = pokemon.showLevel();
        double HPMissing = (pokemon.showHP() * 1.0)/pokemon.showSavedHP();
        String nature = pokemon.showNature();
        String name = pokemon.showName();
        List<Moves> moves = pokemon.showMoves();
        List<Integer> IVs = pokemon.showIVs();
        List<Integer> Evs = pokemon.showEVs();
        int Gender = pokemon.showRawGender();
        Abilities ability = pokemon.showAbility();
        int ID = pokemon.showID();
        Items items = pokemon.getSavedItem();
        Boolean isShiny = pokemon.getIsShiny();
        Boolean isAlolan = pokemon.getIsAlolan();
        Boolean needsTime = pokemon.getTimeEvolReq();
        Boolean timeNeeded = pokemon.getTimeReqdEvol();
        double randomCheck = new Random().nextDouble();
        if(needsTime){
            if(timeNeeded != globalVariables.getTime()){
                return evolution;
            }
        }
        if(ID == 1){
            evolution = new Ivysaur(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 2){
            evolution = new Venusaur(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 4){
            evolution = new Charmeleon(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 5){
            evolution = new Charizard(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 7){
            evolution = new Wartortle(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 8){
            evolution = new Blastoise(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 10){
            evolution = new Metapod(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 11){
            evolution = new Butterfree(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 16){
            evolution = new Pidgeotto(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 17){
            evolution = new Pidgeot(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 19){
            if(isAlolan){
                evolution = new AlolanRaticate(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
            else {
                evolution = new Raticate(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
        }
        if(ID == 43){
            evolution = new Gloom(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 44){
            Items newItem = new NoItem();
            if(items.showName().equals("Leaf Stone")){
                evolution = new Vileplume(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, newItem);
            }
            if (items.showName().equals("Sun Stone")) {
                evolution = new Bellossom(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, newItem);
            }
        }
        if(ID == 69){
            evolution = new Weepinbell(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 70){
            if(items.showName().equals("Leaf Stone")){
                evolution = new Victreebel(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, new NoItem());
            }
        }
        if(ID == 161){
            evolution = new Furret(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 163){
            evolution = new Noctowl(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 165){
            evolution = new Ledian(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 167){
            evolution = new Ariados(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 204){
            evolution = new Ariados(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 261){
            evolution = new Mightyena(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 265){
            if(randomCheck <= .5){
                evolution = new Cascoon(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
            else {
                evolution = new Silcoon(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
        }
        if(ID == 266){
            evolution = new Beautifly(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 268){
            evolution = new Dustox(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 403){
            evolution = new Luxio(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 404) {
            evolution = new Luxray(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(!evolution.showOnEvol().showName().equals("Nothing") &&
                pokemon != evolution) {
            evolution.learnMovefromEvol();
        }
        return evolution;
    }
}

