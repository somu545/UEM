// Demonstrate Buttons
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ButtonDemo" width=250 height=150>
</applet>
*/
public class ButtonDemo extends Applet implements ActionListener {
String msg = "";
Button name, university;
public void init() {
name = new Button("Name");
university = new Button("University");
add(name);
add(university);

name.addActionListener(this);
university.addActionListener(this);

}
public void actionPerformed(ActionEvent ae) {
String str = ae.getActionCommand();
if(str.equals("Name")) {
msg = "Somnath Singharoy.";
}
else if(str.equals("University")) {
msg = "Brainware University.";
}

repaint();
}
public void paint(Graphics g) {
g.drawString(msg, 6, 100);
} }