package zad43;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SklepControlGui extends JFrame implements ActionListener {

  Sklep sklepO;
  //JButton binc = new JButton("Increment");
  //JButton bdec = new JButton("Decrement");
  JTextField dataF = new JTextField("data", 15);
  JTextField cenaF = new JTextField("cena", 15);

  // Konstruktor otrzymuje jako argumenty obiekty typu Counter i CounterView
  // Pierwszy jest nam potrzebny do komunikacji z licznikiem, drugi - widok
  // wbudujemy w to GUI.

  SklepControlGui(Sklep c, SklepView clab)  {
	
	    
    sklepO = c;
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    
  //dodajemy "etykietê" obiekt do gui
    cp.add(clab);
    
    dataF.addActionListener(this);
    cp.add(dataF);
    
    
    
    cenaF.addActionListener(this);
    cp.add(cenaF);
    //wpisanie z palca wart licznika
    cenaF.addActionListener(this);
    cp.add(cenaF);
    setDefaultCloseOperation(3);
    pack();
    show();
  }


  // Obs³uga akcji
  public void actionPerformed(ActionEvent e)  {
	  try {
	  Date dataZ;
      if (e.getSource() == dataF)  {
         //int n = 0;
    	  
         try  {
            //n = Integer.parseInt(dataF.getText());
        	 dataZ=StringToDate(dataF.getText());
        	 sklepO.setData(dataZ);
         } catch (NullPointerException  exc)  {  
        	 //say("wyjatek daty"); 
        	 return; 
        	 }
         
         return;
      }
      else if (e.getSource() == cenaF)  {
    	  double n = 0;
    	  try  {
    		 // say("obs³uga cenaF w actionper");
              n = Double.parseDouble(cenaF.getText());
    	  } catch (NumberFormatException exc)  { return; }
    	  sklepO.setCena(n);
          return;
      }
      String cmd = e.getActionCommand();
      say(cmd);
      /*if (cmd.equals("Increment")) counter.increment();
      else if (cmd.equals("Decrement")) counter.decrement();
      else System.out.println("Unrecognized command");
      */
	  }
	  catch (PropertyVetoException exc)  { // ob³uga wyjatku:
	      System.out.println(""+ exc);       // podanie informacji
	                                         //o niedopuszczalnej zmianie wartoœci
	  }
  }
  static void say(String s) { System.out.println(s); }
  
  public Date StringToDate(String dzien) {
	  Date day = new Date();
	        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
	       
	        try {
	             day = df.parse(dzien);
	            System.out.println("Today = " + df.format(day));
	            
	        } catch (ParseException e) {
	           // e.printStackTrace();
	        	//say("wyjatek daty");
	        	return day=null;
	        }
	        return day;
	}
}