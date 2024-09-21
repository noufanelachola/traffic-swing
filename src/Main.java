import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traffic");
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\04-Traffic\\traffic-lights.png");
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
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