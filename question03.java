package lab02;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int max = input.nextInt();
		
		int i = 1;
		int value = 0;
		while(i <= max) {
			value += i;
			
			i++;
		}
		System.out.println(value);
	}

}
