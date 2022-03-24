package PlayerMechanics;
import Interfaces.GlobalVariables;
import Locations.AreaTypes.AreaTypes;
import Pokedex.*;
import PokemonCreation.Pokemon;
import UserInterfaces.GameScreen;
import UserInterfaces.GetStarterPokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewPokeToTeam {
    protected static Pokemon StarterPokemon;

    public AddNewPokeToTeam() {
    }

    public static Boolean addToParty(Pokemon defender, String ballType, int ticker,
                                     GlobalVariables globalVariables, Pokemon attacker) {
        PlayerParty party = globalVariables.getParty();
        Computer computer = globalVariables.getComputer();
        AreaMechanics areaType = globalVariables.getAreaType();
        double CatchValue = 0;
        double BallMod = 1;
        System.out.println(ballType);
        if (ballType.equals("Master Ball")) {
            party.getCurrentParty().add(defender);
            System.out.println(defender.showName() + " has been added to your party!");
            if (party.getCurrentParty().size() > 6) {
                System.out.println(defender.showName() + " cannot fit in your current party. Moving to your computer.");
                party.getCurrentParty().remove(defender);
                computer.getComputerParty().add(defender);
                defender.setPokeBallType(ballType);
                return true;
            }
        }
        if (!(ballType.equals("Master Ball"))) {
            if (ballType.equals("Great Ball")) {
                BallMod = 1.5;
            }
            if (ballType.equals("Ultra Ball")) {
                BallMod = 2;
            }
            if ((ballType.equals("Great Ball")) || ballType.equals("Safari Ball") || ballType.equals("Sport Ball")) {
                BallMod = 1.5;
            }
            if (ballType.equals("Net Ball")) {
                if ((defender.showType2().equals("Water")) || defender.showType2().equals("Bug") || defender.showType1().equals("Water") || defender.showType1().equals("Bug")) {
                    BallMod = 3.5;
                }
            }
            if (ballType.equals("Dive Ball")) {
                if (areaType.showName().equals("Ocean")) {
                    BallMod = 3.5;
                }
            }
            if (ballType.equals("Nest Ball")) {
                BallMod = (8 - 0.2 * (defender.showLevel() - 1));
                if (BallMod < 1) {
                    BallMod = 1;
                }
                if (BallMod > 3) {
                    BallMod = 3;
                }
            }
            if (ballType.equals("Moon Ball")) {
                if (defender.getRequiresItemEvol()) {
                    if (defender.getItemEvolReq().equals("Moon Stone")) {
                        BallMod = 4;
                    }
                }
            }
            if (ballType.equals("Repeat Ball")) {
                Boolean inComp = false;
                for (Pokemon pokemon : computer.getComputerParty()) {
                    if (defender.showID() == pokemon.showID()) {
                        inComp = true;
                    }
                }
                for (Pokemon pokemon : party.getCurrentParty()) {
                    if (defender.showID() == pokemon.showID()) {
                        inComp = true;
                    }
                }
                if (inComp) {
                    BallMod = 3;
                }
            }
            if (ballType.equals("Timer Ball")) {
                BallMod = (1 + (.3 * ticker));
                if (BallMod > 4) {
                    BallMod = 4;
                }
            }
            if (ballType.equals("Dusk Ball")) {
                if (areaType.showName().equals("Caves")) {
                    BallMod = 3;
                }
            }
            if (ballType.equals("Quick Ball")) {
                if (ticker == 1) {
                    BallMod = 4;
                }
            }
            if (ballType.equals("Fast Ball")) {
                if (defender.showBaseSpeed() >= 100) {
                    BallMod = 4;
                }
            }
            if (ballType.equals("Level Ball")) {
                if (attacker.showLevel() >= defender.showLevel() * 2) {
                    BallMod = 2;
                }
                if (attacker.showLevel() >= defender.showLevel() * 4) {
                    BallMod = 4;
                }
                if (attacker.showLevel() >= defender.showLevel() * 8) {
                    BallMod = 8;
                }
            }
            if (ballType.equals("Love Ball")) {
                if (attacker.showhasGender() && defender.showhasGender()) {
                    if (!attacker.showGender().equals(defender.showGender())) {
                        if(attacker.showID() == defender.showID()) {
                            BallMod = 8;
                        }
                    }
                }
            }
            double StatusMod = 1;
            if (defender.showPoisoned() || defender.showBurn() || defender.showParalysis()) {
                StatusMod = 1.5;
            }
            if (defender.showAsleep() || defender.showFrozen()) {
                StatusMod = 2.5;
            }

            if (!ballType.equals("Heavy Ball")) {
                CatchValue = (((((3 * defender.showSavedHP()) - (2 * defender.showHP())) * (defender.getCaptureRate() * BallMod * StatusMod)) / (3 * defender.showSavedHP())));
            }
            if (ballType.equals("Heavy Ball")) {
                if (defender.showWeight() <= 451.1) {
                    BallMod = -20;
                }
                if (defender.showWeight() > 451.1) {
                    BallMod = 20;
                }
                if (defender.showWeight() > 677.3) {
                    BallMod = 30;
                }
                if (defender.showWeight() > 903) {
                    BallMod = 40;
                }
                CatchValue = (((((3 * defender.showSavedHP()) - (2 * defender.showHP())) * (defender.getCaptureRate() + BallMod * StatusMod)) / (3 * defender.showSavedHP())));
            }
            Boolean CritCapture = false;
            double CritPos = 0;
            List<Integer> IDlist = new ArrayList<>();
            for (Pokemon pokemon : party.getCurrentParty()) {
                if (!IDlist.contains(pokemon.showID())) {
                    IDlist.add(pokemon.showID());
                }
            }
            for (Pokemon pokemon : computer.getComputerParty()) {
                if (!IDlist.contains(pokemon.showID())) {
                    IDlist.add(pokemon.showID());
                }
            }
            if (IDlist.size() > 30) {
                CritPos = .5;
            }
            if (IDlist.size() > 149) {
                CritPos = 1;
            }
            if (IDlist.size() > 299) {
                CritPos = 1.5;
            }
            if (IDlist.size() > 149) {
                CritPos = 1;
            }
            int Catchfloor = (int) Math.round(1048560 / Math.sqrt(Math.sqrt(16711680 / CatchValue)));
            int Critfloor = (int) Math.round((Catchfloor * CritPos) / 6);
            int CritVal = (int) Math.round(Math.random() * 256);
            if (Critfloor > CritVal) {
                CritCapture = true;
            }
            if (CatchValue >= 255) {
                party.getCurrentParty().add(defender);
                System.out.println(defender.showName() + " has been added to your party!");
                if (ballType.equals("Heal Ball")) {
                    defender.resetHP();
                }
                if (party.getCurrentParty().size() > 6) {
                    System.out.println(defender.showName() + " cannot fit in your current party. Moving to your computer.");
                    party.getCurrentParty().remove(defender);
                    computer.getComputerParty().add(defender);
                }
                return true;
            }
            int tries = 0;
            if (CritCapture) {
                while (tries != 1) {
                    System.out.println("Critical Capture!");
                    tries += 1;
                    System.out.println(tries + "!");
                    int catchattempt = (int) Math.round(Math.random() * 256);
                    if (catchattempt > CatchValue) {
                        return false;
                    }
                }
            }
            if (!CritCapture) {
                while (tries != 3) {
                    tries += 1;
                    System.out.println(tries + "!");
                    int catchattempt = (int) Math.round(Math.random() * 65536);
                    if (catchattempt > Catchfloor) {
                        defender.setPokeBallType(ballType);
                        return false;
                    }
                }
            }
            party.getCurrentParty().add(defender);
            System.out.println(defender.showName() + " has been added to your party!");
            if (party.getCurrentParty().size() > 6) {
                System.out.println(defender.showName() + " cannot fit in your current party. Moving to your computer.");
                party.getCurrentParty().remove(defender);
                computer.getComputerParty().add(defender);
            }
            if (ballType.equals("Heal Ball")) {
                defender.resetHP();
            }
            return true;
        }
        return null;
    }
}

