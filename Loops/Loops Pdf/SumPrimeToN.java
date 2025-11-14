import java.util.Scanner;
class SumPrimeToN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int j = 1; j <= num; j++)
		{
			int flag = 0;
			for(int i =2;i<j;i++)
			{
				if(j%i==0)
				{
					sum = sum+i;
				}
			}
			
			
		}
		System.out.println(sum);
	}
}