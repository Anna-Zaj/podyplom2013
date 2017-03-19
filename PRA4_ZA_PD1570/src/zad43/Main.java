/**
 *
 *  @author Zaj¹czkowska Anna PD1570
 *
 */
package zad43;

import java.beans.PropertyVetoException;






public class Main {
  public static void main(String ... args)throws PropertyVetoException {
		// Tworzymy obiekty: licznik i jego widok
	   Sklep sklep = new Sklep();
	   SklepView SklepView = new SklepView(""+sklep.getCena());

	   // Rejestrujemy widok jako s³uchacza zmian licznika
	   sklep.addPropertyChangeListener(SklepView);
	   
	   SklepLimitator clim = new SklepLimitator();
	   sklep.addVetoableChangeListener(clim);
	   
	   // Tworzymu GUI kontrolera i pokazujemy go
	   SklepControlGui gui = new SklepControlGui(sklep, SklepView);
	   gui.pack();
	   gui.show();
  }
}