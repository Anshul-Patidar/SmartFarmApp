package app;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;

public class CalendarWindow extends JFrame {

    public CalendarWindow() {
        setTitle("Calendar");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null); // center

        JLabel title = new JLabel("📅 Calendar", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(0, 10, 400, 40);
        add(title);

        LocalDate today = LocalDate.now();
        JLabel dateLabel = new JLabel("Today's date: " + today.toString(), JLabel.CENTER);
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dateLabel.setBounds(50, 80, 300, 30);
        add(dateLabel);

        setVisible(true);
    }
}
