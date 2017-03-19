/**
 *
 *  @author Zaj¹czkowska Anna PD1570
 *
 */
package zad41;

import javax.swing.JList;
import javax.swing.JTable;






public class Main {
  public static void main(String ... args) {
	  Abstract2b lm = new Abstract2b();
	  JList list = new JList(lm);
	 
	  JTable tablisr = new JTable(new TabMod(list,lm));
  }
}