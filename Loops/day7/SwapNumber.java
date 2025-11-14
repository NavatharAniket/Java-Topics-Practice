import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int last = num % 10;
		
		int temp = 0,reverse = 0;

		num = num / 10;
		for(int i = num ; i>0 ; i=i/10)
		{
			int fact = i % 10;
			temp = temp * 10 + fact;
		}
		
		int first = temp % 10;
		temp = temp / 10;
		
		temp = temp * 10 + last;

		for(int i = temp ; i>0 ; i=i/10)
		{
			int fact = i % 10;
			reverse = reverse * 10 + fact;
		}
		reverse = reverse * 10 + first;

		System.out.println("reverse Number is " + reverse);
	}	
	
}


/*  12345  => 90+8 => 98 * 10 + 7 => 87654329 */