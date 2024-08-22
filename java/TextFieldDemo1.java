// Demonstrate text field.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo1 extends Applet
implements ActionListener {
String msg = "";
TextField name, pass;
int c=0;
public void init() {
Label namep = new Label("Name: ", Label.RIGHT);
Label passp = new Label("Password: ", Label.RIGHT);
name = new TextField(12);
pass = new TextField(8);
pass.setEchoChar('*');
add(namep);
add(name);
add(passp);
add(pass);

name.addActionListener(this);
pass.addActionListener(this);
}

public void actionPerformed(ActionEvent ae) 
{
	if(name.getText().equals("somnath") && (pass.getText().equals("1234")))
	{
	msg = "login Successfull.";
	repaint();
	}
	else 
	{
	msg = "Login Unsucessfull.";
	repaint();
	c++;
	}
}
public void paint(Graphics g) {
	if(c==0)
	{
		g.drawString(msg,6,60);
		g.drawString("Name: " + name.getText(), 6, 80);
		g.drawString("Password: " + pass.getText(), 6, 100);
	} 
	if(c==1)
	{
		g.drawString(msg,6,60);
	}
}
}
