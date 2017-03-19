package zad31;

import java.util.*;

import javax.swing.*;
class CtoF extends AbstractListModel {

	 
	static int begC=-70;
	static int endC=60;
	//static double przel=9/5;

	  public Object getElementAt(int i) {
		 int wyn=(begC+i)*9/5+32;
		  return (begC+i)+" C="+wyn+" F";
		  
	   
	  }

	  public int getSize() {
		  
	     return -begC+endC+1; 
		 
	  }

	}