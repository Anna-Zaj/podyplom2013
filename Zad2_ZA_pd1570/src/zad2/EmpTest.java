package zad2;
import java.util.*;
import javax.swing.*;


public class EmpTest {

	/**
	 * @param args
	 */
	public EmpTest(){
	Employee prac1=defEmp("Podaj dane o pracowniku nr 1 oddzielone spacjami w formacie: Imiê Nazwisko Wiek Pensja");
	showInfo(prac1);
	changeSalary(prac1);
	showInfo(prac1);
	Employee prac2=defEmp("Podaj dane o pracowniku nr 2 oddzielone spacjami w formacie: Imiê Nazwisko Wiek Pensja");
	showInfo(prac2);
	changeSalary(prac2);
	showInfo(prac2);
	Employee prac3=defEmp("Podaj dane o pracowniku nr 3 oddzielone spacjami w formacie: Imiê Nazwisko Wiek Pensja");
	showInfo(prac3);
	changeSalary(prac3);
	showInfo(prac3);
	
	
	

	
	}
	Employee defEmp(String msg){
		Employee emp;
		String i="", n="";
		int w=0;
		double p=0;
		String in = JOptionPane.showInputDialog(msg);
	    if (in != null) {
	      Scanner scan = new Scanner(in);
	      if (scan.hasNext()) {
	         i = scan.next();
	        if (scan.hasNext()) {
	           n = scan.next();
	          if (scan.hasNextInt()) {
	        	   w = scan.nextInt();
	        	  if (scan.hasNextDouble()) {
		        	   p = scan.nextDouble();
	           
	        }}}
	      }
	    }
	  return new Employee(i,n,w,p);

	}
	public void showInfo(Employee e){
		System.out.println(e);
		JOptionPane.showMessageDialog( null, e);
	}
	
public void	changeSalary(Employee e){
	String proc = JOptionPane.showInputDialog("Podaj o ile % chcesz zmieniæ pensjê pracownika "+e.getNazwisko());
	int l1 = Integer.parseInt(proc);
	e.setPensjaProcent(l1);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpTest();
	}

}
