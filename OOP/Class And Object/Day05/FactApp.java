/*
Q2. WAP to create class name as Factorial with two functions 
void setNumber(): this function can accept the number as parameter
void displayFactorial(): this function can display the factorial of number  

*/

import java.util.Scanner;
class Fact
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}

	public void getFact()
	{
		int i=1;
		for(;i<=num;i++)
		{
			i*=i;
		}
		System.out.println(i);
	}
}
class FactApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();

		Fact f=new Fact();
		f.setNum(num);
		f.getFact();

		
	}
}