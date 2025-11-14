import java.util.Scanner;
class FrequencyDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0; i<10; i++)
		{
			int temp = 0;
			for(int j = num; j>0; j=j/10)
			{
				int fact = j % 10;
				if(fact == i )
				{
					temp++;
				}
			}
			
			if(temp > 0)
				System.out.println(i + " : "+ temp);		
		}
	}
}