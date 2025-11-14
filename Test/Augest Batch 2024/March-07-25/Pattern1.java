/*
Q1. Write a java program to print this pattern. 
 
 # 1 
 # 2 
 # 3 # 3 
 # 4 # 4 
 # 5 # 5 # 5 
 # 6 # 6 # 6 
*/

//import java.util.Scanner;
class Pattern1
{
	
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int flag=2;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<flag;j++)
			{
				if(j%2!=0)
					System.out.print((i+1)+" ");
				else
					System.out.print("#"+" ");
			}
			System.out.println();
			if(i%2!=0)
				flag=flag+2;
		}
	}
}