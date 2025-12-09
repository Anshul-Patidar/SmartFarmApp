package app;

import java.awt.*;
import javax.swing.*;

public class InventoryWindow extends JFrame {

    public InventoryWindow() {
        setTitle("Inventory");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("🧺 Inventory", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel seeds = new JLabel("Seeds: Wheat - 50kg, Rice - 30kg");
        seeds.setFont(new Font("Arial", Font.PLAIN, 16));
        seeds.setBounds(50, 80, 300, 30);
        add(seeds);

        JLabel fertilizers = new JLabel("Fertilizers: Urea - 20kg, DAP - 15kg");
        fertilizers.setFont(new Font("Arial", Font.PLAIN, 16));
        fertilizers.setBounds(50, 120, 300, 30);
        add(fertilizers);

        setVisible(true);
    }
}
