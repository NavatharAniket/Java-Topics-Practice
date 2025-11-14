/*
Q1. WAP to create character array of size 5 and convert lower case character array to uppercase character array
*/

import java.util.Scanner;
class LowerToUpper
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements in Arrays ");
		char[] ch={'a','s','d','f','g','h'};
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]-=32;
		}

		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}

	}
}