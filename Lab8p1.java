import java.awt.*;
import java.awt.event.*;

class Lab8p1 extends Frame implements ActionListener {
    Label label; 
    Lab8p1(){ 
        super("FRAME");
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        setLayout(null);

        label = new label();
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setBounds(150, 200, 200, 50);
        add(label, bl.CENTRE);

        Menu file = new Menu("File");

        String[] menus = {"File", "Edit", "Help"};
        String[][] mi = {
            {"Open", "Save", "Close", "Rename"},
            {"Undo", "Cut", "Copy", "Paste"},
            {"About", "Update", "License", "Report"}
        };

        int x=0, y=0;

        for (String s : menus) {
            y=0;
            Menu m = new Menu(s);
            for (int i=0; i<4; i++) {
                m.add(new MenuItem(mi [x][y]));
                y++;
            }
            x++;
            mb.add(m);
        }

        setSize(500, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
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
    public static void main(String...args){
        new Lab8p1();
    }
}
