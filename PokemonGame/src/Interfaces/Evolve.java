package Interfaces;

import BattleMechanics.Moves;
import Interfaces.GlobalVariables;
import Pokedex.*;
import PokemonCreation.Abilities;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.List;
import java.util.Random;

public interface Evolve {

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
        if(!evolution.showOnEvol().showName().equals("Nothing")) {
            evolution.learnMovefromEvol();
        }
        return evolution;
    }
}
