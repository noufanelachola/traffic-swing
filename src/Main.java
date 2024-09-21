import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traffic");
        frame.setSize(800, 600);

        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\04-Traffic\\traffic-lights.png");
        frame.setIconImage(icon.getImage());

        frame.setVisible(true);
    }
}