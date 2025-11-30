import java.awt.*;
import java.awt.event.*;

class Lab8p1 extends Frame implements ActionListener {
    Label label;

    Lab8p1() {
        super("FRAME");

        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        setLayout(null);

        // FIX 1: 'new label()' → 'new Label()'
        label = new Label();
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setBounds(150, 200, 200, 50);

        // FIX 2: 'bl.CENTRE' is invalid → simply use add(label);
        add(label);

        String[] menus = {"File", "Edit", "Help"};
        String[][] mi = {
                {"Open", "Save", "Close", "Rename"},
                {"Undo", "Cut", "Copy", "Paste"},
                {"About", "Update", "License", "Report"}
        };

        int x = 0;

        for (String s : menus) {
            Menu m = new Menu(s);
            for (int y = 0; y < 4; y++) {
                MenuItem item = new MenuItem(mi[x][y]);
                item.addActionListener(this);  // FIX 3: menu items must listen
                m.add(item);
            }
            mb.add(m);
            x++;
        }

        setSize(500, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String clicked = ae.getActionCommand();
        label.setText(clicked.toUpperCase());

        if (clicked.equals("Close")) {
            System.exit(0);
        }
    }

    public static void main(String... args) {
        new Lab8p1();
    }
}
