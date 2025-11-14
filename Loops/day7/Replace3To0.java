import java.util.Scanner;
class Replace
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int reverse = 0,fact;
		for(int i = num ; i> 0;i=i/10)
		{
			fact = i % 10;
			reverse = reverse * 10 + fact;
		}
     		//System.out.println(reverse);
			num = 0;
		for(int i = reverse ; i> 0 ; i=i/10)
		{
			fact = i % 10;
			if (fact == 3)
				fact = 0;
			num = num * 10 + fact;
		}

		System.out.println(num);
	}
}