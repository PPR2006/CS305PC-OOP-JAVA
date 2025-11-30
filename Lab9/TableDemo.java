import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;

	TableDemo(){
		super("JTable Demo");
		String[] heading = {"Name","Branch","Roll No"};

		String[][] data = {
					{"DELL","CSE","1234"},
					{"BELL","CSO","1233"},
					{"CELL","CSM","1235"},
					{"YELL","CSD","1236"},
				};
	JTable jt = new JTable(data,heading);
	JScrollPane jsp = new JScrollPane(jt);
	//jsp.add(jt);//
	add(jsp);
		
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String...args){
	new TableDemo();
	}
}