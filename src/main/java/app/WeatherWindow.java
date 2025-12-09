package app;

import java.awt.*;
import javax.swing.*;

public class WeatherWindow extends JFrame {

    public WeatherWindow() {
        setTitle("Weather Information");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center on screen

        JLabel title = new JLabel("🌤️ Today's Weather", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        JLabel temp = new JLabel("Temperature: 28°C");
        temp.setFont(new Font("Arial", Font.PLAIN, 18));
        temp.setBounds(50, 80, 300, 30);
        add(temp);

        JLabel cond = new JLabel("Condition: Sunny");
        cond.setFont(new Font("Arial", Font.PLAIN, 18));
        cond.setBounds(50, 120, 300, 30);
        add(cond);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new WeatherWindow();
    }
}
