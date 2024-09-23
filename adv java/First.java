import javax.swing.*;
import java.awt.*;

public class First extends JFrame {

    public First() {
        setTitle("First Swing Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Override paint method to draw text
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass paint method
        g.drawString("Welcome to coding world", 150, 150);
    }

    public static void main(String[] args) {
        new First(); // Create and show the JFrame
    }
}
