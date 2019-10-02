package squareRoot;

import java.util.Scanner;

public class SquareRoot
{
	public static void main(String [] args)
	{
		
			//Variable Declaration
		Scanner sc = new Scanner(System.in);
		double num;
		
			//Prompt User & Save Output
		System.out.print("Please enter a number you would like to find the square root of:  ");
		num = sc.nextInt();
		
		sc.close();

			//Display Result
		System.out.println("The square root of that number is: " + Math.sqrt(num));
	}
}
