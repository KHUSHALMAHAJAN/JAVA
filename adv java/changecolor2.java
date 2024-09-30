import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* 
<applet code="changecolor2.class" height="300" width="300"></applet> 
*/

public class changecolor2 extends Applet implements ActionListener {
    Button button = new Button("change a color");
    boolean flag = true;

    public void init() {
        add(button);
        button.addActionListener(this);
    }

    public void paint(Graphics g) {
        if (flag) {
            setBackground(Color.YELLOW);
            button = new Button("change a color yellow");
        } else {
            setBackground(Color.RED);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("change a color")) {
            flag = !flag;
            // button = new Button("change a color yellow");
            repaint();
        }
    }
}
