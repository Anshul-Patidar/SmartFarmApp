package app;

import java.awt.*;
import javax.swing.*;

public class CropsWindow extends JFrame {

    public CropsWindow() {
        setTitle("Crops Information");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("🌱 Crops", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel crop1 = new JLabel("Wheat - Field A");
        crop1.setFont(new Font("Arial", Font.PLAIN, 16));
        crop1.setBounds(50, 80, 300, 30);
        add(crop1);

        JLabel crop2 = new JLabel("Rice - Field B");
        crop2.setFont(new Font("Arial", Font.PLAIN, 16));
        crop2.setBounds(50, 120, 300, 30);
        add(crop2);

        setVisible(true);
    }
}
