package Interfaces;

import Interfaces.GetPokemon;
import Interfaces.GlobalVariables;
import Locations.AreaTypes.AreaTypes;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public interface AIPokeParty {

    static ArrayList<Pokemon> devWild(GlobalVariables globalVariables){
        Scanner scanner = new Scanner(System.in);
        int ID = 903;
        int level = 0;
        Pokemon pokemon;
        ArrayList<Pokemon> devPoke = new ArrayList<>();
        while(true){
            while (ID > 902) {
                System.out.println("What ID?");
                ID = scanner.nextInt();
            }
            while ((0 > level) || (level > 100)) {
                System.out.println("What level?");
                level = scanner.nextInt();
            }
            pokemon = GetPokemon.getPokemon(level, ID, globalVariables);
            if(!pokemon.showName().equals("")){
                devPoke.add(pokemon);
                return devPoke;
            }
            System.out.println("ID NOT FOUND");
        }
    }

    static ArrayList<Pokemon> chooseWildAIPoke(AreaTypes currentArea, GlobalVariables globalVariables) {
        Random random = new Random();
        int level = currentArea.getMinLevel() + random.nextInt(currentArea.getLevelRange());
        int ID = 0;
        if(globalVariables.getFullRandomizerOn()){
            ArrayList<Pokemon> wildTeam = new ArrayList<>();
            Pokemon pokemon = new Pokemon();
            while(pokemon.showName().equals("")){
                ID = random.nextInt(902);
                pokemon = GetPokemon.getPokemon(level, ID, globalVariables);
            }
            wildTeam.add(pokemon);
            return wildTeam;
        }
        if(globalVariables.getParty().hasHeadButt() &&
                !currentArea.getPokeChanceHeadbutt().isEmpty()){
            System.out.println("Would you like to use headbutt for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceHeadbutt().getRandomEntry();
            }
        }
        if(globalVariables.getHasSwarmAbility() &&
            !currentArea.getPokeChanceSwarm().isEmpty() &&
            ID == 0){
            System.out.println("Would you like to use swarm for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceSwarm().getRandomEntry();
            }
        }
        if(globalVariables.getHasSoundAbility() &&
                !currentArea.getPokeChanceSwarm().isEmpty() &&
                ID == 0){
            System.out.println("Would you like to use sound for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceSound().getRandomEntry();
            }
        }
        if(globalVariables.getParty().hasSurf() &&
                !currentArea.getPokeChanceSurfing().isEmpty()){
            System.out.println("Would you like to use surf for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceSurfing().getRandomEntry();
            }
        }
        if(globalVariables.getParty().hasFly() &&
                !currentArea.getPokeChanceFlight().isEmpty()){
            System.out.println("Would you like to use fly for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceFlight().getRandomEntry();
            }
        }
        if(globalVariables.getFishingRod() &&
                !currentArea.getPokeFishingChances().isEmpty() &&
                ID == 0){
            System.out.println("Would you like to use fishing rod for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeFishingChances().getRandomEntry();
            }
        }
        if(ID == 0) {
            if (globalVariables.getTime()) {
                ID = currentArea.getPokeChanceDay().getRandomEntry();;
            } else {
                ID = currentArea.getPokeChanceNight().getRandomEntry();;
            }
        }
        ArrayList<Pokemon> wildTeam = new ArrayList<>();
        wildTeam.add(GetPokemon.getPokemon(level, ID, globalVariables));
        return wildTeam;
    }

    static ArrayList<Pokemon> chooseTrainerAIPoke(AreaTypes currentArea, GlobalVariables globalVariables) {
        Random random = new Random();
        int len = 1;
        boolean again = true;
        ArrayList<Pokemon> trainerTeam = new ArrayList<>();
        while (len <= 5 && again) {
            len += 1;
            if (Math.random() > .5) {
                again = false;
            }
        }
        if(globalVariables.getFullRandomizerOn()){
            for (int i = 0; i <= len; ++i) {
                int level = currentArea.getMinLevel() + random.nextInt(currentArea.getLevelRange());
                Pokemon pokemon = new Pokemon();
                while(pokemon.showName().equals("")){
                    int ID = random.nextInt(898);
                    pokemon = GetPokemon.getPokemon(level, ID, globalVariables);
                }
                trainerTeam.add(pokemon);
            }
            return trainerTeam;
        }
        for (int i = 0; i <= len; ++i) {
            int level = currentArea.getMinLevel() + random.nextInt(currentArea.getLevelRange());
            int ID = currentArea.getTrainerPokeChance().getRandomEntry();
            trainerTeam.add(GetPokemon.getPokemon(level, ID, globalVariables));
        }
        return trainerTeam;
    }
}

