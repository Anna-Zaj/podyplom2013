package zad33;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;
class KsiaTabModel extends AbstractTableModel {
	
	  static String[] columnNames = { "Autor", "Tytu�",
	                                  "Cena", "Ok�adka"
	                                };

	  public int getColumnCount() { return columnNames.length; }

	  public int getRowCount() {
	   //  zwraca liczb� dni w danym miesi�cu
		  return 0;
	  }

	  public String getColumnName(int col) {
	    return columnNames[col];
	  }

	  public Class getColumnClass(int c) {
	    // klasa danych w pierwszej kom�rce kolumny c
	    return getValueAt(0, c).getClass();
	  }

	  public boolean isCellEditable(int row, int col) {
	    if (col == 0) {  // kom�rki kolumny "Dzie�" nie s� edytowalne!
	      return false;
	    } else {
	        return true;
	    }
	  }
	  
	  public Object getValueAt(int i, int j){
		  return 0;
	  }
	  
	  public void setValueAt(Object value, int i, int j){}
	  //....
	} 