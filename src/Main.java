import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traffic");
        frame.setSize(850, 600);
        frame.setLayout(new GridLayout(1,2));

        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\04-Traffic\\traffic-lights.png");
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Set color for the outer rectangle (traffic light box)
                g.setColor(Color.DARK_GRAY);
                g.fillRect(100, 50, 200, 400); // x, y, width, height

                // Set color and draw the red light
                g.setColor(Color.RED);
                g.fillOval(150, 75, 100, 100); // x, y, width, height

                // Set color and draw the yellow light
                g.setColor(Color.YELLOW);
                g.fillOval(150, 200, 100, 100); // x, y, width, height

                // Set color and draw the green light
                g.setColor(Color.GREEN);
                g.fillOval(150, 325, 100, 100); // x, y, width, height
            }
        };
        panel.setPreferredSize(new Dimension(400, 600));
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(400, 600));
        panel.setBackground(Color.BLACK);

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(400, 600));
        panel2.setBackground(Color.GREEN);

        frame.add(panel);
        frame.add(panel2);

        frame.setVisible(true);
    }
}