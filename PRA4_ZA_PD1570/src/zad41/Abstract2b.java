package zad41;



import java.util.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Abstract2b extends AbstractListModel { //model danych, kt�ry umo�liwia dodawanie i usuwanie element�w.

 Vector v = new Vector();   // elementy lista b�d� tu

 // domy�lny konstruktor: do listy b�dziemy dodawa� p�niej, za pomoc� metod add
 Abstract2b() { }

 // inicjalna lista podana jako tablica obiekt�w
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

// Dodaje element na ko�cu listy
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
