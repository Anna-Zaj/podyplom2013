package zad41;

import javax.swing.JList;
import javax.swing.table.AbstractTableModel;

class TabMod extends AbstractTableModel {
	
	  static String[] columnNames;
	  
	  TabMod(JList list, Abstract2b m) {
		  int s=m.getSize();
		  Class c = list.getClass();
		  
		  for (int i=0; i<s;i++) {
			  columnNames[i]=c.getName();
			}
		  
		  
	  }
	  
	  public int getColumnCount() { return columnNames.length; }

	  public int getRowCount() {
	   
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
	  
	  
	  public Object getValueAt(int i, int j) {
		  return null;
	  }
	  
	
public void setValueAt(Object value, int i, int j) {
	fireTableCellUpdated(i, j);
}
}