package zad2;
/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */

public class zakupy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tow1="truskawki";
		String tow2="gruszki";
		String tow3="ziemniaki";
		
		double ctow1=4.5;
		double ctow2=2;
		double ctow3=1;
		
		double itow1=1;
		double itow2=0.5;
		double itow3=2;
		
		
		double ktow1=ctow1*itow1;
		double ktow2=ctow2*itow2;
		double ktow3=ctow3*itow3;
		
		double ptow1=ktow1/(ktow1+ktow2+ktow3)*100;
		double ptow2=ktow2/(ktow1+ktow2+ktow3)*100;
		double ptow3=ktow3/(ktow1+ktow2+ktow3)*100;
		
		double suma=ktow1+ktow2+ktow3;
		
		
		System.out.println("Kupiono:");
		System.out.println(tow1+" - "+itow1+" kg po "+ctow1+" z³/kg - kwota: "+ktow1+" z³ ("+ptow1+"% ³¹cznej kwoty)");
		System.out.println(tow2+" - "+itow2+" kg po "+ctow2+" z³/kg - kwota: "+ktow2+" z³ ("+ptow2+"% ³¹cznej kwoty)");
		System.out.println(tow3+" - "+itow3+" kg po "+ctow3+" z³/kg - kwota: "+ktow3+" z³ ("+ptow3+"% ³¹cznej kwoty)");
		
		System.out.println("Do zap³aty: "+suma);
	}

}
