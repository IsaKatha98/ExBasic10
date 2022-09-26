package exbasic10;

import java.util.Scanner;

public class ExBasic10 {

	public static void main(String[] args) {
		
		final int IVA= 21;
		double precioint;
		double precioiva;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduzca precio:");
		precioint= sc.nextDouble();
		
		precioiva= (precioint*IVA/100)+precioint;
		
		System.out.println(precioiva);
		
		sc.close();

	}

}
