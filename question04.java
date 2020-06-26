package lab02;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of males");
		int males = input.nextInt();
		
		System.out.println("Enter number of females");
		int females = input.nextInt();
		
		int total = females + males;

		
		
		double percentage_female = females * 100 / total;
		double percentage_male = males * 100 / total;
		
		System.out.println(total + " people in the class");
		System.out.println(percentage_female + "% female");
		System.out.println(percentage_male + "% male");
	}

}
