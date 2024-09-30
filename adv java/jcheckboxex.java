import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/* 
<applet code="jcheckboxex.class" height="300" width="300"></applet> 
*/

public class jcheckboxex extends JApplet implements ItemListener {
    JTextField T;

    public void init() {
        Container contpane = getContentPane();
        contpane.setLayout(new FlowLayout());

        // Create checkboxes
        JCheckBox chk1 = new JCheckBox("Apple");
        chk1.addItemListener(this);
        contpane.add(chk1); // Corrected to add checkbox to the container

        JCheckBox chk2 = new JCheckBox("Orange");
        chk2.addItemListener(this);
        contpane.add(chk2); // Corrected

        JCheckBox chk3 = new JCheckBox("Grapes");
        chk3.addItemListener(this);
        contpane.add(chk3); // Corrected

        // Add text field to display the selected checkbox label
        T = new JTextField(10);
        contpane.add(T);

        // Group the checkboxes
        ButtonGroup bg = new ButtonGroup();
        bg.add(chk1);
        bg.add(chk2);
        bg.add(chk3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox chk = (JCheckBox) e.getItem();
        T.setText(chk.getText());
    }
}
