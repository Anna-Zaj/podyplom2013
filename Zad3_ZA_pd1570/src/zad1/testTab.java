package zad1;
/**
 * @author Anna Zaj�czkowska pd1570
 *
 */
public class testTab {
	 testTab() {
		    int[] a = {1, 2, 3, 4 };
		    try{
		    int wynik = sumParzI(a);
		    System.out.print("Suma element�w o parzystych indeksach " + wynik);}
		    catch (ArrayIndexOutOfBoundsException exec){
		    	exec.getMessage();
		    }
		   
		    //tworzy tablic� �a�cuch�w znakowych txt, ka�dy z kt�rych sk�ada si� z l powt�rze� litery x, gdzie l - kolejny element tablicy ltab, x kolejna litera, poczynaj�c od 'a'.
		    int l;
		    char x;
		    l=3;
		    x='a';
		    String[] s=new String[l];
		    s=generateStringTab(s,x);
		    
		    for (String sh : s)  System.out.println(" "+sh+" ");
		    
		  }
	 
	 //wylicza sum� jej element�w o parzystych indeksach,
	 int sumParzI(int[] tab) throws ArrayIndexOutOfBoundsException {
		    int w = 0;  // utworzenie tablicy "pod wynik"
		                                    // jej rozmiary musz� by� r�wne
		                                      // rozmiarom tablicy-argumentu
		    for (int i=0; i < tab.length; i+=2) w += tab[i];
		    return w;
		   
		  }

	 private static String[] generateStringTab(String[] tab, char znak  ) {
	  
	      for (int i = 0; i < tab.length; i++) {
	    	  tab[i]="";
	    for(int j=0;j<=i;j++){
	        	tab[i] =tab[i]+(char)('a' + i);
	    }
	      }
	      return tab;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testTab();


	}

}
