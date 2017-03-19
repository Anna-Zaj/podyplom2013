package zad31;


import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame
implements ActionListener {


JList list;


	Okno() {
	
		Container cp = getContentPane();
		list = new JList(new CtoF());
		cp.add(new JScrollPane(list), "Center");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

public void actionPerformed(ActionEvent e) {

}



} 