/* 13. Write a java program to swap first and last digits of a number. */

import java.util.Scanner;
class swap{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int firstDigit, temp = num , reverse = 0;
		
		int lastDigit = temp % 10;

		while(num > 9)
		{
		    num = num / 10;		 	
		}
		firstDigit = num;
		num = temp;

		//reverse number
		
		
		
	}
}