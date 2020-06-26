package lab02;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = input1.nextInt();
		System.out.println("Enter your second number");
		int num2 = input1.nextInt();
		
		int greatest, smallest;
		if (num1 >= num2) {
			greatest = num1;
			smallest = num2;
		}else {
			greatest = num2;
			smallest = num1;
		}
		
		int finish = 1;
		while(finish != 0) {
			
			Scanner next = new Scanner(System.in);
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			finish = next.nextInt();
			
			if(finish == 1) {
				
				Scanner another = new Scanner(System.in);
				System.out.println("Enter your next number");
				int another1 = another.nextInt();
				
				if (another1 > greatest) {
					greatest = another1;
				}else if(another1 < smallest) {
					smallest = another1;
				}
				
				
				
			}else if(finish == 0) {
				System.out.println("Smallest Number is: " + smallest);
				System.out.println("Largest Number is: " + greatest);
				
			}
		}

		
		
		

	}

}
