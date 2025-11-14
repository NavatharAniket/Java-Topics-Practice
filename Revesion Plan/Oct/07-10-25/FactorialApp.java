/*
Q1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.

*/

import java.util.Scanner;
class Factorial
{
	int n;
	void setValue(int n)
	{
		this.n=n;
	}

	int getValue()
	{
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact*=i;
		}
		return fact;
	}
}
class FactorialApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Factorial f=new Factorial();
		System.out.println("Enter value for calculating factorial number");
		f.setValue(sc.nextInt());
		System.out.println("Factorial of Number is "+f.getValue());
	}
}