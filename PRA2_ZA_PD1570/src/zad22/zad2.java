package zad22;


import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class zad2 extends JFrame{
	public zad2(){SwingUtilities.invokeLater(new Runnable() {

	      @Override
	      public void run() {
	        createGui();
	      }
	    });
	}


		
		
		protected void createGui() {
			//tresc etykiet
			 final int BNUM = 3; // liczba GUZIKI A I B O w panelach
			 final int CNUM=9; // liczba guziki w calc

		//tresc tooltip
		//String toolTiptxt[] = { "Acerodon humilis", " 		rudawkowate 	","Indonezja", "Bat.jpg", "Acerodon jubatus 	" };
		

		// argumenty dla rozkladu BorderLayout
		//String gborders[] = { "West", "North", "East", "South", "Center" };

		
		// formatowanie tekstu
		//String fontType[] = { "Dialog", "Serif", "SansSerif", "MonoSpaced","DialogInput" };
	
	//	Integer fontSize[] = { 35, 40, 13, 17, 21 };
		
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

		
		JFrame frame = new JFrame("Zad 2 - Rozk³ady"); // okno i contentPane
		 //frame.setSize(200, 200);
		// frame.setPreferredSize( new Dimension( 640, 680 ) );
		frame.setLayout(new GridLayout(0, 1, 10, 5));
		 JPanel panel = new JPanel(); //pnael ogolny?
		 panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		//new BoxLayout(cont,  BoxLayout.Y_AXIS
		//setLayout(new GridLayout(0, 1, 10, 10));
		
		//panel guziki
		JPanel p1 = new JPanel();
		p1.setPreferredSize( new Dimension( 340, 40 ) );
		//p1.setBackground(new Color(191, 225, 255)); // kolor t³a panelu
		//p1.setBorder(BorderFactory.createTitledBorder("cos")); // ramka
		p1.setLayout(new GridLayout(0, 2, 10, 5)); // ustalenie rozk³adu
		//Icon icon = null;
//panel na lewe guziki A
		JPanel p1l = new JPanel();
		p1l.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int j = 0; j < BNUM; j++) { // dodajemy przyciski do paneli
	        JButton b = new JButton("A " + (j + 1));
	        p1l.add(b);
	      }
		p1.add(p1l);
		//panel na prawe guziki
		JPanel p1p = new JPanel();
		p1p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		for (int j = 0; j < BNUM; j++) { // dodajemy przyciski do paneli
	        JButton b = new JButton("B " + (j + 1));
	        p1p.add(b);
	      }
		p1.add(p1p);
		
		panel.add(p1);
		
		//text area
		JPanel p2 = new JPanel();
		//p2.setPreferredSize( new Dimension( 340, 40 ) );
		//JScrollPane pta1 = new JScrollPane();
		JTextArea list = new JTextArea();   // edytor
		//pta1.add(list);
		
		//textArea = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(620, 300));
//scrollPane.setPreferredSize(new Dimension(340,40));
		
		
		list.setBorder(BorderFactory.createLineBorder(Color.blue));
		p2.add(scrollPane);
		
		panel.add(p2);
		
		//dó³ p3
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(0, 2, 10, 5));
		//p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		//CALC
		JPanel pca = new JPanel();
		pca.setLayout(new BoxLayout(pca, BoxLayout.X_AXIS));
		//pca.setLayout(new BoxLayout(pca, BoxLayout.Y_AXIS));
		//pca.setLayout(new FlowLayout(FlowLayout.LEFT));
		//pca.setRe
		//pca.setPreferredSize(new Dimension(100, 100));
		//pca.setMaximumSize(getPreferredSize()); // prevent growth
		//pca.setMinimumSize(getPreferredSize()); // prevent shrink
		
		//guziki CALC
		JPanel pca1 = new JPanel();
		pca1.setLayout(new BoxLayout(pca1, BoxLayout.Y_AXIS));
		JPanel pca2 = new JPanel();
		pca2.setLayout(new BoxLayout(pca2, BoxLayout.Y_AXIS));
		JPanel pca3 = new JPanel();
		pca3.setLayout(new BoxLayout(pca3, BoxLayout.Y_AXIS));
		for (int j = 0; j < CNUM; j++) { // dodajemy przyciski do paneli
	        JButton b = new JButton(""+ (j + 1));
	       // b.setPreferredSize(new Dimension(50, 10));
	        if(j%3==1){
	        pca1.add(b);}
	        else if (j%3==2){
	        	pca2.add(b);
	        }else if (j%3==0){
	        	pca3.add(b);
	        }
	      }
		pca.add(pca1);
		pca.add(pca2);
		pca.add(pca3);
		
		p3.add(pca);
		
		
		panel.add(p3);
		
		//jtextfield
		JPanel jtxt = new JPanel();
		jtxt.setLayout(new BoxLayout(jtxt, BoxLayout.Y_AXIS));
		//jtxt.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//jtxt.setPreferredSize( new Dimension( 340, 40 ) );
		for (int j = 0; j < BNUM; j++) { // dodajemy przyciski do paneli
			
	        JTextField b = new JTextField("To jest  JTextField" + (j + 1));
	        b.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
	        jtxt.add(b);
	      }
		p3.add(jtxt);
		
		//dodawanie etykiet
	/*	for (int i = 0; i < lmNames.length; i++) {
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
		*/
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}