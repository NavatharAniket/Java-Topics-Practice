/*
print numbers in reverse order
*/

import java.util.Scanner;
class ReverseNumbers
{
	public static void reverse(int num)
	{
		if(num==1)
		{
			System.out.println(num);
			return ;
		}
		System.out.println(num+" ");
		reverse(num-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		reverse(num);
		
	}

}