import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="chagecolor2.class" width=350 height=200>
</applet>
*/

public class chagecolor2 extends Applet implements ActionListener {
    Button button = new Button("change color");
    boolean flag = true;

    public void init() {
        add(button);
        button.addActionListener(this);
    }

    public void paint(Graphics g) {
        if (flag) {
            setBackground(Color.yellow);
        } else {
            setBackground(Color.red);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("change color")) { // Matching the exact button label
            flag = !flag;
            repaint(); // Request the applet to repaint
        }
    }
}
