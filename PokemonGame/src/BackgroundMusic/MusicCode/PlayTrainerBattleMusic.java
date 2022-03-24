package BackgroundMusic.MusicCode;

import PlayerMechanics.PlayerParty;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlayTrainerBattleMusic extends Thread{
    private String type;
    public PlayTrainerBattleMusic(String type){
        this.type = type;
    }
    public void run(){
        List<File> IntroMusic = new ArrayList<>();
        System.out.println("");
        String userDirectory = System.getProperty("user.dir");
        if(type.equals("Trainer")) {
            userDirectory += "\\PokemonGame\\src\\BackgroundMusic\\TrainerMusic";
        }
        if(type.equals("Wild")) {
            userDirectory += "\\PokemonGame\\src\\BackgroundMusic\\TrainerMusic";
        }
        if(type.equals("Gym")) {
            userDirectory += "\\PokemonGame\\src\\BackgroundMusic\\TrainerMusic";
        }
        Path path = Paths.get(userDirectory);
        File f = new File(String.valueOf(path));
        for (File paths : f.listFiles()) {
            IntroMusic.add(paths);
        }
        Boolean again = true;
        while (again) {
            AudioInputStream audioInput = null;
            int MusicNum = (int) (Math.random() * IntroMusic.size());
            try {
                audioInput = AudioSystem.getAudioInputStream(IntroMusic.get(MusicNum));
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Clip clip = null;
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            try {
                clip.open(audioInput);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            clip.start();
            try {
                Thread.currentThread().sleep(clip.getMicrosecondLength()/1000);
            } catch (InterruptedException e) {
                again = false;
                clip.stop();
            }
        }
    }
}
