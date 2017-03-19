package zad2;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
public class Employee {
	//private static int counter;
	//private int id=0;
	private String imie;
	private String nazwisko;
	private int wiek;
	private double pensja; 
	/**
	 * @param args
	 */
	public Employee(String i, String n, int w, double p){
	//	counter++;
		//id=counter;
		imie=i;
		nazwisko=n;
		wiek=w;
		pensja=p;
		//System.out.println(counter);
	}
	 public String getImie() {
		   return imie;
		 }
	 
	 public String getNazwisko(){
		 return nazwisko;
	 }
	 public int getWiek(){
		 return wiek;
	 }
	/* public int getId(){
		 return id;
	 }*/
	 public double getPensja(){
		 return pensja;
	 }
	 public void setPensja(double p) {
		   pensja = p;
		 }
	 public void setPensjaProcent(double proc) {
		   pensja += pensja*(proc/100);
		 }
	 public String toString() {
		 return "Imiê: "+imie+", Nazwisko: "+nazwisko+", Wiek: "+wiek+", Pensja:"+pensja;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
