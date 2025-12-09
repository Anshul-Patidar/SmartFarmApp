package app;

import java.awt.*;
import javax.swing.*;

public class ReportsWindow extends JFrame {

    public ReportsWindow() {
        setTitle("Reports");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("📊 Reports", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel sample = new JLabel("No reports available yet", JLabel.CENTER);
        sample.setFont(new Font("Arial", Font.PLAIN, 16));
        sample.setBounds(50, 80, 300, 30);
        add(sample);

        setVisible(true);
    }
}
