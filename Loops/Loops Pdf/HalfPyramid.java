import java.util.Scanner;
class HalfPyramid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int j = 1; j <= num; j++)
		{
		
			for(int i =1;i <= j;i++)
			{
				System.out.print("*");
			}
				
			System.out.println();
		}
		
	}
}