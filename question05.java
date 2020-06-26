package lab02;

import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {
		
		double tax = 6.75;
		double tip = 1.2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter charge");
		double charge = input.nextDouble();
		
		charge = charge + (charge/tax) ;
		System.out.println(charge);
		
		charge *= tip;
		System.out.println(charge);
	}

}
