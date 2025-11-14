// Spy Number = sum of digit = product of digit

import java.util.Scanner;
class Spy
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int sum = 0, product = 1;
		for(int i = num;i>0;i=i/10)
		{
			int fact = i % 10;
			sum = sum + fact;
			product = product * fact;
		}
	
		if(sum == product)
		{
			System.out.println("Number is Spy Number");
		}
		else
		{
			System.out.println("Number is Not Spy Number");
		}
	}
}