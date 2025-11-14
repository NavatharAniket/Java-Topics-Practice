// Ugly Number

import java.util.Scanner;
class Ugly
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		
		int fact ;
		for(int i = 2; i<num;i++)
		{
		/*
			if(num%i==0)
			{
				/*
				System.out.println(" hello "+i);
				int j,flag = 0;
				*/

				/*
				for( j = 2 ; j < i ; j++  )
				{	

					if(i%j==0)
					{
						flag = 1;
						break;
					}
				}
				*/
				/*
					
				if(flag ==  1 && i >  5)
				{
					System.out.println(" not ugly Number "+ i);
					break;
				}
				else
				{
					System.out.println("  ugly Number "+ i);
					break;
				}
				*/
				
			}
		*/
		System.out.println(i);
		}
	}
}