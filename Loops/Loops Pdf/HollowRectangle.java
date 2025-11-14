import java.util.Scanner;
class HollowRectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int j = 1; j <= num; j++)
		{
		
			for(int i =1;i<=num;i++)
			{
				if(j==1 || j == num || i == 1 || i == num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
				
			System.out.println();
		}
		
	}
}