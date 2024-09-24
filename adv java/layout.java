import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;

/*
 <applet code = "layout.class" height = "300" width = "300"></applet>
 */
public class layout extends Applet {
    public void init() {
        setLayout(new BorderLayout());
        add(new Button("north"), BorderLayout.NORTH);
        add(new Button("south"), BorderLayout.SOUTH);
        add(new Button("east"), BorderLayout.EAST);
        add(new Button("west"), BorderLayout.WEST);
        add(new Button("certer"), BorderLayout.CENTER);
    }
}
