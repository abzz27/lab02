package lab02;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		int cookies, calories = 300, servings = 4;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cookies consumed");
		cookies = input.nextInt();
		
		servings = cookies / servings;
		calories *= servings;
		
		System.out.println(cookies + " cookies are " + calories + " calories");
		
		
		
		
		
		
	}

}
