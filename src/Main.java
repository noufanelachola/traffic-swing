import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TrafficPanel extends JPanel {
    Color redColor = new Color(128,0,0);
    Color yellowColor = new Color(128,128,0);
    Color greenColor = new Color(0,128,0);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color for the outer rectangle (traffic light box)
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 50, 200, 400);

        // Draw red light
        g.setColor(redColor);
        g.fillOval(150, 75, 100, 100);

        // Draw yellow light
        g.setColor(yellowColor);
        g.fillOval(150, 200, 100, 100);

        // Draw green light
        g.setColor(greenColor);
        g.fillOval(150, 325, 100, 100);
    }

    public void changeLight(String light) {
        redColor = light.equals("Red") ? Color.RED : new Color(128,0,0);
        yellowColor = light.equals("Yellow") ? Color.YELLOW : new Color(128,128,0);
        greenColor = light.equals("Green") ? Color.GREEN : new Color(0,128,0);
        repaint();  // Repaint the panel with updated colors
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traffic");
        frame.setSize(850, 600);
        frame.setLayout(new GridLayout(1,2));

        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\04-Traffic\\traffic-lights.png");
        frame.setIconImage(icon.getImage());

//        JPanel panel = new JPanel() {};
//        panel.setPreferredSize(new Dimension(400, 600));
//        panel.setBackground(Color.BLACK);
//        panel.setPreferredSize(new Dimension(400, 600));
//        panel.setBackground(Color.BLACK);

        TrafficPanel panel = new TrafficPanel();
        panel.setBackground(Color.BLACK);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,1));

        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel("Kunnamkulam Traffic Control Unit");
        label.setFont(new Font("Poppins", Font.BOLD,25));
        label.setForeground(Color.WHITE);
        labelPanel.add(label);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setBackground(Color.DARK_GRAY);

        JRadioButton redBtn = new JRadioButton("Red");
        JRadioButton yellowBtn = new JRadioButton("Yellow");
        JRadioButton greenBtn = new JRadioButton("Green");

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(redBtn);
        btnGroup.add(yellowBtn);
        btnGroup.add(greenBtn);

        redBtn.setForeground(Color.WHITE);
        yellowBtn.setForeground(Color.WHITE);
        greenBtn.setForeground(Color.WHITE);

        redBtn.setOpaque(false);
        yellowBtn.setOpaque(false);
        greenBtn.setOpaque(false);

        redBtn.setFocusable(false);
        yellowBtn.setFocusable(false);
        greenBtn.setFocusable(false);

        panel2.add(redBtn);
        panel2.add(yellowBtn);
        panel2.add(greenBtn);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == redBtn) {
                    panel.changeLight("Red");
                } else if (e.getSource() == yellowBtn) {
                    panel.changeLight("Yellow");
                } else if (e.getSource() == greenBtn) {
                    panel.changeLight("Green");
                }
            }
        };

        redBtn.addActionListener(actionListener);
        yellowBtn.addActionListener(actionListener);
        greenBtn.addActionListener(actionListener);

        frame.add(panel);
        controlPanel.add(labelPanel);
        controlPanel.add(panel2);
        frame.add(controlPanel);


        frame.setVisible(true);
    }
}