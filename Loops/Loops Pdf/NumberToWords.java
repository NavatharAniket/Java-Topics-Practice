import java.util.Scanner;
class NumberToWords
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int reverse = 0;
		for(int j = num; j>0; j = j/10)
		{
			int fact = j % 10;
			reverse = reverse * 10 + fact;
		}		

		for(int i = reverse; i>0; i = i/10)
		{
			int ch = i%10;

			switch(ch)
			{
				case 0:
					System.out.print("Zero");
					break;

				case 1:
					System.out.print("One");
					break;

				case 2:
					System.out.print("Two");
					break;

				case 3:
					System.out.print("Three");
					break;

				case 4:
					System.out.print("Four");
					break;

				case 5:
					System.out.print("Five");
					break;

				case 6:
					System.out.print("Six");
					break;

				case 7:
					System.out.print("Seven");
					break;

				case 8:
					System.out.print("Eight");
					break;

				case 9:
					System.out.print("Nine");
					break;
			}	
		}
	}
}