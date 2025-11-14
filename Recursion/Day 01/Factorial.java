/*
Write a Java recursive method to calculate the factorial of a given positive integer.
*/

import java.util.Scanner;
class Factorial
{

	public static void fact(int num)
	{
		if(num==1)
		{
			System.out.println(num);
			return 1;
		}
		
		int sum=a+b;
		int a=b;
		b=num;
		System.out.println(num);
		fact(num-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for calculating factorial Number");
		int num = sc.nextInt();

		fact(num);
	}
}