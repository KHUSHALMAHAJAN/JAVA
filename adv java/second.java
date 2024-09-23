import java.applet.Applet;
import java.awt.*;

import java.awt.event.*;

/* 
<applet code="second.class" height="300" width="300"></applet> 
*/

public class second extends Applet {
    public void init() {
        setLayout(new GridLayout(7, 0, 10, 10));

        Label label1 = new Label("Enter a username:");
        add(label1);
        TextField t1 = new TextField(10);
        add(t1);

        Label label2 = new Label("Enter a password:");
        add(label2);
        TextField t2 = new TextField(10);
        t2.setEchoChar('*');
        add(t2);

        Checkbox box1 = new Checkbox("Click to Show password");
        add(box1);
        add(new Label());

        Button b1 = new Button("Login");
        Button b2 = new Button("Register");
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        add(b1);
        add(b2);

        Button b3 = new Button("forget password");
        add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setBackground(Color.RED);
                b2.setBackground(Color.YELLOW);
                b3.setBackground(Color.WHITE);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setBackground(Color.RED);
                b1.setBackground(Color.YELLOW);
                b3.setBackground(Color.WHITE);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b3.setBackground(Color.RED);
                b1.setBackground(Color.YELLOW);
                b2.setBackground(Color.YELLOW);
            }
        });
    }
}
