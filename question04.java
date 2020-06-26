package lab02;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		
		int males, females, total;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of males");
		males = input.nextInt();
		
		System.out.println("Enter number of females");
		females = input.nextInt();
		
		total = females + males;

		
		double percentage_male, percentage_female;
		
		percentage_female = (females/ total) * 100;
		percentage_male = (males / total) * 100;
		
		System.out.println(total + " people in the class");
		System.out.println(percentage_female + "% female");
		System.out.println(percentage_male + "% male");
	}

}
