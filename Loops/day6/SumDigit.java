/*14. Write a C program to calculate sum of digits of a number. */

import java.util.Scanner;
class SumDigit{
	public static void main(String[] args)
	{
	   	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int sum=0;

		while(num > 0)
		{
			int digit = num %10;
			num = num / 10;
			sum = sum + digit ;
		}
		System.out.println("Sum of Digit is "+sum);
		
			 	
	}
}