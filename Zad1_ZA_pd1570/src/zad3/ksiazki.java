package zad3;
/**
 * @author Anna Zaj�czkowska pd1570
 *
 */
public class ksiazki {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 241;         // liczba ksi��ek

		    int k = 7;          // ile ksia�ek mie�ci si� na p�ce
		                        
		                         
		    int poj  = n/k;     
		    int rest = n%k;     
		                        
		                       

		    if (rest != 0) {    
		       poj++;           
		       k = rest;        
		    }
		    System.out.println("Liczba ksi��ek        : " + n); 
		
		    System.out.println("P�ek zaj�tych        : " + poj); 
		    System.out.println("Liczba ksi��ek na ostatniej z zaj�tych p�lek: " + k);

	}

}
