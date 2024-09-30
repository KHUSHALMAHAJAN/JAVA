import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/* 
<applet code="jscroll.class" height="300" width="300"></applet> 
*/
public class jscroll extends JApplet {
    public void init() {
        // Get the content pane and set the layout to BorderLayout
        Container contpane = getContentPane();
        contpane.setLayout(new BorderLayout());

        // Create a panel to hold the label with the image
        JPanel mypanel = new JPanel();

        // Create a JLabel to display the image
        JLabel l1 = new JLabel();

        // Load the image from the file
        ImageIcon i = new ImageIcon("abhimanu.jpg");

        // Set the image icon to the label
        l1.setIcon(i);

        // Add the label to the panel
        mypanel.add(l1);

        // Create a JScrollPane to enable scrolling for the panel
        JScrollPane jsp = new JScrollPane(mypanel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the JScrollPane to the content pane
        contpane.add(jsp, BorderLayout.CENTER);
    }
}
