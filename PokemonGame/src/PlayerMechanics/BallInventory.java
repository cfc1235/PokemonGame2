package PlayerMechanics;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BallInventory {
    private final List<String> ballTypes = new ArrayList<>();
    private final List<String> ballNum = new ArrayList<>();
    private final List<Integer> ballAm = new ArrayList<>();
    private String userDirectory = System.getProperty("user.dir");
    private String graphicsDirectory;
    private String audioDirectory;
    private final List<String> fileNames = new ArrayList<>();

    public BallInventory() {
        this.graphicsDirectory = this.userDirectory + "\\PokemonGame\\src\\GraphicalImages\\PokeBalls";
        this.audioDirectory = this.userDirectory + "\\PokemonGame\\src\\SoundEffects\\Pokeball\\";
        ballTypes.add("Cherish Ball");
        ballNum.add("0");
        ballAm.add(0);
        ballTypes.add("Dive Ball");
        ballNum.add("1");
        ballAm.add(0);
        ballTypes.add("Dusk Ball");
        ballNum.add("2");
        ballAm.add(0);
        ballTypes.add("Fast Ball");
        ballNum.add("3");
        ballAm.add(0);
        ballTypes.add("Friend Ball");
        ballNum.add("4");
        ballAm.add(0);
        ballTypes.add("Great Ball");
        ballNum.add("5");
        ballAm.add(0);
        ballTypes.add("Heal Ball");
        ballNum.add("6");
        ballAm.add(0);
        ballTypes.add("Heavy Ball");
        ballNum.add("7");
        ballAm.add(0);
        ballTypes.add("Level Ball");
        ballNum.add("8");
        ballAm.add(0);
        ballTypes.add("Love Ball");
        ballNum.add("9");
        ballAm.add(0);
        ballTypes.add("Luxury Ball");
        ballNum.add("10");
        ballAm.add(0);
        ballTypes.add("Master Ball");
        ballNum.add("11");
        ballAm.add(0);
        ballTypes.add("Moon Ball");
        ballNum.add("12");
        ballAm.add(0);
        ballTypes.add("Nest Ball");
        ballNum.add("13");
        ballAm.add(0);
        ballTypes.add("Net Ball");
        ballNum.add("14");
        ballAm.add(0);
        ballTypes.add("Poke Ball");
        ballNum.add("15");
        ballAm.add(10);
        ballTypes.add("Premier Ball");
        ballNum.add("16");
        ballAm.add(0);
        ballTypes.add("Quick Ball");
        ballNum.add("17");
        ballAm.add(0);
        ballTypes.add("Repeat Ball");
        ballNum.add("18");
        ballAm.add(0);
        ballTypes.add("Safari Ball");
        ballNum.add("19");
        ballAm.add(0);
        ballTypes.add("Sport Ball");
        ballNum.add("20");
        ballAm.add(0);
        ballTypes.add("Timer Ball");
        ballNum.add("21");
        ballAm.add(0);
        ballTypes.add("Ultra Ball");
        ballNum.add("22");
        ballAm.add(0);
        Path path = Paths.get(this.graphicsDirectory);
        File f = new File(String.valueOf(path));
        for (File paths : f.listFiles()) {
            if(!paths.getName().equals("openBall.png")) {
                fileNames.add(paths.getName());
            }
        }
    }

    public List<String> showballTypes() {
        return ballTypes;
    }

    public List<String> showballNum() {
        return ballNum;
    }

    public List<Integer> showballAm() {
        return ballAm;
    }

    public void addBalls(int balltype, int ballamount) {
        int ballam = ballAm.get(balltype);
        ballam += ballamount;
        ballAm.set(balltype, ballam);
    }

    public void takeoutBall(int balltype) {
        int ballam = ballAm.get(balltype);
        ballam -= 1;
        ballAm.set(balltype, ballam);
    }

    public ImageIcon getBallImage(String ballType) {
        if(ballType.equals("openBall.png")){
            ImageIcon imageIcon = new ImageIcon(this.graphicsDirectory + "\\"+ ballType);
            Image image = imageIcon.getImage();
            Image newImg = image.getScaledInstance(500, 415, java.awt.Image.SCALE_SMOOTH);
            return new ImageIcon(newImg);
        }
        int i = this.ballTypes.indexOf(ballType);
        ImageIcon imageIcon = new ImageIcon(this.graphicsDirectory + "\\"+ fileNames.get(i));
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(500, 415, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

    public String getPokeballOpenThrownSound(String effectType){
        if(effectType.equals("openPokeball")) {
            return audioDirectory + "pokeballOpen.wav";
        }
        else {
            return "";
        }
    }

}