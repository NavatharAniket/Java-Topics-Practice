/*
Q1. Write a java program to print this pattern. 
   1   2   3   4   5 
   1   2   3   4 
   1   2   3 
   1   2 
   1 
   1   2 
   1   2   3 
   1   2   3   4 
   1   2   3   4   5         

*/

class Pattern
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int temp=5;
		for(int i=0;i<9;i++)
		{
			
			for(int j=1;j<=temp;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<4)
				temp--;
			else 
				temp++;
		}
	}
}