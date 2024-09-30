import javax.swing.JApplet;
import java.awt.*;

/* 
<applet code="jface.class" height="300" width="300"></applet> 
*/
public class jface extends JApplet {
    public void paint(Graphics g) {
        g.drawOval(20, 40, 250, 250);
        g.drawOval(70, 100, 50, 50);
        g.drawOval(180, 100, 50, 50);
        g.drawArc(100, 150, 100, 100, 180, 180);
    }
}
