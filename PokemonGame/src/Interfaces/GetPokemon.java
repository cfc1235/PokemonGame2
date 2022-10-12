package Interfaces;

import BattleMechanics.Moves;
import Pokedex.A.*;
import Pokedex.AlolanForm.*;
import Pokedex.B.*;
import Pokedex.C.*;
import Pokedex.D.*;
import Pokedex.F.*;
import Pokedex.G.*;
import Pokedex.GalarianForm.*;
import Pokedex.H.*;
import Pokedex.HisuianForm.Basculegion;
import Pokedex.HisuianForm.BasculinWhite;
import Pokedex.I.*;
import Pokedex.J.Jigglypuff;
import Pokedex.L.*;
import Pokedex.M.*;
import Pokedex.N.*;
import Pokedex.O.*;
import Pokedex.P.*;
import Pokedex.R.*;
import Pokedex.S.*;
import Pokedex.T.Toucannon;
import Pokedex.T.Trumbeak;
import Pokedex.V.*;
import Pokedex.W.*;
import Pokedex.Y.Yungoos;
import Pokedex.Z.*;
import PokemonCreation.*;
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
        if(ID == 25){
            pokemon = new Pikachu(level, globalVariables);
        }
        if(ID == 26){
            if(regionCheck < .75) {
                pokemon = new Raichu(level, globalVariables);
            }
            else {
                pokemon = new AlolanRaichu(level, globalVariables);
            }
        }
        if(ID == 39){
            pokemon = new Jigglypuff(level, globalVariables);
        }
        if(ID == 40){
            pokemon = new Wigglytuff(level, globalVariables);
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
        if(ID == 83){
            if(regionCheck < .75){
                pokemon = new Farfetchd(level, globalVariables);
            }
            else{
                pokemon = new GalarianFarfetchd(level, globalVariables);
            }
        }
        if(ID == 144){
            if(regionCheck < .75) {
                pokemon = new Articuno(level, globalVariables);
            }
            else {
                pokemon = new GalarianArticuno(level, globalVariables);
            }
        }
         if(ID == 145){
             if(regionCheck < .75) {
                 pokemon = new Zapdos(level, globalVariables);
             }
             else {
                 pokemon = new GalarianZapdos(level, globalVariables);
             }
         }
         if(ID == 146){
             if(regionCheck < .75) {
                 pokemon = new Moltres(level, globalVariables);
             }
             else {
                 pokemon = new GalarianMoltres(level, globalVariables);
             }
         }
         if(ID == 147){
             pokemon = new Dratini(level, globalVariables);
         }
         if(ID == 148){
             pokemon = new Dragonair(level, globalVariables);
         }
         if(ID == 149){
             pokemon = new Dragonite(level, globalVariables);
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
         if(ID == 172){
             pokemon = new Pichu(level, globalVariables);
         }
         if(ID == 174){
             pokemon = new Igglybuff(level, globalVariables);
         }
         if(ID == 182){
             pokemon = new Bellossom(level, globalVariables);
         }
         if(ID == 185){
             pokemon = new Sudowoodo(level, globalVariables);
         }
         if(ID == 204){
             pokemon = new Pineco(level, globalVariables);
         }
         if(ID == 205){
             pokemon = new Forretress(level, globalVariables);
         }
         if(ID == 206){
             pokemon = new Dunsparce(level, globalVariables);
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
         if(ID == 349){
             pokemon = new Feebas(level, globalVariables);
         }
         if(ID == 350) {
             pokemon = new Milotic(level, globalVariables);
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
         if(ID == 438){
             pokemon = new Bonsly(level, globalVariables);
         }
         if(ID == 504){
             pokemon = new Patrat(level, globalVariables);
         }
         if(ID == 505){
             pokemon = new Watchdog(level, globalVariables);
         }
         if(ID == 506){
             pokemon = new Lillipup(level, globalVariables);
         }
         if(ID == 507){
             pokemon = new Herdier(level, globalVariables);
         }
         if(ID == 508){
             pokemon = new Stoutland(level, globalVariables);
         }
         if(ID == 531){
             pokemon = new Audino(level, globalVariables);
         }
         if(ID == 550){
             if(regionCheck <= .33){
                 pokemon = new BasculinBlue(level, globalVariables);
             }
             else if(regionCheck <= .66){
                 pokemon = new BasculinRed(level, globalVariables);
             }
             else {
                 pokemon = new BasculinWhite(level, globalVariables);
             }
         }
         if(ID == 559){
             pokemon = new Scraggy(level, globalVariables);
         }
         if(ID == 560){
             pokemon = new Scrafty(level, globalVariables);
         }
         if(ID == 731){
             pokemon = new Pikipek(level, globalVariables);
         }
         if(ID == 732){
             pokemon = new Trumbeak(level, globalVariables);
         }
         if(ID == 733){
             pokemon = new Toucannon(level, globalVariables);
         }
         if(ID == 734){
             pokemon = new Yungoos(level, globalVariables);
         }
         if(ID == 735){
             pokemon = new Gumshoos(level, globalVariables);
         }
         if(ID == 862){
             pokemon = new Sirfetchd(level, globalVariables);
         }
         if(ID == 902){
             pokemon = new Basculegion(level, globalVariables);
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
        Boolean isGalarian = pokemon.getIsGalarian();
        Boolean isHisuian = pokemon.getIsHisuian();
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
        if(ID == 25){
            if(isAlolan){
                evolution = new AlolanRaichu(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
            else {
                evolution = new Raichu(level, moves, nature, name,
                        IVs, HPMissing, Evs, Gender, ability, isShiny, items);
            }
        }
        if(ID == 39){
            evolution = new Wigglytuff(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
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
        if(ID == 83 && isHisuian){
            evolution = new Sirfetchd(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 147){
            evolution = new Dragonair(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 148){
            evolution = new Dragonite(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
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
        if(ID == 172){
            evolution = new Pikachu(level, moves, nature, name, IVs,
                    HPMissing, Evs, Gender, ability, isShiny, items,
                    isAlolan);
        }
        if(ID == 174){
            evolution = new Jigglypuff(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 204){
            evolution = new Forretress(level, moves, nature, name,
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
        if(ID == 349){
            evolution = new Milotic(level, moves, nature, name,
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
        if(ID == 438){
            evolution = new Sudowoodo(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 504) {
            evolution = new Watchdog(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 506) {
            evolution = new Herdier(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 507) {
            evolution = new Stoutland(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 550 && isHisuian){
            evolution = new Basculegion(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 559) {
            evolution = new Scrafty(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 731){
            evolution = new Trumbeak(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 732) {
            evolution = new Toucannon(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(ID == 734){
            evolution = new Gumshoos(level, moves, nature, name,
                    IVs, HPMissing, Evs, Gender, ability, isShiny, items);
        }
        if(!evolution.showOnEvol().showName().equals("Nothing") &&
                pokemon != evolution) {
            evolution.learnMovefromEvol();
        }
        return evolution;
    }
}

