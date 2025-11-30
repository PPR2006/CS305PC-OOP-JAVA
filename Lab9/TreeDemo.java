import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class TreeDemo extends JFrame {

    TreeDemo() {
        super("JTree Demo");

        // Root node for the whole tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Items");

        // Fruits node and children
        DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
        fruits.add(new DefaultMutableTreeNode("Apple"));
        fruits.add(new DefaultMutableTreeNode("Mango"));
        fruits.add(new DefaultMutableTreeNode("Litchi"));

        // Soft Drinks node and children
        DefaultMutableTreeNode softdrinks = new DefaultMutableTreeNode("Soft Drinks");
        softdrinks.add(new DefaultMutableTreeNode("Fanta"));
        softdrinks.add(new DefaultMutableTreeNode("Sprite"));

        // Attach category nodes to root
        root.add(fruits);
        root.add(softdrinks);

        // Create JTree with root
        JTree jt = new JTree(root);
        add(new JScrollPane(jt));  // Good practice: put JTree inside JScrollPane

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String... args) {
        new TreeDemo();
    }
}
