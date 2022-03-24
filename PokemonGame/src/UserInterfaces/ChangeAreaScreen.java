package UserInterfaces;

import Locations.AreaTypes.AreaTypes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeAreaScreen{
    private JButton stayButton = new JButton("Stay Here");
    private JButton button2 = null;
    private JButton button3 = null;

    public ChangeAreaScreen(){}

    private void changeAreaScreen(AreaTypes currArea, GameScreen gameScreen) {
        stayButton.setFont(new Font("Arial", Font.PLAIN, 25));
        gameScreen.clearScreen();
        JPanel topPanel = gameScreen.getInterfaceTop();
        JTextField setName = new JTextField();
        setName.setHorizontalAlignment(JTextField.CENTER);
        setName.setFont(new Font("Arial", Font.PLAIN, 25));
        setName.setText("Where would you like to go?");
        setName.setEditable(false);
        gameScreen.setTextFieldSize(setName, gameScreen.getPanelSize());
        topPanel.add(setName);
        JPanel bottomPanel = gameScreen.getInterfaceBottom();
        gameScreen.setPanelYLayout(bottomPanel);
        Dimension buttonSize = new Dimension(gameScreen.getPanelSize().width, gameScreen.getPanelSize().height/(currArea.getAllPossibleAreas().size() + 1));
        gameScreen.setButtonSize(stayButton, buttonSize);
        bottomPanel.add(stayButton);
        if(currArea.getAllPossibleAreas().size() >= 1){
            button2 = new JButton(currArea.getAllPossibleAreas().get(0).getName());
            button2.setFont(new Font("Arial", Font.PLAIN, 25));
            gameScreen.setButtonSize(button2, buttonSize);
            bottomPanel.add(button2);
        }
        if(currArea.getAllPossibleAreas().size() >= 2){
            button3 = new JButton(currArea.getAllPossibleAreas().get(1).getName());
            gameScreen.setButtonSize(button3, buttonSize);
            button3.setFont(new Font("Arial", Font.PLAIN, 25));
            bottomPanel.add(button3);
        }
        gameScreen.showScreen();
    }

    public AreaTypes getNewArea(AreaTypes currArea, GameScreen gameScreen){
        changeAreaScreen(currArea, gameScreen);
        final Boolean[] gotVar = new Boolean[1];
        gotVar[0] = false;
        final AreaTypes[] newArea = new AreaTypes[1];
        while(!gotVar[0]) {
            stayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    newArea[0] = currArea;
                    gotVar[0] = true;
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    newArea[0] = currArea.getAllPossibleAreas().get(0);
                    gotVar[0] = true;
                }
            });
            try {
                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newArea[0] = currArea.getAllPossibleAreas().get(1);
                        gotVar[0] = true;
                    }
                });
            } catch (Exception e) {
            }
        }
        return newArea[0];
    }
}
