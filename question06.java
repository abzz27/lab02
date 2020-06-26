package lab02;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		
		double s_tax = 0.04, c_tax = 0.02;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of purchase");
		double price = input.nextDouble();
		
		double price_s, price_c;
		price_s = price * s_tax;
		price_c = price * c_tax;
		
		System.out.println("State Tax: " + price_s);
		System.out.println("County Tax: " + price_c);
		
		System.out.println("Total Tax: " + (price_s + price_c));
		
		price += price_s + price_c;
		System.out.println("Total Sales: " + price);
		
		
		
		
	}

}
