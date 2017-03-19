package zad1;
/**
 * @author Anna Zaj�czkowska pd1570
 *
 */
import static javax.swing.JOptionPane.*;
import java.util.regex.*;

public class StringTest {
	
	
	
	public static void main(String[] args) {
		String msg = "Wprowad� �a�cuch znak�w:";
		
		 String res;
		while ((res = showInputDialog(msg)) != null) {
		     //podaje na konsoli d�ugo�� �a�cucha,  
			int dlug=res.length();
		     System.out.println("D�ugo�� �a�cucha: " + dlug);
		    
		     //wyprowadza pierwszy i ostatni znak  
		     char pierwszyZ=res.charAt(0);
		     System.out.println("Pierwszy znak to: " + pierwszyZ);
		    
		     char ostZ=res.charAt(dlug-1);
		     System.out.println("Ostatni znak to: " + ostZ);
		     
		     //wyprowadza pod�a�cuch od 3 znaku do ostatniego znaku,
		     String od3=res.substring(2);
		     System.out.println("Pod�a�cuch od 3 znaku: " + od3);
		     
		     // wyprowadza pod�a�cuch od 3 znaku do przedostatniego znaku,
		    String od3doPrzed= res.substring(2,dlug-1);
		    System.out.println("Pod�a�cuch od 3 znaku do przedostatniego znaku: " + od3doPrzed);
		    
		    //---------5-----------
		    //wyprowadza informacje o tym ile razy w wej�ciowym �a�cuchu wyst�puje zadany pod�a�cuch 
		    String regex ="po";
		    System.out.println("Tekst: \n" + "'" + res + "'" + 
                    "\nWzorzec: " + "'" + regex + "'");
		    
		    // Kompilacja wzorca
		    Pattern pattern = Pattern.compile(regex);

		    // Uzyskanie matchera
		    Matcher matcher = pattern.matcher(res);
		    
		    int ile =0;  // do prezentacji wynik�w wyszukiwania
		    while (matcher.find()) {
		        ile++ ;
		          
		      }
		      //1 podaje na konsoli d�ugo�� �a�cucha,  
		   if (ile==0) System.out.println("Nie znaleziono �adnego podnapisu pasuj�cego do wzorca");
		   System.out.println("Wzorzec wyst�pi� " +ile +" razy"  );

		   //----6-----
		   //tworzy tablic� wszystkich s��w  �a�cucha i wyprowadza jej elementy poczynaj�c od ostatniego, 
		// separatorem jest 1 lub wi�cej "bia�ych znak�w" lub znak�w interpunkcji
		    String regex6 = "[\\s\\p{Punct}]+";
		    pattern = Pattern.compile(regex6);
		    String[] words = pattern.split(res);
		    for(int i=words.length-1; i>=0;i--){
		    	System.out.println("Element " +i +" :"+words[i]  );
		    }
		//-------7------
		//stwierdzia czy pierwsze i ostatnie s�owo �a�cucha jest takie samo. 
		if(words[0].compareTo(words[words.length-1])==0)
			System.out.println("Pierwsze i ostatnie s�owo �a�cucha jest takie samo");
		else System.out.println("Pierwsze i ostatnie s�owo �a�cucha s� r�ne");

		}


	}
}

