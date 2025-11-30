import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabbedDemo extends JFrame{
	Label l;

	TabbedDemo(){
		super("Tabbed Pane Demo");
		JTabbedPane jtp = new JTabbedPane(3);
		jtp.addTab("Tab1",new Label("Tabbed Pane 1"));
		jtp.addTab("Tab2",new Label("Tabbed Pane 2"));
		jtp.addTab("Tab3",new Label("Tabbed Pane 3"));
		jtp.setTabPlacement(JTabbedPane.TOP);
		//jtp.setTabPlacement(SwingConstants.TOP);//
		add(jtp);

	
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String...args){
	new TabbedDemo();
	}

}