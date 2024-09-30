import java.applet.Applet;
import java.awt.*;
/*
<applet code="cheackbox.class" height="300" width="300"></applet>
*/

public class menupro extends Applet {
    public void init() {
        // Create a MenuBar
        MenuBar menuBar = new MenuBar();

        // Create a Menu
        Menu menu = new Menu("File");

        // Create MenuItems
        MenuItem mitem = new MenuItem("Open");
        MenuItem mitem2 = new MenuItem("Save");
        MenuItem mitem3 = new MenuItem("Save As");

        // Add MenuItems to Menu
        menu.add(mitem);
        menu.add(mitem2);
        menu.add(mitem3);

        // Add Menu to MenuBar
        menuBar.add(menu);

        // Set the MenuBar for the Applet (using the Frame)
        add((menuBar));
    }
}
