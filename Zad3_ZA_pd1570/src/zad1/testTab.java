package zad1;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
public class testTab {
	 testTab() {
		    int[] a = {1, 2, 3, 4 };
		    try{
		    int wynik = sumParzI(a);
		    System.out.print("Suma elementów o parzystych indeksach " + wynik);}
		    catch (ArrayIndexOutOfBoundsException exec){
		    	exec.getMessage();
		    }
		   
		    //tworzy tablicê ³añcuchów znakowych txt, ka¿dy z których sk³ada siê z l powtórzeñ litery x, gdzie l - kolejny element tablicy ltab, x kolejna litera, poczynaj¹c od 'a'.
		    int l;
		    char x;
		    l=3;
		    x='a';
		    String[] s=new String[l];
		    s=generateStringTab(s,x);
		    
		    for (String sh : s)  System.out.println(" "+sh+" ");
		    
		  }
	 
	 //wylicza sumê jej elementów o parzystych indeksach,
	 int sumParzI(int[] tab) throws ArrayIndexOutOfBoundsException {
		    int w = 0;  // utworzenie tablicy "pod wynik"
		                                    // jej rozmiary musz¹ byæ równe
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
