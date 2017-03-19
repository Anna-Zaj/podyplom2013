package zad43;

//Klasa cenaer

import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sklep implements Serializable {

private Double cena = 0.0;    // w�a�ciwo�� wynik
private String produkt="";
private Date data;
//BigDecimal
private VetoableChangeSupport vetos = new VetoableChangeSupport(this);

// Pomocniczy obiekt do prowadzenia listy s�uchaczy zmian w�a�ciwo�ci oraz
// propagowania zmian  w�r�d zarejestrowanych z�uchaczy
private PropertyChangeSupport propertyChange = new PropertyChangeSupport(this);


// Konstruktory

public Sklep() throws PropertyVetoException{
 //this(0);
}

public Sklep(Double aCena) throws PropertyVetoException {
 setCena( aCena );
}

public synchronized void addVetoableChangeListener(VetoableChangeListener l) {
	vetos.addVetoableChangeListener(l);
}

public synchronized void removeVetoableChangeListener(VetoableChangeListener l) {
	vetos.removeVetoableChangeListener(l);
}

// Metody przy��czania i od��czania s�uchaczy zmian w�a�ciwo�ci

public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
 propertyChange.addPropertyChangeListener(listener);
}

public synchronized void removePropertyChangeListener(PropertyChangeListener l) {
 propertyChange.removePropertyChangeListener(l);
}

// Proste metody zwi�kszania i zmniejszania licznika

/*public void increment() {
 setCena(getCena()+1);
}

public void decrement() {
 setCena(getCena()-1);
}
*/

// Getter w�a�ciwo�ci "cena"
public Double getCena() {
 return cena;
}

// Setter w�a�ciow�ci "cena"
public synchronized void setCena(Double aCena) throws PropertyVetoException {
	Double oldValue = cena;
	
	vetos.fireVetoableChange("cena", new Double(oldValue), new Double(aCena));

 cena = aCena;

 // wywo�anie metody firePropertChange z klasy PropertyChangeSupport

 propertyChange.firePropertyChange("cena", oldValue,
                                         aCena);
}

//Getter w�a�ciwo�ci "produkt"
public String getProdukt() {
return produkt;
}

//Setter w�a�ciow�ci "produkt"
public synchronized void setProdukt(String aProd) {
String oldValue = produkt;
produkt = aProd;

// wywo�anie metody firePropertChange z klasy PropertyChangeSupport
// powoduje wygenerowanie zdarzenia PropertyChangeEvent i rozpropagowanie
// go w�r�d wszystkich przy��czonych s�uchaczy, ale tylko wtedy, gdy nowa
// warto�� w�a�ciwo�ci r�ni si� od starej warto�ci

propertyChange.firePropertyChange("produkt", oldValue,
                                       aProd);
}


//Getter w�a�ciwo�ci "data"
public Date getData() {
return data;
}

//Setter w�a�ciow�ci "data"
public synchronized void setData(Date aDat) throws PropertyVetoException {
Date oldValue = data;
DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
vetos.fireVetoableChange("data", oldValue,
		df.format(aDat));
data = aDat;


//warto�� w�a�ciwo�ci r�ni si� od starej warto�ci

propertyChange.firePropertyChange("data", oldValue,
		df.format(aDat));
}

}