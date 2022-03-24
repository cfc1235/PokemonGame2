package AIMechanics;

import Interfaces.GetPokemon;
import Interfaces.GlobalVariables;
import Locations.AreaTypes.AreaTypes;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AIPokeParty {

    public static ArrayList<Pokemon> chooseWildAIPoke(AreaTypes currentArea, GlobalVariables globalVariables) {
        Random random = new Random();
        int level = currentArea.getMinLevel() + random.nextInt(currentArea.getLevelRange());
        int ID = 0;
        if(globalVariables.getParty().hasHeadButt() &&
                !currentArea.getPokeChanceHeadbutt().isEmpty()){
            System.out.println("Would you like to use headbutt for different pokemon? (y/n) ");
            String confirm;
            Scanner scanner = new Scanner(System.in);
            confirm = scanner.nextLine();
            if(confirm.equals("y")){
                ID = currentArea.getPokeChanceHeadbutt().getRandomEntry();
            }
        }if(globalVariables.getHasSwarmAbility() &&
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

    public static ArrayList<Pokemon> chooseTrainerAIPoke(AreaTypes currentArea, GlobalVariables globalVariables) {
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
        for (int i = 0; i <= len; ++i) {
            int level = currentArea.getMinLevel() + random.nextInt(currentArea.getLevelRange());
            int ID = currentArea.getTrainerPokeChance().getRandomEntry();
            trainerTeam.add(GetPokemon.getPokemon(level, ID, globalVariables));
        }
        return trainerTeam;
    }
}

