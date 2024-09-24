import java.applet.Applet;
import java.awt.*;

/* 
<applet code="frame.class" height="300" width="300"></applet> 
*/
public class frame extends Frame {
    public static void main(String[] agrs) {
        Frame ft = new Frame("this frist title");
        ft.setSize(300, 300);
        ft.setVisible(true);
        Label l1 = new Label("khushal mahajan");
        ft.add(l1);
        Checkbox box1 = new Checkbox("candy");
        Checkbox box2 = new Checkbox("ice-s");
        Checkbox box3 = new Checkbox("kone");
        ft.add(box1);
        ft.add(box2);
        ft.add(box3);
    }

}
