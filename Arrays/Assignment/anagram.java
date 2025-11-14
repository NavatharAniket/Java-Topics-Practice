/*
Q3. WAP to create two character array of size 5 and check character array is anagram or not 
First array :     a  b d  e c 
Second array: a c d  b e
Output: it is anagram character array

First input    :   abcd
Second Input : mnop
Output: it is not anagram array

*/

import java.util.Scanner;
class anagram
{
	public static void main(String[] args)
	{
		char[] ch=new char[5];
		char[] ch1=new char[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array ");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Enter Second Array ");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		int flag=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch1[j])
					flag++;
			}
		}

		if(flag>4)
		{
			System.out.println("Arrays are anagram Array");
		}
		else
		{
			System.out.println("Arrays are Not anagram Array");
		}
	}
}