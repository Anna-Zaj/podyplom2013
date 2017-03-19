package zad42;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class KalkuControlGui extends JFrame implements ActionListener {

  Kalku kalkulator;
  //JButton binc = new JButton("Increment");
  //JButton bdec = new JButton("Decrement");
  JLabel inf=new JLabel("liczba1 op liczba2");
  JLabel wyn=new JLabel("Wynik");
  JTextField txt = new JTextField(10);

  // Konstruktor otrzymuje jako argumenty obiekty typu Counter i CounterView
  // Pierwszy jest nam potrzebny do komunikacji z licznikiem, drugi - widok
  // wbudujemy w to GUI.

  KalkuControlGui(Kalku c, KalkuView clab)  {
    kalkulator = c;
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    //inf.addActionListener(this);
    cp.add(inf);
    
    txt.addActionListener(this);
    cp.add(txt);
   
    
    //bdec.addActionListener(this);
    //cp.add(bdec);
    //wpisanie z palca wart licznika
    cp.add(wyn);
   
    
    //dodajemy "etykietê" do gui
    cp.add(clab);
    
    setDefaultCloseOperation(3);
    pack();
    show();
  }


  // Obs³uga akcji
  public void actionPerformed(ActionEvent e)  {
	  String zad="";
     // if (e.getSource() == txt)  {
         //int n = 0;
    	  
         try  {
            //n = Integer.parseInt(txt.getText());
        	 zad=txt.getText();
        	 
        	 StringTokenizer st = new StringTokenizer(zad);
             int i = st.countTokens(); // n = 3
             if(i==3){
             String s1 = st.nextToken(); 
            
             String s2 = st.nextToken(); // napis "+"
             String s3 = st.nextToken(); 
             say(s1);say(s2);say(s3);
             
             BigDecimal licz1 = new BigDecimal(s1);
             BigDecimal licz2 = new BigDecimal(s3);
             
             //int licz1=Integer.parseInt(s1);
             //int licz2=Integer.parseInt(s3);
             //char op=s2.charAt(0);
             
             kalkulator.oblicz(licz1, licz2, s2); }
             
         } catch (NumberFormatException exc)  { return; }
        
         return;
    
  }
  static void say(String s) { System.out.println(s); }
}