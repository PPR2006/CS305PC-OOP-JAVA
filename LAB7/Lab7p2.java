import java.awt.*;
import java.awt.event.*;
class Lab7p2 implements ActionListener{
	Frame f = new Frame("Event Handling using Interface without main");
	FlowLayout fl = new FlowLayout();
	TextField tf = new TextField(20);
	Button b = new Button();
	Label l = new Label();
	int a = 1;
	Lab7p2(){
		f.setSize(500, 400);
		f.setLayout(fl);
		b.setLabel("click");
		b.setSize(20, 40);
		l.setPreferredSize(new Dimension(100, 40)); 
		f.add(tf);
		f.add(b);
		f.add(l);
		f.addWindowListener(new WindowAdapter(){ 
            		public void windowClosing(WindowEvent e){
                		f.dispose();
            		}
        	});
		b.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
			System.out.println("done");
			l.setText(tf.getText()+" "+a);
			a++;
	}
	public static void main(String...args){
		new Lab7p2();
	}
}
