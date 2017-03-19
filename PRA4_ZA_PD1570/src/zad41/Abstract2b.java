package zad41;



import java.util.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Abstract2b extends AbstractListModel { //model danych, który umo¿liwia dodawanie i usuwanie elementów.

 Vector v = new Vector();   // elementy lista bêd¹ tu

 // domyœlny konstruktor: do listy bêdziemy dodawaæ póŸniej, za pomoc¹ metod add
 Abstract2b() { }

 // inicjalna lista podana jako tablica obiektów
 Abstract2b(Object[] o) {
   for (int i = 0; i<o.length; i++) v.addElement(o[i]);
}

 public int getSize() { return v.size(); }

 public Object getElementAt(int index) {
     return v.elementAt(index);
 }

// Dodaje element na pozycji index-1
 public void add(int index, Object o) {
  v.insertElementAt(o, index);
  fireIntervalAdded(this, index, index);
 }

// Dodaje element na koñcu listy
 public void add(Object o) {
   add( getSize(), o);
 }

// Usuwa element na pozycji index
 void remove(int index) {
   v.removeElementAt(index);
   fireIntervalRemoved(this, index, index);
 }
 
 void remove(int index, int maxIndex) {
	 if(index==maxIndex)
		 {
		 remove(index);}
		 
	 else {
	 for (int i=0; i<(maxIndex-index); i++){
		 remove(index);
	 }}
	 }
}
