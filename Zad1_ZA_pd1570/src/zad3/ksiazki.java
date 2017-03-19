package zad3;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
public class ksiazki {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 241;         // liczba ksi¹¿ek

		    int k = 7;          // ile ksia¿ek mieœci siê na pó³ce
		                        
		                         
		    int poj  = n/k;     
		    int rest = n%k;     
		                        
		                       

		    if (rest != 0) {    
		       poj++;           
		       k = rest;        
		    }
		    System.out.println("Liczba ksi¹¿ek        : " + n); 
		
		    System.out.println("Pó³ek zajêtych        : " + poj); 
		    System.out.println("Liczba ksi¹¿ek na ostatniej z zajêtych pólek: " + k);

	}

}
