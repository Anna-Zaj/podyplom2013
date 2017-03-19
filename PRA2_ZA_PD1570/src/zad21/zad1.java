package zad21;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class zad1 extends JFrame{
	public zad1(){SwingUtilities.invokeLater(new Runnable() {

	      @Override
	      public void run() {
	        createGui();
	      }
	    });
	}

	
		
		
		protected void createGui() {
			//tresc etykiet
		String lmNames[] = { "1Etykieta nr 1", "2Lorem ipsum",
				"3dolor sit amet", "4consectetur adipisicing elit", "5sed" };
		//tresc tooltip
		String toolTiptxt[] = { "Acerodon humilis", " 		rudawkowate 	",
				"Indonezja", "Bat.jpg", "Acerodon jubatus 	" };
		

		// argumenty dla rozkladu BorderLayout
		String gborders[] = { "West", "North", "East", "South", "Center" };

		
		// formatowanie tekstu
		String fontType[] = { "Dialog", "Serif", "SansSerif", "MonoSpaced",
				"DialogInput" };
	
		Integer fontSize[] = { 35, 40, 13, 17, 21 };
		
		//formatowanie ramek
		Border bords[] = { BorderFactory.createLineBorder(Color.blue),
				BorderFactory.createLineBorder(Color.red),
				BorderFactory.createEtchedBorder(Color.red, Color.yellow),
				BorderFactory.createMatteBorder(5, 10, 5, 15, Color.blue),
				new LineBorder(Color.WHITE, 12) };

		// Kolory 
		Color colors[] = { new Color(0, 225, 255), new Color(255, 0, 200),
				new Color(201, 245, 0), new Color(255, 255, 140),
				new Color(161, 224, 224), new Color(255, 255, 200), };

		
		JFrame frame = new JFrame("Zad 1 - Etykiety"); // okno i contentPane

		//frame.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setBackground(new Color(191, 225, 255)); // kolor t³a panelu
		p.setBorder(BorderFactory.createTitledBorder("cos")); // ramka
		p.setLayout(new BorderLayout()); // ustalenie rozk³adu
		Icon icon = null;

		//dodawanie etykiet
		for (int i = 0; i < lmNames.length; i++) {
			JLabel l = new JLabel(lmNames[i]);
			l.setOpaque(true);
			l.setForeground(colors[5 - i]);
			l.setBackground(colors[i]); // kolor t³a panelu
			//l.setBorder(BorderFactory.createTitledBorder(lmNames[i])); // ramka
			
			l.setFont(new Font(fontType[i], i, fontSize[i])); //Font(nazwa_pisma, styl, rozmiar)  styl - jest jedn¹ ze sta³ych statycznych typu int z klasy Font
			l.setToolTipText(toolTiptxt[i]);
			l.setBorder(bords[i]);
			
			p.add(l, gborders[i]);
			

		}
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}