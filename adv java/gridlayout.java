import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

/* <applet code ="gridlayout.class" height = "300" width = "300"></applet> */
public class gridlayout extends Applet {
    public void init() {
        setLayout(new GridLayout(8, 9));
        Button b1 = new Button("clike");
        add(b1);
    }
}