public class VerticalRightSolidOddPyramid
{
	public static void main(String args[])
	{
		int k =5;
		for(int i =1; i<=9; i++)
		{
			for(int j =1; j<=5;j++)
			{
				if(k<=j)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			if(i<5)
				k--;
			else
				k++;

			System.out.println();
			
		}
		
	}
}