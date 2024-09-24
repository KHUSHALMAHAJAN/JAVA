import java.applet.Applet;
import java.awt.*;

/* 
<applet code="scrollbar.class" height="300" width="300"></applet> 
*/

public class scrollbar extends Applet {
    public void init() {
        setLayout(new GridLayout(7, 0, 10, 10));
        Scrollbar hsc = new Scrollbar(Scrollbar.HORIZONTAL);
        Scrollbar vsx = new Scrollbar(Scrollbar.VERTICAL);
        add(hsc);
        add(vsx);

    }
}