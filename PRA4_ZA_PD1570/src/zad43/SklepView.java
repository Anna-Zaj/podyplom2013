package zad43;

//Klasa CounterView
//Widok licznika przedstawiamy w postaci etykiety

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.Date;


public class SklepView extends JLabel implements PropertyChangeListener {


// Konstruktor domy�lny: inicjalizuje etykiet� tekstem "0"
SklepView()  {
   this("Produkt");
}

// Konstruktor inicjalizuj�cy etykiet� podanym tekstem
SklepView(String lab) {
   super(lab);
   setOpaque(true);   // etykieta nie przezroczysta
     // ramka
   setBorder(BorderFactory.createLineBorder(Color.black));
     // rozmiary i wyr�wnanie tekstu
   setPreferredSize(new Dimension(75, 20));
   setHorizontalAlignment(CENTER);
}

// ob�uga zdarzenia PropertyChange
public void propertyChange(PropertyChangeEvent e)  {
	
	String oldVal =  (String)e.getOldValue(),
	         newVal = (String) e.getNewValue();
	
  /*Date oldVal = (Date) e.getOldValue(),
         newVal = (Date) e.getNewValue();
    */     
  System.out.println("Value changed from " + oldVal + " to " + newVal);
  setText("" + newVal + "");  // pokazanie na etykiecie wyniku dzia�ania
 }


}