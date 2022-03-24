package PlayerMechanics;
import BattleMechanics.Moves;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;
import UserInterfaces.GameScreen;
import UserInterfaces.GetStarterPokemon;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerParty {
    private List<Pokemon> CurrentParty = new ArrayList<>();

    public PlayerParty() {}

    public void NewParty(GlobalVariables globalVariables) throws InterruptedException,
            UnsupportedAudioFileException, LineUnavailableException, IOException {
        this.CurrentParty.add(new GetStarterPokemon(globalVariables).selectPokemon());}

    public List<Pokemon> getCurrentParty() {
        return this.CurrentParty;
    }

    public Boolean hasHeadButt(){
        for(Pokemon pokemon : this.CurrentParty){
            for(Moves moves : pokemon.showMoves()){
                if(moves.showName().equals("Headbutt")){
                    return true;
                }
            }
        }
        return false;
    }

    public void seePokes(GlobalVariables globalVariables){
        for(Pokemon pokemon : this.CurrentParty){
            System.out.println(pokemon);
            System.out.println(pokemon.showItem());
            System.out.println("Change Item? ");
            Scanner scanner = new Scanner(System.in);
            String change = scanner.nextLine();
            if(change.equals("y")){
                System.out.println("Take Item or give? ");
                change = scanner.nextLine();
                if(change.equals("Take")){
                    globalVariables.getItemInventory().giveItemToInventory(pokemon.takeItem());
                }
                if(change.equals("Give")){
                    pokemon.giveItem(globalVariables.getItemInventory().giveItemFromInventory());
                }
            }

        }
    }
}
