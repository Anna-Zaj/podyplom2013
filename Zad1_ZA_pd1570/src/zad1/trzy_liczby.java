/**
 * @author Anna Zaj¹czkowska pd1570
 *
 */
package zad1;

public class trzy_liczby {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=5;
		int c=9;
		
		int sum=a+b+c;
		int ilo=a*b*c;
		double sumpol=(double)a/2+(double)b/2+(double)c/2;
		double sumtrzy=(double)a/3+(double)b/3+(double)c/3;
		System.out.println("Wartoœci zmiennych:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println();
		
		System.out.println("Operacja nr 1");
		System.out.println("a+b+c="+sum);
		 System.out.println();
			System.out.println("Operacja nr 2");
			System.out.println("a*b*c="+ilo);
			 System.out.println();
				System.out.println("Operacja nr 3");
			 System.out.println("a/2+b/2+c/2="+sumpol);
			 System.out.println();
				System.out.println("Operacja nr 4"); 
			 System.out.println("a/3+b/3+c/3="+sumtrzy);
			 System.out.println();
			 
	}

}
