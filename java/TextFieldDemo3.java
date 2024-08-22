
// sum of two numbers 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo3 extends Applet
implements ActionListener {
String msg="";
int a,b,sum;
TextField n1,n2,s;
public void init()
 {
	n1 = new TextField(10);
	n2 = new TextField(10);
	//s = new TextField(10);
	Label first = new Label("1st no :");  
    Label second = new Label("2ns no:");  
   // Label  third = new Label("result:");  
    //Button b = new Button("sum");
	
	add(first);
	add(n1);
	add(second);
	add(n2);

	n1.addActionListener(this);
	n2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	 a = Integer.parseInt(n1.getText());
	 b = Integer.parseInt(n2.getText());
	sum = a+b;
	msg = sum;
	repaint();
}
public void paint(Graphics g) {

g.drawString("sum is "+msg,60,80);
}

}


