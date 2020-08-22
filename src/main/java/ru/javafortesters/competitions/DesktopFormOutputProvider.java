package ru.javafortesters.competitions;
import javax.swing.*;
import java.awt.*;

public class DesktopFormOutputProvider implements IOutputProvider {
    private JFrame mainFrame;
    private JPanel panel;
    private GridBagConstraints gbc;

    public DesktopFormOutputProvider(String teamName) {
        mainFrame=new JFrame("Команда " + teamName);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //mainFrame.setLayout(new FlowLayout());
        panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        mainFrame.add(panel);
        mainFrame.setLocationRelativeTo(null);
        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    }
    //Вывод информации в экранные формы

    public void print(String message) {
    JLabel label=new JLabel(message,JLabel.LEFT);
    panel.add(label,gbc);
    mainFrame.setVisible(true);
    }
}
