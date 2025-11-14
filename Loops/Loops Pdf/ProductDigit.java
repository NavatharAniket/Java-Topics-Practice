import java.util.Scanner;
class ProductDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int temp = num;

		int sum = 1;
		for(int i = num; i>0; i = i/10)
		{	
			int fact = i % 10;
			sum = sum * fact;
		}
		
		System.out.println(sum);
	}
}