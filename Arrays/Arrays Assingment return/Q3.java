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
class Q3
{
	public void anagram(char ch1,char ch2)
	{
		boolean flag=true;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch[j])
				{
					flag=false;
					break;
				}
			}
			flag = true;		
		}
		if(flag)
		{
			System.out.println("not Anyagram Arrays");
		}
		else
		{
			System.out.println("Given Array is Anyagram");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arrays ");
		char[] ch1=new char[5];
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().chartAt();
		}

		System.out.println("Enter Second Arrays ");
		char[] ch2=new char[5];
		for(int i=0;i<ch2.length;i++)
		{
			ch2=sc.next().charAt();
		}

		Q3 Q3=new Q3();
		Q3.anagram( ch1, ch2);
	}
	
}