
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo5 extends Applet implements ActionListener {
String str;
int a,b,sub,sum,mul;
float div;
TextField n1,n2,s;
Button b1,b2,b3,b4;
Label first,second;
public void init()
 {
	first = new Label("1st No");
	n1 = new TextField(10);
	second = new Label("2nd No");
	n2 = new TextField(10);

	b1 = new Button("Addition");
	b2 = new Button("Subtraction");
	b3 = new Button("Multiplication");
	b4 = new Button("Division");


	add(first);
	add(n1);

	add(second);
	add(n2);

	add(b1);
	add(b2);
	add(b3);
	add(b4);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getActionCommand().equals("Addition") || ae.getActionCommand().equals("Subtraction") ||ae.getActionCommand().equals("Multiplication") ||ae.getActionCommand().equals("Division"))
	{
		str = ae.getActionCommand();
	}
	repaint();
}
public void paint(Graphics g) {
	 a = Integer.parseInt(n1.getText());
	 b = Integer.parseInt(n2.getText());
	if(str.equals("Addition"))
	{
		sum = a+ b;
		g.drawString("Addition is "+sum,60,80);
	}
	else if(str.equals("Subtraction"))
	{
		sub = a - b;
		g.drawString("Subtraction is "+sub,60,80);
	}
	else if(str.equals("Multiplication"))
	{
		mul = a * b;
		g.drawString("Multiplication is "+mul,60,80);
	}
	else if(str.equals("Division"))
	{
		div = (float)a / b;
		g.drawString("Division is "+div,60,80);
	}
}
}


