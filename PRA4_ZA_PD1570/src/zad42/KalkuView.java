package zad42;

//Klasa CounterView
//Widok licznika przedstawiamy w postaci etykiety

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.math.BigDecimal;


public class KalkuView extends JLabel implements PropertyChangeListener {


// Konstruktor domy�lny: inicjalizuje etykiet� tekstem "0"
KalkuView()  {
   this("ser0");
}

// Konstruktor inicjalizuj�cy etykiet� podanym tekstem
KalkuView(String lab) {
   super(lab);
   setOpaque(true);   // etykieta nie przezroczysta
     // ramka
   setBorder(BorderFactory.createLineBorder(Color.black));
     // rozmiary i wyr�wnanie tekstu
   setPreferredSize(new Dimension(75, 40));
   setHorizontalAlignment(CENTER);
}

// ob�uga zdarzenia PropertyChange
public void propertyChange(PropertyChangeEvent e)  {
	
	/*String oldVal =  (String)e.getOldValue(),
	         newVal =  e.getNewValue();
	*/
BigDecimal oldVal = (BigDecimal) e.getOldValue(),
         newVal = (BigDecimal) e.getNewValue();
         
  System.out.println("Value changed from " + oldVal + " to " + newVal);
  setText("" + newVal + "");  // pokazanie na etykiecie wyniku dzia�ania
 }


}