//event handling using interface 
import java.awt.*;
import java.awt.event.*;
class Lab7p1{
	public static void main(String...args){
		final int[] a = {1};
		Frame f = new Frame("Event Handling using Interface");
		f.setSize(500, 400);
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		TextField tf = new TextField(20);
		Button b = new Button();
		b.setLabel("click");
		b.setSize(20, 40);
		Label l = new Label();
		l.setPreferredSize(new Dimension(100, 40)); 
		f.add(tf);
		f.add(l);
		f.add(b);
		f.addWindowListener(new WindowAdapter(){ 
            	public void windowClosing(WindowEvent e){
                		f.dispose();
            		}
        	});
		b.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent ae){
			System.out.println("done");
			l.setText(tf.getText()+" "+a[0]);
			a[0]++;
			}
		});
		f.setVisible(true);
	}
}
