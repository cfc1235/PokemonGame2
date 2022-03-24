package UserInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroScreen{
    private JButton startGame = new JButton("START GAME");

    public IntroScreen(){}

    private void setIntroScreen(GameScreen gameScreen){
        JPanel nameScreen = gameScreen.getInterfaceTop();
        JPanel buttonScreen = gameScreen.getInterfaceBottom();
        gameScreen.clearScreen();
        JTextField text1 = new JTextField();
        text1.setHorizontalAlignment(JTextField.CENTER);
        text1.setFont(new Font("Arial", Font.PLAIN, 40));
        text1.setText("POKEMON CF");
        text1.setEditable(false);
        gameScreen.setTextFieldSize(text1, gameScreen.getPanelSize());
        nameScreen.add(text1);
        gameScreen.setPanelXLayout(buttonScreen);
        startGame.setFont(new Font("Arial", Font.PLAIN, 40));
        startGame.setSize(gameScreen.getPanelSize());
        startGame.setMaximumSize(gameScreen.getPanelSize());
        startGame.setMinimumSize(gameScreen.getPanelSize());
        startGame.setPreferredSize(gameScreen.getPanelSize());
        buttonScreen.add(startGame);
        gameScreen.showScreen();
    }

    public void startGame(GameScreen gameScreen){
        setIntroScreen(gameScreen);
        final Boolean[] start = new Boolean[1];
        start[0] = false;
        while(!start[0]){
            startGame.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    start[0] = true;
                }
            });
        }
    }
}
