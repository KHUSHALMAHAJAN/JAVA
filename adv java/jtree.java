import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

/* 
<applet code="jtree.class" height="300" width="300"></applet> 
*/

public class jtree extends JApplet {
    public void init() {
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root", true);
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("c1");
        DefaultMutableTreeNode gc1 = new DefaultMutableTreeNode("gc1");
        root.add(c1);
        c1.add(gc1);
        JTree tree = new JTree(root);
        JScrollPane treeView = new JScrollPane(tree);
        content.add(treeView, BorderLayout.CENTER);
    }
}
