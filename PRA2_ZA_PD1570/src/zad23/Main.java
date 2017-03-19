/**
 *
 *  @author Zaj¹czkowska Anna PD1570
 *
 */
package zad23;

import javax.swing.SwingUtilities;


public class Main {
  public static void main(String ... args) {
	  SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        new zad3();
	      }
	    });
	  }
  
}