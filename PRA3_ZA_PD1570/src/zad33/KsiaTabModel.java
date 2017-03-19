package zad33;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;
class KsiaTabModel extends AbstractTableModel {
	
	  static String[] columnNames = { "Autor", "Tytu³",
	                                  "Cena", "Ok³adka"
	                                };

	  public int getColumnCount() { return columnNames.length; }

	  public int getRowCount() {
	   //  zwraca liczbê dni w danym miesi¹cu
		  return 0;
	  }

	  public String getColumnName(int col) {
	    return columnNames[col];
	  }

	  public Class getColumnClass(int c) {
	    // klasa danych w pierwszej komórce kolumny c
	    return getValueAt(0, c).getClass();
	  }

	  public boolean isCellEditable(int row, int col) {
	    if (col == 0) {  // komórki kolumny "Dzieñ" nie s¹ edytowalne!
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