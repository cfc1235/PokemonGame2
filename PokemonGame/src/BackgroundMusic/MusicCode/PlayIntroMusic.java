package BackgroundMusic.MusicCode;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlayIntroMusic extends Thread {

    public void run(){
        List<File> IntroMusic = new ArrayList<>();
        System.out.println("");
        String userDirectory = System.getProperty("user.dir");
        userDirectory += "\\PokemonGame\\src\\BackgroundMusic\\IntroMusic";
        Path path = Paths.get(userDirectory);
        File f = new File(String.valueOf(path));
        for (File paths : f.listFiles()) {
            IntroMusic.add(paths);
        }
        Boolean again = true;
        while (again) {
            AudioInputStream audioInput = null;
            try {
                audioInput = AudioSystem.getAudioInputStream(IntroMusic.get(0));
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
