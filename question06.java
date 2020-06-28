package lab02;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		
		double s_tax = 0.04, c_tax = 0.02;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of purchase");
		double price = input.nextDouble();
		
		s_tax *= price;
		c_tax *= price;
		
		System.out.println("State Tax: " + s_tax);
		System.out.println("County Tax: " + c_tax);
		
		System.out.println("Total Tax: " + (s_tax + c_tax));
		
		price += s_tax + c_tax;
		System.out.println("Total Sales: " + price);
		
	}

}
