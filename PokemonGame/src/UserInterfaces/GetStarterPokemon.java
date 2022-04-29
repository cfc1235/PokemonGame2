package UserInterfaces;

import Interfaces.Animations;
import Interfaces.GlobalVariables;
import Pokedex.B.Bulbasaur;
import Pokedex.C.Charmander;
import Pokedex.S.Squirtle;
import PokemonCreation.PokeColors;
import PokemonCreation.Pokemon;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GetStarterPokemon {
    private Pokemon starterBulbasaur;
    private final JButton bulbasaurButton;
    private Pokemon starterCharmander;
    private final JButton charmanderButton;
    private Pokemon starterSquirtle;
    private final JButton squirtleButton;
    private GameScreen gameScreen;
    private final JButton confirmButton = new JButton("Confirm");
    private final JButton backButton = new JButton("Back");
    private final JPanel enemyTop;
    private final JPanel playerTop;
    private final JPanel interfaceTop;
    private final JPanel interfaceBottom;
    private GlobalVariables globalVariables;

    public GetStarterPokemon(GlobalVariables globalVariables){
        final int level = 5;
        this.globalVariables = globalVariables;
        this.starterCharmander = new Charmander(level, globalVariables);
        this.charmanderButton = new JButton(this.starterCharmander.toHTMLString());
        this.starterSquirtle = new Squirtle(level, globalVariables);
        this.squirtleButton = new JButton(this.starterSquirtle.toHTMLString());
        this.starterBulbasaur = new Bulbasaur(level, globalVariables);
        this.bulbasaurButton = new JButton(this.starterBulbasaur.toHTMLString());
        this.gameScreen = globalVariables.getGameScreen();
        this.enemyTop = this.gameScreen.getEnemyTop();
        this.playerTop = this.gameScreen.getUserTop();
        this.interfaceTop = this.gameScreen.getInterfaceTop();
        this.interfaceBottom = this.gameScreen.getInterfaceBottom();
    }

    private void createScreen(){
        gameScreen.clearScreen();
        bulbasaurButton.setFont(new Font("Arial", Font.PLAIN, 25));
        charmanderButton.setFont(new Font("Arial", Font.PLAIN, 25));
        squirtleButton.setFont(new Font("Arial", Font.PLAIN, 25));
        Dimension buttonSize = new Dimension(gameScreen.getPanelSize().width - 10, gameScreen.getPanelSize().height - 5);
        gameScreen.setButtonSize(bulbasaurButton, buttonSize);
        gameScreen.setButtonSize(charmanderButton, buttonSize);
        gameScreen.setButtonSize(squirtleButton, buttonSize);
        bulbasaurButton.setBorder(PokeColors.getBorder(starterBulbasaur));
        squirtleButton.setBorder(PokeColors.getBorder(starterSquirtle));
        charmanderButton.setBorder(PokeColors.getBorder(starterCharmander));
        enemyTop.add(bulbasaurButton);
        playerTop.add(charmanderButton);
        interfaceTop.add(squirtleButton);
        gameScreen.showScreen();
    }

    private Pokemon setPokeScreen(){
        createScreen();
        final Boolean[] start = new Boolean[1];
        start[0] = false;
        final Pokemon[] selectPoke = new Pokemon[1];
        selectPoke[0] = null;
        while(!start[0]){
            bulbasaurButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    start[0] = true;
                    selectPoke[0] = starterBulbasaur;
                }
            });
            squirtleButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    start[0] = true;
                    selectPoke[0] = starterSquirtle;
                }
            });
            charmanderButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    start[0] = true;
                    selectPoke[0] = starterCharmander;
                }
            });
        }
        return selectPoke[0];
    }

    private void createConfirmScreen(Pokemon starterPoke)
            throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        this.gameScreen.clearScreen();
        this.backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        this.confirmButton.setFont(new Font("Arial", Font.PLAIN, 25));
        Dimension buttonSize = new Dimension(gameScreen.getPanelSize().width, (gameScreen.getPanelSize().height/2));
        this.gameScreen.setButtonSize(this.confirmButton, buttonSize);
        this.gameScreen.setButtonSize(this.backButton, buttonSize);
        this.confirmButton.setBorder(PokeColors.getBorder(starterPoke));
        this.backButton.setBorder(PokeColors.getBorder(starterPoke));
        this.gameScreen.setPanelYLayout(interfaceBottom);
        this.interfaceBottom.add(this.confirmButton);
        this.interfaceBottom.add(this.backButton);
        this.interfaceBottom.setAlignmentX(Component.CENTER_ALIGNMENT);
        gameScreen.showScreen();
        Animations.playPokeIntro(starterPoke, this.globalVariables, this.interfaceTop, "Trainer");
    }

    private Boolean setConfirm(Pokemon starterPoke) throws InterruptedException,
            UnsupportedAudioFileException, LineUnavailableException, IOException {
        createConfirmScreen(starterPoke);
        final Boolean[] confirm = new Boolean[1];
        confirm[0] = null;
        final Boolean[] continueOn = new Boolean[1];
        continueOn[0] = false;
        while (!continueOn[0]){
            confirmButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    confirm[0] = true;
                    continueOn[0] = true;
                }
            });
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    confirm[0] = false;
                    continueOn[0] = true;
                }
            });
        }
        return confirm[0];
    }

    public Pokemon selectPokemon() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        Pokemon starter = setPokeScreen();
        if(!setConfirm(starter)){
            return selectPokemon();
        }
        return starter;
    }
}
