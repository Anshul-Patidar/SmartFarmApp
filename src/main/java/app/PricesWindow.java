package app;

import java.awt.*;
import javax.swing.*;

public class PricesWindow extends JFrame {

    public PricesWindow() {
        setTitle("Market Prices");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("💰 Market Prices", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel wheat = new JLabel("Wheat: ₹2200/quintal");
        wheat.setFont(new Font("Arial", Font.PLAIN, 16));
        wheat.setBounds(50, 80, 300, 30);
        add(wheat);

        JLabel rice = new JLabel("Rice: ₹3100/quintal");
        rice.setFont(new Font("Arial", Font.PLAIN, 16));
        rice.setBounds(50, 120, 300, 30);
        add(rice);

        setVisible(true);
    }
}
