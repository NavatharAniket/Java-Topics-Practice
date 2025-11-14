import java.util.Scanner;
class ArmStrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num,count = 0,fact,sum = 0;
		while(num > 0)
		{
			count ++;
			num = num / 10;
		}

		System.out.println(count);

		num = temp;
	
		while(num > 0)
		{
			fact = num % 10;
			int i = 1,sqr = 1;
			while(i<=count)
			{
			 	sqr = fact * sqr;
				i++;
			}
				System.out.println("sqr of "+i+" is "+ sqr);

			sum = sum + sqr;
		num = num / 10;
		}
	
		if(sum == temp )
		{
			System.out.println("Number is Armstrong number");
		}
		else
		{
			System.out.println("Number is not Armstrong number");

		}

	
	}
}