package app;

import java.awt.*;
import javax.swing.*;

public class PestsWindow extends JFrame {

    public PestsWindow() {
        setTitle("Pest Information");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("🐛 Pests", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel pest1 = new JLabel("Aphids detected in Field A");
        pest1.setFont(new Font("Arial", Font.PLAIN, 16));
        pest1.setBounds(50, 80, 300, 30);
        add(pest1);

        JLabel pest2 = new JLabel("Leaf Rust in Wheat Field");
        pest2.setFont(new Font("Arial", Font.PLAIN, 16));
        pest2.setBounds(50, 120, 300, 30);
        add(pest2);

        setVisible(true);
    }
}
