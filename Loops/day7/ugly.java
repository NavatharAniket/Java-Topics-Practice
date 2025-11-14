//ugly Number  //factors

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
			if(num%i==0)
			{
				System.out.print(" "+i);
				int j,count = 0;
				for( j = 1 ; j <= i ; j++  )
				{
					count ++;
				}

				if(count ==  2 && i >  5)
				{
					System.out.println("Number is  not ugly Number");
					break;
				}
				
			}
		}
	}
}