/*
    Q2. Write a java program to check whether number is Duck or not using recursion. 

*/
import java.util.Scanner;
class DuckNumber
{
	public static Boolean Duck(int num)
	{
		if(num==0 || num<10)
		{
			return false;
		}
		
		int n=num%10;
		if(n==0)
		{
			return true;
		}
		num = num/10;
		return Duck(num);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();
		if(Duck(num))
		{
			System.out.println("Number is Duck Number");
		}
		else
		{
			System.out.println("Not a Duck Number");
		}
	}
}