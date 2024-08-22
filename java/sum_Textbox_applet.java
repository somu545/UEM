
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="TextFieldDemo" width=380 height=150>
</applet>
*/
public class TextFieldDemo extends Applet
implements ActionListener {
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
    Button b = new Button("sum");
	
	add(first);
	add(n1);
	add(second);
	add(n2);
	//add(third);
	//add(s);
	add(b);
	
	b.addActionListener(this);

}
public void actionPerformed(ActionEvent ae) {

	int a = Integer.parseInt(n1.getText());
	int b = Integer.parseInt(n2.getText());
	sum = a+b;
	repaint();
}
public void paint(Graphics g) {
g.drawString("sum is "+sum,60,80);
}

}


