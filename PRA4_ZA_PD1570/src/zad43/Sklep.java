package zad43;

//Klasa cenaer

import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sklep implements Serializable {

private Double cena = 0.0;    // w³aœciwoœæ wynik
private String produkt="";
private Date data;
//BigDecimal
private VetoableChangeSupport vetos = new VetoableChangeSupport(this);

// Pomocniczy obiekt do prowadzenia listy s³uchaczy zmian w³aœciwoœci oraz
// propagowania zmian  wœród zarejestrowanych z³uchaczy
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

// Metody przy³¹czania i od³¹czania s³uchaczy zmian w³aœciwoœci

public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
 propertyChange.addPropertyChangeListener(listener);
}

public synchronized void removePropertyChangeListener(PropertyChangeListener l) {
 propertyChange.removePropertyChangeListener(l);
}

// Proste metody zwiêkszania i zmniejszania licznika

/*public void increment() {
 setCena(getCena()+1);
}

public void decrement() {
 setCena(getCena()-1);
}
*/

// Getter w³aœciwoœci "cena"
public Double getCena() {
 return cena;
}

// Setter w³aœciowœci "cena"
public synchronized void setCena(Double aCena) throws PropertyVetoException {
	Double oldValue = cena;
	
	vetos.fireVetoableChange("cena", new Double(oldValue), new Double(aCena));

 cena = aCena;

 // wywo³anie metody firePropertChange z klasy PropertyChangeSupport

 propertyChange.firePropertyChange("cena", oldValue,
                                         aCena);
}

//Getter w³aœciwoœci "produkt"
public String getProdukt() {
return produkt;
}

//Setter w³aœciowœci "produkt"
public synchronized void setProdukt(String aProd) {
String oldValue = produkt;
produkt = aProd;

// wywo³anie metody firePropertChange z klasy PropertyChangeSupport
// powoduje wygenerowanie zdarzenia PropertyChangeEvent i rozpropagowanie
// go wœród wszystkich przy³¹czonych s³uchaczy, ale tylko wtedy, gdy nowa
// wartoœæ w³aœciwoœci ró¿ni siê od starej wartoœci

propertyChange.firePropertyChange("produkt", oldValue,
                                       aProd);
}


//Getter w³aœciwoœci "data"
public Date getData() {
return data;
}

//Setter w³aœciowœci "data"
public synchronized void setData(Date aDat) throws PropertyVetoException {
Date oldValue = data;
DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
vetos.fireVetoableChange("data", oldValue,
		df.format(aDat));
data = aDat;


//wartoœæ w³aœciwoœci ró¿ni siê od starej wartoœci

propertyChange.firePropertyChange("data", oldValue,
		df.format(aDat));
}

}