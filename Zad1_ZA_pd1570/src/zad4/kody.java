package zad4;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
public class kody {
	public static void main(String[] args) {
		char c = 'a';
		while (c <= 'z' ) {
			
			 int kod = c;

		    System.out.println("Kod znaku " + c + " = " + kod);
		    c++;
		} 
		 char[] pl = {'¹', 'ê', 'ó', 'æ', '³', 'ñ', 'œ', '¿', 'Ÿ'};
	     int i=0;
	     while ( i< pl.length)
	     {
	        System.out.println("Kod znaku "+pl[i] + " = " + (int)pl[i]);
	        i++;
	     }
	}
	
	
}
