import java.util.Scanner;
class PrimeNumber1TON
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int j = 1; j <= num; j++)
		{
			int flag = 0;
			for(int i =2;i<j;i++)
			{
				if(j%i==0)
				{
					flag = 1;
				}
			}
			
			if(flag == 0)
			{
				System.out.println(j);
			}
			
		}
	}
}