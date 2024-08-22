// Demonstrate check box group.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CBGroup" width=250 height=200>
</applet>
*/
public class CBGroup1 extends Applet implements ItemListener {
String msg = "";
Checkbox biriyani,rice,paneer,Roti,soup,pasta;
CheckboxGroup cbg;
CheckboxGroup cbg1;
public void init() {
//lunch
cbg = new CheckboxGroup();
//setBounds(100,100, 50,50);   
biriyani = new Checkbox("Biriyani", cbg, true); 
rice = new Checkbox("Rice", cbg, false);
paneer = new Checkbox("paneer", cbg, false);
//dinner
cbg1 = new CheckboxGroup(); 
//setBounds(120,120, 50,50);    
Roti = new Checkbox("Roti", cbg1, true);
soup = new Checkbox("soup", cbg1, false);
pasta = new Checkbox("pasta", cbg1, false);



add(biriyani); //registering 
add(rice);
add(paneer);
add(Roti);
add(soup);
add(pasta);


biriyani.addItemListener(this); //this is calling the abstract method
rice.addItemListener(this);
paneer.addItemListener(this);
Roti.addItemListener(this);
soup.addItemListener(this);
pasta.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
// Display current state of the check boxes.
public void paint(Graphics g) {
msg = "Lunch Menu: ";
msg += cbg.getSelectedCheckbox().getLabel();  //which check box in a group is currently selected //by calling  getSelectedCheckbox( )
g.drawString(msg, 6, 100);
msg = "Dinner Menu: ";
msg += cbg1.getSelectedCheckbox().getLabel();
g.drawString(msg, 6, 120);
} }