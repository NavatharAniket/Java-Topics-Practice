/*
Q4. WAP to create character array of size 10 and find the vowels from array
*/



import java.util.Scanner;
class vowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] ch=new char[10];
		for(int i=0; i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);	
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(" "+ch[i]);
		}
		System.out.println();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}
		
	}
}