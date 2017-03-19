package zad42;

//Klasa Wyniker

import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Kalku implements Serializable {

	Map operatorMap = createOperatorMap();
private BigDecimal wynik;    // w�a�ciwo�� wynik
//private String zadanie="";
//BigDecimal


// Pomocniczy obiekt do prowadzenia listy s�uchaczy zmian w�a�ciwo�ci oraz
// propagowania zmian  w�r�d zarejestrowanych z�uchaczy
private PropertyChangeSupport propertyChange = new PropertyChangeSupport(this);


// Konstruktory

public Kalku() {
 //this();
}

public Kalku(BigDecimal aWynik) {
 setWynik( aWynik );
}


// Metody przy��czania i od��czania s�uchaczy zmian w�a�ciwo�ci

public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
 propertyChange.addPropertyChangeListener(listener);
}

public synchronized void removePropertyChangeListener(PropertyChangeListener l) {
 propertyChange.removePropertyChangeListener(l);
}

// Proste metody zwi�kszania i zmniejszania licznika



// Getter w�a�ciwo�ci "wynik"
public BigDecimal getWynik() {
 return wynik;
}

// Setter w�a�ciow�ci "wynik"
public synchronized void setWynik(BigDecimal aWynik) {
 BigDecimal oldValue = wynik;
 wynik = aWynik;

 // wywo�anie metody firePropertChange z klasy PropertyChangeSupport


 propertyChange.firePropertyChange("wynik", oldValue,
                                         aWynik);
}


public void oblicz(BigDecimal licz1, BigDecimal licz2, String op) {
	// TODO Auto-generated method stub
	BigDecimal wynik=new BigDecimal(0);
	//wynik=licz1+licz2;
	
	 wynik=compute(licz1, licz2, op);
	 
	setWynik(wynik);
}
public Map createOperatorMap() {
	  Map<String, Operator> map = new HashMap<String, Operator>();
	  map.put("+", new Plus());
	map.put("-", new Minus());
	  map.put("*", new Multiply());
	  map.put("/", new Divide());
	  return map;
	}

	public BigDecimal compute(BigDecimal a, BigDecimal b, String opString) {
	  Operator op = (Operator)operatorMap.get(opString);
	  if (op == null)
	    throw new IllegalArgumentException("Unknown operator");
	  return op.compute(a, b);
	}
}