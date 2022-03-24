package Interfaces;

import PlayerMechanics.BallInventory;
import PokemonCreation.Pokemon;
import UserInterfaces.GameScreen;

import javax.sound.sampled.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class Animations {

    public static void playPokeIntro(Pokemon pokemon, GlobalVariables globalVariables, JPanel jPanel, String type)
            throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        GameScreen gameScreen = globalVariables.getGameScreen();
        BallInventory ballInventory = globalVariables.getBallInventory();
        gameScreen.clearSetPanel(jPanel);
        if(type.equals("Trainer") || type.equals("Gym")) {
            gameScreen.addLabelToPanel(jPanel, gameScreen.createLabel(
                    ballInventory.getBallImage(pokemon.getPokeBallType())));
            jPanel.setVisible(true);
            TimeUnit.MILLISECONDS.sleep(250);
            gameScreen.clearSetPanel(jPanel);
            gameScreen.addLabelToPanel(jPanel, gameScreen.createLabel(
                    ballInventory.getBallImage("openBall.png")));
            jPanel.setVisible(true);
            Clip clip = getSoundEffect(ballInventory.getPokeballOpenThrownSound("openPokeball"));
            clip.start();
            TimeUnit.MILLISECONDS.sleep(250);
            gameScreen.clearSetPanel(jPanel);
        }
        gameScreen.addLabelToPanel(jPanel, gameScreen.createLabel(pokemon.getPokeImage()));
        jPanel.setVisible(true);
        Clip clip = getSoundEffect(pokemon.getPokeCry());
        clip.start();
        TimeUnit.SECONDS.sleep(1);
        clip.stop();
    }

    public static Clip getSoundEffect(String effect) throws IOException,
            UnsupportedAudioFileException, LineUnavailableException {
        File f = new File(effect);
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(f);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        return clip;
    }

}
