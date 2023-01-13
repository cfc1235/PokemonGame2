package Interfaces;

import Items.Items;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public interface giveItem {

    default Pokemon givePokemonItem(GlobalVariables globalVariables){
        ArrayList<String> pokemonNames = new ArrayList<>();
        Pokemon getPoke = null;
        for(Pokemon pokemon : globalVariables.getParty().getCurrentParty()){
            System.out.println(pokemon.showName());
            pokemonNames.add(pokemon.showName());
        }
        Scanner scanner = new Scanner(System.in);
        String pick = "";
        while(!pokemonNames.contains(pick)){
            pick = scanner.next();
            getPoke = globalVariables.getParty().getCurrentParty().get(pokemonNames.indexOf(pick));
        }
        assert getPoke != null;
        Items getItem = globalVariables.getItemInventory().giveItemFromInventory();
        if(getItem.getForcesEvol()){
            getPoke = getPoke.giveItem(getItem, globalVariables);
            globalVariables.getParty().getCurrentParty().set(pokemonNames.indexOf(pick), getPoke);
        }
        else{
            getPoke.giveItem(getItem);
        }
        return getPoke;
    }
}
