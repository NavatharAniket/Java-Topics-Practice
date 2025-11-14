import java.util.Scanner;
class Happy
{
	public  static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		int sum = 0,fact;
		for(int i = num; i> 0 ; i=i/10)
		{
	        	fact = i % 10;
			int sqr = fact * fact;
			sum = sum + sqr;
			//System.out.println(sum);

			if(i < 10)
			{
				
				if (sum == 1)
				{
					System.out.println("Number is Happy Number");
					break;
				}
				else if(sum == 4)
				{
					System.out.println("Number is Not Happy Number");
					break;	
				}
				else
				{
					i = sum*10;
					//System.out.println(" i value is "+i);
					sum = 0;
				}
			}	
		}
	}
}