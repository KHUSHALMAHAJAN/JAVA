
/*<applet code="changecolor" width=600 height=600>
 * </applet>
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.lang.ProcessBuilder.Redirect;

public class changecolor extends Applet {

    Button b1, b2, b3;

    public void init() {
        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.GREEN);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE);
            }
        });

    }

}
