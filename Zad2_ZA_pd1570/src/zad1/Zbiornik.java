package zad1;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
public class Zbiornik {

	/**
	 * @param args
	 */
	private static int nrZbiornika;

	  private double pojemnosc;
	  private double stan;
	  

	  public Zbiornik(double p) {
	    nrZbiornika++;
	    pojemnosc=p;
	   }
	  
	public void  dolej(double woda) {
		if(stan+woda<=pojemnosc)stan+=woda;
		else System.out.println("Za du¿o wody!");
		
	  }
	public void odlej(double woda) {
		 if(stan-woda>=0) stan-=woda;
		 else System.out.println("Nie ma tyle wody w zbiorniku!");
		  
	  }
	  
	  public String toString() {
		   return " Zbiornik " + nrZbiornika + ", pojemnoœæ" + pojemnosc + ", stan wody "+stan;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Zbiornik z1 = new Zbiornik(200);
System.out.println(z1);  
z1.dolej(100);
System.out.println(z1);
z1.odlej(50);
System.out.println(z1);
Zbiornik z2 = new Zbiornik(1000);
z2.dolej(500);
System.out.println(z2);

Zbiornik z3 = new Zbiornik(100);
System.out.println(z3);  
z3.dolej(101);
System.out.println(z3);
z3.odlej(100);



	}

}
