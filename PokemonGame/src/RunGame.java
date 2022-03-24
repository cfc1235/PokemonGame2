import BackgroundMusic.MusicCode.PlayIntroMusic;
import Interfaces.GlobalVariables;
import Interfaces.TimeChange;
import Locations.AreaTypes.AreaTypes;
import UserInterfaces.IntroScreen;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class RunGame {

    public static void main(String[] args) throws InterruptedException,
            UnsupportedAudioFileException, LineUnavailableException, IOException {
        GlobalVariables globalVariables = new GlobalVariables();
        PlayIntroMusic playIntroMusic = new PlayIntroMusic();
        playIntroMusic.start();
        IntroScreen introScreen = new IntroScreen();
        introScreen.startGame(globalVariables.getGameScreen());
        globalVariables.getParty().NewParty(globalVariables);
        AreaTypes currentArea = globalVariables.getWorldMap().goHome();
        try {
            playIntroMusic.interrupt();
        } catch (Exception e) {
        }
        System.out.println(currentArea.getName());
        TimeChange timeChange = new TimeChange(globalVariables);
        timeChange.start();
        while (true) {
            currentArea = currentArea.resolveCurrentArea(globalVariables);
        }
    }
}



