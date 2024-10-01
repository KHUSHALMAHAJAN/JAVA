import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/* 
<applet code="mouse.class" height="300" width="300"></applet> 
*/

public class mouse extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int xposition = 0, yposition = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // Overriding the mouseClicked method
    public void mouseClicked(MouseEvent m) {
        xposition = m.getX();
        yposition = m.getY();
        msg = "Mouse clicked";
        repaint();
    }

    // Overriding the mousePressed method
    public void mousePressed(MouseEvent m) {
        xposition = m.getX();
        yposition = m.getY();
        msg = "Mouse pressed";
        repaint();
    }

    // Other required methods of MouseListener and MouseMotionListener
    public void mouseReleased(MouseEvent m) {
    }

    public void mouseEntered(MouseEvent m) {
    }

    public void mouseExited(MouseEvent m) {
    }

    public void mouseDragged(MouseEvent m) {
    }

    public void mouseMoved(MouseEvent m) {
    }

    // Draw the message at the mouse position
    public void paint(Graphics g) {
        g.drawString(msg, xposition, yposition);
    }
}
