package UserInterfaces;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class GameScreen {

    private final JFrame fullScreen = new JFrame("Pokemon Game");
    private final JPanel userTop = new JPanel();
    private final JPanel userBottom = new JPanel();
    private final JPanel interfaceTop = new JPanel();
    private final JPanel interfaceBottom = new JPanel();
    private final JPanel enemyTop = new JPanel();
    private final JPanel enemyBottom = new JPanel();
    private final JPanel userScreen = new JPanel();
    private final JPanel interfaceScreen = new JPanel();
    private final JPanel enemyScreen = new JPanel();
    private final Dimension panelSize;
    private final JPanel fullPanel = new JPanel();

    public GameScreen(){
        fullScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fullScreen.setVisible(false);
        fullScreen.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        fullScreen.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        int fullX = Toolkit.getDefaultToolkit().getScreenSize().width;
        int fullY = Toolkit.getDefaultToolkit().getScreenSize().height;
        fullPanel.setSize(fullX, fullY);
        fullPanel.setLayout(new BoxLayout(fullPanel, BoxLayout.X_AXIS));
        Dimension fullPanelSize = new Dimension(fullX/3, fullY);
        setPanelSize(userScreen, fullPanelSize);
        setPanelSize(interfaceScreen, fullPanelSize);
        setPanelSize(enemyScreen, fullPanelSize);
        setPanelYLayout(userScreen);
        setPanelYLayout(interfaceScreen);
        setPanelYLayout(enemyScreen);
        enemyScreen.setBorder(new LineBorder(Color.RED));
        interfaceScreen.setBorder(new LineBorder(Color.BLUE));
        userScreen.setBorder(new LineBorder(Color.GREEN));
        panelSize = new Dimension(fullX/3, fullY/2);
        setPanelSize(userBottom, panelSize);
        setPanelSize(userTop, panelSize);
        setPanelSize(enemyTop, panelSize);
        setPanelSize(enemyBottom, panelSize);
        setPanelSize(interfaceBottom, panelSize);
        setPanelSize(interfaceTop, panelSize);
        userTop.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
        enemyTop.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
        interfaceTop.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
        interfaceScreen.add(interfaceTop);
        interfaceScreen.add(interfaceBottom);
        userScreen.add(userTop);
        userScreen.add(userBottom);
        enemyScreen.add(enemyTop);
        enemyScreen.add(enemyBottom);
        fullPanel.add(userScreen);
        fullPanel.add(interfaceScreen);
        fullPanel.add(enemyScreen);
        fullScreen.add(fullPanel);
        fullScreen.setVisible(true);
        fullPanel.setVisible(true);
        userScreen.setVisible(true);
        enemyScreen.setVisible(true);
        interfaceScreen.setVisible(true);
        userBottom.setVisible(true);
        userTop.setVisible(true);
        interfaceBottom.setVisible(true);
        interfaceTop.setVisible(true);
        enemyBottom.setVisible(true);
        enemyTop.setVisible(true);
    }

    public void setPanelXLayout(JPanel panel){
        panel.setVisible(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    }

    public void setPanelYLayout(JPanel panel){
        panel.setVisible(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    public void setPanelSize(JPanel panel, Dimension size){
        panel.setVisible(false);
        panel.setSize(size);
        panel.setMaximumSize(size);
        panel.setPreferredSize(size);
        panel.setMinimumSize(size);
    }

    public void setTextFieldSize(JTextField tf, Dimension size){
        tf.setMaximumSize(size);
        tf.setSize(size);
        tf.setPreferredSize(size);
        tf.setMinimumSize(size);
    }
    public void setButtonSize(JButton button, Dimension size){
        button.setMaximumSize(size);
        button.setPreferredSize(size);
        button.setMinimumSize(size);
    }
    public Dimension getPanelSize(){return panelSize;}
    public int getPanelXSize(){return panelSize.width;}
    public int getPanelYSize(){return panelSize.height;}
    public JPanel getUserTop(){
        return userTop;
    }
    public JPanel getUserBottom(){
        return userBottom;
    }
    public JPanel getUserScreen(){
        return userScreen;
    }
    public JPanel getInterfaceTop(){
        return interfaceTop;
    }
    public JPanel getInterfaceBottom(){
        return interfaceBottom;
    }
    public JPanel getInterfaceScreen(){return interfaceScreen;}
    public JPanel getEnemyTop(){return enemyTop;}
    public JPanel getEnemyBottom(){return enemyBottom;}
    public JPanel getEnemyScreen(){return enemyScreen;}
    public JPanel getFullPanel(){return fullPanel;}
    public JFrame getFullScreen(){return fullScreen;}
    public void clearScreen(){
        clearEnemyBottom();
        clearEnemyTop();
        clearInterfaceTop();
        clearInterfaceBottom();
        clearUserTop();
        clearUserBottom();
    }
    public void clearSetPanel(JPanel panel){
        panel.setVisible(false);
        panel.removeAll();
    }
    public void clearEnemyTop(){
        enemyTop.setVisible(false);
        enemyTop.removeAll();
    }
    public void clearEnemyBottom(){
        enemyBottom.setVisible(false);
        enemyBottom.removeAll();
    }
    public void clearInterfaceTop(){
        interfaceTop.setVisible(false);
        interfaceTop.removeAll();
    }
    public void clearInterfaceBottom(){
        interfaceBottom.setVisible(false);
        interfaceBottom.removeAll();
    }
    public void clearUserTop(){
        userTop.setVisible(false);
        userTop.removeAll();
    }
    public void clearUserBottom(){
        userBottom.setVisible(false);
        userBottom.removeAll();
    }
    public void showScreen(){
        userBottom.setVisible(true);
        userTop.setVisible(true);
        interfaceBottom.setVisible(true);
        interfaceTop.setVisible(true);
        enemyBottom.setVisible(true);
        enemyTop.setVisible(true);
    }

    public JLabel createLabel(ImageIcon imageIcon){
        return new JLabel(imageIcon);
    }

    public void addLabelToPanel(JPanel jPanel, JLabel jLabel){
        jPanel.setLayout(new FlowLayout());
        jPanel.add(jLabel);
    }
}
