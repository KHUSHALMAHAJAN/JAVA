
import java.applet.Applet;
import java.awt.*;

/*
<applet code="cheackbox.class" height="300" width="300"></applet>
*/

public class cheackbox extends Applet {
    public void init() {
        setLayout(new GridLayout(7, 0, 10, 10));

        Label label1 = new Label("Enter a username:");
        add(label1);
        CheckboxGroup box = new CheckboxGroup();
        Checkbox box1 = new Checkbox("k", box, true);
        Checkbox box2 = new Checkbox("m", box, false);
        Checkbox box3 = new Checkbox("pl", box, false);
        add(box1);
        add(box2);
        add(box3);
    }
}
