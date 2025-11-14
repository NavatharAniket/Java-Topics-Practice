/*
Q2. WAP to create character array of size 15 and extract digit from character array and calculate sum of that digit
Input: abc123mno456pqrstv
Output: 1+2+3+4+5+6 = 21

*/

import java.util.Scanner;
class SumCharDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] ch=new char[15];
		for(int i=0; i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);	
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(" "+ch[i]);
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
			{
				int temp=ch[i]-'0';
				sum=sum+temp;	
			}
		}
		System.out.println(sum);
	}
}