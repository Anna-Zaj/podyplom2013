package zad43;

import java.beans.*;

public class SklepLimitator implements VetoableChangeListener {

// minimalne i makszymalne dopuszczalne warto�ci licznika
private int min, max;

SklepLimitator()  { //int minLim, int maxLim
  /*min = minLim;
  max = maxLim;*/
}

// Obs�uga zdarzenia vetoableChange
// metoda mo�e sygnalizowa� PropertyVetoException
public void vetoableChange(PropertyChangeEvent e)
            throws PropertyVetoException {
	if(e.getPropertyName().equals("cena")){
		say("zmiana cena w weto");
	}
	else if(e.getPropertyName().equals("data")){
		say("data w weto");
		}
  /* Integer newVal = (Integer) e.getNewValue();
   int val = newVal.intValue();*/
   // Sprawdzamy, czy zmiana  licznika jest dopuszczalna,
   // je�li nie � sygnalizujemy wyjatek  PropertyVetoException
   //if (val < min || val > max)
     // throw new PropertyVetoException("Niedopuszczalna zmiana warto�ci", e);
   }
static void say(String s) { System.out.println(s); }
}
