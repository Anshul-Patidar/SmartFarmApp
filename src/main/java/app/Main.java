package app;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("🚜 SMART FARM MANAGER v1.0");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);

        // Set background color
        window.getContentPane().setBackground(new Color(240, 248, 255)); // light blue

        // TITLE LABEL
        JLabel title = new JLabel("🚜 SMART FARM MANAGER v1.0", JLabel.CENTER);
        title.setBounds(0, 10, 800, 40);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        window.add(title);

        // BUTTON PANEL
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 15)); // 4 rows, 2 columns, spacing
        panel.setBounds(50, 80, 300, 300);
        panel.setBackground(new Color(173, 216, 230)); // panel light cyan
        panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        // BUTTONS
        JButton weatherBtn = new JButton("🌤️ Weather");
        weatherBtn.addActionListener(e -> new WeatherWindow());
        panel.add(weatherBtn);

        JButton pricesBtn = new JButton("💰 Prices");
        pricesBtn.addActionListener(e -> new PricesWindow());
        panel.add(pricesBtn);

        JButton reportsBtn = new JButton("📊 Reports");
        reportsBtn.addActionListener(e -> new ReportsWindow());
        panel.add(reportsBtn);

        JButton calendarBtn = new JButton("📅 Calendar");
        calendarBtn.addActionListener(e -> new CalendarWindow());
        panel.add(calendarBtn);

        JButton cropsBtn = new JButton("🌱 Crops");
        cropsBtn.addActionListener(e -> new CropsWindow());
        panel.add(cropsBtn);

        JButton pestsBtn = new JButton("🐛 Pests");
        pestsBtn.addActionListener(e -> new PestsWindow());
        panel.add(pestsBtn);

        JButton irrigationBtn = new JButton("💧 Irrigation");
        irrigationBtn.addActionListener(e -> new IrrigationWindow());
        panel.add(irrigationBtn);

        JButton inventoryBtn = new JButton("🧺 Inventory");
        inventoryBtn.addActionListener(e -> new InventoryWindow());
        panel.add(inventoryBtn);

        window.add(panel);

        // FOOTER INFO PANEL
        JPanel footer = new JPanel();
        footer.setLayout(new GridLayout(3,1));
        footer.setBounds(400, 80, 350, 120);
        footer.setBackground(new Color(224, 255, 255)); // lighter cyan
        footer.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        JLabel footer1 = new JLabel("TODAY'S WEATHER: Sunny, 28°C");
        JLabel footer2 = new JLabel("TASKS: Water Field A (2PM)");
        JLabel footer3 = new JLabel("ALERTS: Rain expected tomorrow");

        footer.add(footer1);
        footer.add(footer2);
        footer.add(footer3);

        window.add(footer);

        window.setVisible(true);
    }
}
