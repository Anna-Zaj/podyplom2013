package zad1;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
import static javax.swing.JOptionPane.*;
import java.util.regex.*;

public class StringTest {
	
	
	
	public static void main(String[] args) {
		String msg = "WprowadŸ ³añcuch znaków:";
		
		 String res;
		while ((res = showInputDialog(msg)) != null) {
		     //podaje na konsoli d³ugoœæ ³añcucha,  
			int dlug=res.length();
		     System.out.println("D³ugoœæ ³añcucha: " + dlug);
		    
		     //wyprowadza pierwszy i ostatni znak  
		     char pierwszyZ=res.charAt(0);
		     System.out.println("Pierwszy znak to: " + pierwszyZ);
		    
		     char ostZ=res.charAt(dlug-1);
		     System.out.println("Ostatni znak to: " + ostZ);
		     
		     //wyprowadza pod³añcuch od 3 znaku do ostatniego znaku,
		     String od3=res.substring(2);
		     System.out.println("Pod³añcuch od 3 znaku: " + od3);
		     
		     // wyprowadza pod³añcuch od 3 znaku do przedostatniego znaku,
		    String od3doPrzed= res.substring(2,dlug-1);
		    System.out.println("Pod³añcuch od 3 znaku do przedostatniego znaku: " + od3doPrzed);
		    
		    //---------5-----------
		    //wyprowadza informacje o tym ile razy w wejœciowym ³añcuchu wystêpuje zadany pod³añcuch 
		    String regex ="po";
		    System.out.println("Tekst: \n" + "'" + res + "'" + 
                    "\nWzorzec: " + "'" + regex + "'");
		    
		    // Kompilacja wzorca
		    Pattern pattern = Pattern.compile(regex);

		    // Uzyskanie matchera
		    Matcher matcher = pattern.matcher(res);
		    
		    int ile =0;  // do prezentacji wyników wyszukiwania
		    while (matcher.find()) {
		        ile++ ;
		          
		      }
		      //1 podaje na konsoli d³ugoœæ ³añcucha,  
		   if (ile==0) System.out.println("Nie znaleziono ¿adnego podnapisu pasuj¹cego do wzorca");
		   System.out.println("Wzorzec wyst¹pi³ " +ile +" razy"  );

		   //----6-----
		   //tworzy tablicê wszystkich s³ów  ³añcucha i wyprowadza jej elementy poczynaj¹c od ostatniego, 
		// separatorem jest 1 lub wiêcej "bia³ych znaków" lub znaków interpunkcji
		    String regex6 = "[\\s\\p{Punct}]+";
		    pattern = Pattern.compile(regex6);
		    String[] words = pattern.split(res);
		    for(int i=words.length-1; i>=0;i--){
		    	System.out.println("Element " +i +" :"+words[i]  );
		    }
		//-------7------
		//stwierdzia czy pierwsze i ostatnie s³owo ³añcucha jest takie samo. 
		if(words[0].compareTo(words[words.length-1])==0)
			System.out.println("Pierwsze i ostatnie s³owo ³añcucha jest takie samo");
		else System.out.println("Pierwsze i ostatnie s³owo ³añcucha s¹ ró¿ne");

		}


	}
}

