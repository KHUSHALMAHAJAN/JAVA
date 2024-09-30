import java.awt.*;

import javax.swing.*;

/* 
<applet code="jtable.class" height="300" width="300"></applet> 
*/

public class jtable extends JApplet {
    public void init() {
        Container containerplan = getContentPane();
        containerplan.setLayout(new BorderLayout());
        final String[] th = { "name", "midname", "lname" };
        final Object[][] mytable = {
                { "khushal", "manoj", "mahajan" },
                { "kunal", "manoj", "mahajan" },
                { "om", "sharad", "aaher" }
        };
        JTable table = new JTable(mytable, th);
        JScrollPane tableScrollPane = new JScrollPane(table,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        containerplan.add(tableScrollPane, BorderLayout.CENTER);
    }
}
