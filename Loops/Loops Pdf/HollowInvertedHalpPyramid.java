import java.util.Scanner;
class HollowInvertedHalpPyramid
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int sum = 0;
		for(int j = 1; j <= 5; j++)
		{
		
			for(int i =1;i <= 6-j;i++)
			{
				if(i==6-j  || i== 1 || j == 1)
					System.out.print("*");
				else
					System.out.print("h");
			}
			
				
			System.out.println();
		}
		
	}
}