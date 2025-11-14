/*write a java program to print the following pattern 
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
*/

class pattern1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=17;j++)
			{	
				if(j<8+i && j>8-i)
					if((i%2==0 && j%2!= 0) || (i%2!=0 && j%2==0))
						System.out.print(i);
					else 
						System.out.print("*");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}