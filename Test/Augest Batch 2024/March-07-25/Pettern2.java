/*
Q2. Write a java program to print this pattern. 
 
*/

class Pettern2
{
	public static void main(String[] args)
	{
		for(int i=0;i<6;i++)
		{
			char ch='A';
			for(int j=0;j<=11;j++)
			{
				
				if(j>=i && j<=11-i)
				{
					if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0))
					{
						System.out.printf("\t"+ch);
						ch++;
					}
					else
					{
						System.out.printf("\t ");
					}
				}
				else
				{
					System.out.printf("\t ");
				}
			}
			System.out.println();
		}
	}
}