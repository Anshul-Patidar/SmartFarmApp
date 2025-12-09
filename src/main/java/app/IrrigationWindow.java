package app;

import java.awt.*;
import javax.swing.*;

public class IrrigationWindow extends JFrame {

    public IrrigationWindow() {
        setTitle("Irrigation Control");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("💧 Irrigation", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel fieldA = new JLabel("Field A: Moisture 45%");
        fieldA.setFont(new Font("Arial", Font.PLAIN, 16));
        fieldA.setBounds(50, 80, 300, 30);
        add(fieldA);

        JLabel fieldB = new JLabel("Field B: Moisture 55%");
        fieldB.setFont(new Font("Arial", Font.PLAIN, 16));
        fieldB.setBounds(50, 120, 300, 30);
        add(fieldB);

        JLabel suggestion = new JLabel("Suggestion: Irrigate Field A today", JLabel.CENTER);
        suggestion.setFont(new Font("Arial", Font.PLAIN, 16));
        suggestion.setBounds(50, 160, 300, 30);
        add(suggestion);

        setVisible(true);
    }
}
