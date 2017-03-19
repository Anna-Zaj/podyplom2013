/**
 *
 *  @author Zaj¹czkowska Anna PD1570
 *
 */
package zad42;




public class Main {
  public static void main(String ... args) {
	// Tworzymy obiekty: licznik i jego widok
	   Kalku counter = new Kalku();
	   KalkuView counterView = new KalkuView(""+counter.getWynik());

	   // Rejestrujemy widok jako s³uchacza zmian licznika
	   counter.addPropertyChangeListener(counterView);

	   // Tworzymu GUI kontrolera i pokazujemy go
	   KalkuControlGui gui = new KalkuControlGui(counter, counterView);
	   gui.pack();
	   gui.show();
  }
}