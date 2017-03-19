package zad32;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class OknoTopDown extends JFrame {
	private Abstract2b lm;
	private JTextField textField;
	private JList list;
	private JList listD;
	private DefaultListModel df;

	public OknoTopDown() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1, 3));

		textField = new JTextField();
		textField.addKeyListener(new KeyListenerText());
		cp.add(textField);

		lm = new Abstract2b();
		list = new JList(lm);
		list.addMouseListener(new MojListener());
		 df = new DefaultListModel();
		
		listD = new JList(df);
		listD.addMouseListener(new MojListener());

		cp.add(list);
		cp.add(listD);
		pack();
		setVisible(true);
	}

	private class KeyListenerText implements KeyListener {

		@Override
		public void keyTyped(KeyEvent arg0) {
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			int e=arg0.getKeyCode();
			
			if(KeyEvent.VK_ENTER ==e){
			
				lm.add(0, textField.getText());
				df.addElement(textField.getText());
				textField.setText("");
				 
				//df.addElement(element)
			
			}
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}
	}

	private class MojListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			System.out.println("mouseReleased");
			System.out.println("min:" + list.getMinSelectionIndex());
			System.out.println("max:" + list.getMaxSelectionIndex());

	

			if (arg0.isAltDown()) {
				JComponent c = (JComponent) arg0.getSource();
				//c.get;
				String name = c.getName();
				System.out.println("ser"+name);
				if (name.equals("list")){
					lm.remove(list.getMinSelectionIndex(),
							list.getMaxSelectionIndex());
				}
			 else
				df.remove(listD.getSelectedIndex());
			}
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
}
