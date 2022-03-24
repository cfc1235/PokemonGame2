package UserInterfaces;

import Locations.AreaTypes.AreaTypes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen {
    private JButton healButton = new JButton("Heal Pokemon");
    private JButton moveButton = new JButton("Move On");

    public HomeScreen(){}

    private void setUpScreen(GameScreen gameScreen){
        gameScreen.clearScreen();
        healButton.setFont(new Font("Arial", Font.PLAIN, 25));
        moveButton.setFont(new Font("Arial", Font.PLAIN, 25));
        JPanel topPanel = gameScreen.getInterfaceTop();
        JTextField setName = new JTextField();
        setName.setHorizontalAlignment(JTextField.CENTER);
        setName.setFont(new Font("Arial", Font.PLAIN, 25));
        setName.setText("What would you like to do?");
        setName.setEditable(false);
        gameScreen.setTextFieldSize(setName, gameScreen.getPanelSize());
        topPanel.add(setName);
        JPanel bottomPanel = gameScreen.getInterfaceBottom();
        gameScreen.setPanelSize(bottomPanel, gameScreen.getPanelSize());
        gameScreen.setPanelYLayout(bottomPanel);
        Dimension buttonSize = new Dimension(gameScreen.getPanelXSize(), gameScreen.getPanelSize().height/(2));
        gameScreen.setButtonSize(healButton, buttonSize);
        bottomPanel.add(healButton);
        gameScreen.setButtonSize(moveButton, buttonSize);
        bottomPanel.add(moveButton);
        bottomPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        gameScreen.showScreen();
    }

    public String doHome(GameScreen gameScreen){
        setUpScreen(gameScreen);
        final Boolean[] gotVar = new Boolean[1];
        gotVar[0] = false;
        final String[] doAction = new String[1];
        while(!gotVar[0]) {
            healButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    doAction[0] = "Heal";
                    gotVar[0] = true;
                }
            });
            moveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    doAction[0] = "Move";
                    gotVar[0] = true;
                }
            });
        }
        return doAction[0];
    }
}
