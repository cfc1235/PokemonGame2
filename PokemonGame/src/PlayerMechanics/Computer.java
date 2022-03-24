package PlayerMechanics;

import BattleMechanics.Moves;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computer {
    private List<Pokemon> ComputerParty = new ArrayList<>();

    public Computer(){}

    public List<Pokemon> getComputerParty() {
        return ComputerParty;
    }

    public void accessComp(GlobalVariables globalVariables){
        Computer computer = globalVariables.getComputer();
        PlayerParty party = globalVariables.getParty();
        Scanner scan = new Scanner(System.in);
        List<Integer> tickers = new ArrayList<>();
        int ticker = 0;
        Boolean complete = false;
        while(!complete) {
            Boolean satisfied = false;
            while (!satisfied) {
                System.out.println("You have: ");
                for (Pokemon pokemon : computer.getComputerParty()) {
                    if (pokemon.showhasGender() && (pokemon.showType2().equals(""))) {
                        System.out.println(pokemon.showName() + ", a level " + pokemon.showLevel() + " " + pokemon.showGender() + " " + pokemon.showPokedexType() + ", which is a " + pokemon.showType1() + " type. [" + ticker + "]");
                    }
                    if (pokemon.showhasGender() && (!pokemon.showType2().equals(""))) {
                        System.out.println(pokemon.showName() + ", a level " + pokemon.showLevel() + " " + pokemon.showGender() + " " + pokemon.showPokedexType() + ", which is a " + pokemon.showType1() + " and " + pokemon.showType2() + " type. [" + ticker + "]");
                    }
                    if (!pokemon.showhasGender() && (pokemon.showType2().equals(""))) {
                        System.out.println(pokemon.showName() + ", a level " + pokemon.showLevel() + " " + pokemon.showPokedexType() + ", which is a " + pokemon.showType1() + " type. [" + ticker + "]");
                    }
                    if (!pokemon.showhasGender() && (!pokemon.showType2().equals(""))) {
                        System.out.println(pokemon.showName() + ", a level " + pokemon.showLevel() + " " + pokemon.showPokedexType() + ", which is a " + pokemon.showType1() + " and " + pokemon.showType2() + " type. [" + ticker + "]");
                    }
                    tickers.add(ticker);
                    ticker += 1;
                }
                String choice = "n";
                int tickchoice = 0;
                System.out.println("Which do you want? ");
                while (choice.equals("n")) {
                    choice = scan.nextLine();
                    Boolean again = true;
                    for (int ticks : tickers) {
                        if (Integer.toString(ticks).equals(choice)) {
                            again = false;
                            tickchoice = ticks;
                        }
                        if (again) {
                            choice = "n";
                        }
                    }
                }
                Pokemon chosen = computer.getComputerParty().get(tickchoice);
                System.out.println(chosen.showName() + " is type " + chosen.showPokedexType() + " (" + chosen.showID() + ") ");
                System.out.println(chosen.showName() + " is level " + chosen.showLevel());
                System.out.println(chosen.showName() + " is types: ");
                System.out.println(chosen.showType1());
                if(!chosen.showType2().equals("")) {
                    System.out.println(chosen.showType2());
                }
                if(chosen.showhasGender()){
                    System.out.println(chosen.showName() + " is gender " + chosen.showGender());
                }
                System.out.println(chosen.showName() + " has moves:");
                for(Moves moves : chosen.showMoves()){
                    System.out.println(moves.showName() + ", which has " + moves.showPP() + " PP.");
                }
                System.out.println(chosen.showName() + " has PokemonCreation.Abilities: ");
                if(!chosen.showAbility().showName().equals("")){
                    System.out.println(chosen.showAbility().showName());
                }
                System.out.println(chosen.showName() + " is of a " + chosen.showNature() + " nature.");
                System.out.println("Phys Attack: " + chosen.showPhysAttack());
                System.out.println("Phys Defense: " + chosen.showPhysDefense());
                System.out.println("Special Attack: " + chosen.showSpecAttack());
                System.out.println("Special Defense: " + chosen.showSpecDefense());
                System.out.println("Speed: " + chosen.showTrueSpeed());
                System.out.println("Is this the pokemon you want to add to your party? (y/n)");
                String choose = scan.nextLine();
                if(choose.equals("y")){
                    satisfied = true;
                    party.getCurrentParty().add(chosen);
                    if(party.getCurrentParty().size() > 6){
                        List<Integer> partyTicks = new ArrayList<>();
                        int tick = 0;
                        Pokemon returned = new Pokemon();
                        Boolean putback = true;
                        while(putback) {
                            System.out.println("You can only have six members in your team. Please put one into the computer. Current Party: ");
                            for (Pokemon pokemon : party.getCurrentParty()) {
                                System.out.println(pokemon.showName() + " [" + tick + "]");
                                partyTicks.add(tick);
                                tick += 1;
                            }
                            String back = scan.nextLine();
                            if(partyTicks.contains(Integer.valueOf(back))){
                                returned = party.getCurrentParty().get(Integer.valueOf(tick));
                                putback = false;
                            }
                        }
                        party.getCurrentParty().remove(returned);
                        computer.getComputerParty().add(returned);
                    }
                }
                System.out.println("Would you like to look at another pokemon? (y/n)");
                String choose2 = scan.nextLine();
                if(!choose2.equals("y")){
                    complete = true;
                }
            }
        }
    }
}

