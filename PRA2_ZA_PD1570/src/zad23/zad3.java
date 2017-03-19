package zad23;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.awt.Color.*;

public class zad3 extends JFrame implements ActionListener {
private static int INDEX=0;
  String[] ctab = { "Red", "Yellow", "Blue" };
  Color[] color = { RED, YELLOW, BLUE };
  
  Color colors[] = { new Color(0, 225, 255), new Color(255, 0, 200),
			new Color(201, 245, 0), new Color(255, 255, 140),
			new Color(161, 224, 224), new Color(255, 255, 200), };

  public zad3() {
    super("GUI");
    setLayout(new FlowLayout());

   // for (int i = 0; i < ctab.length; i++) {
      JButton b = new JButton("Zmieñ kolor t³a");
      //b.setActionCommand("" + i);
      b.addActionListener(this);
      add(b);
   // }
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
	  Component b = (Component) e.getSource();
	if(INDEX<6){  
    //int index = Integer.parseInt(e.getActionCommand());
		
    b.setBackground(colors[INDEX]);
    INDEX++;} else {INDEX=0;
    b.setBackground(colors[INDEX]);}
  }

}