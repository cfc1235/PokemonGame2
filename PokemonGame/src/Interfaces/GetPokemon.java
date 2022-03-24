package Interfaces;

import Pokedex.*;
import PokemonCreation.Pokemon;

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
}

