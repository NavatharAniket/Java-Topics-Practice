import java.util.Scanner;
class Palindrom
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = 0;

		for(int i = num; i>0; i = i/10)
		{	
			int fact = i % 10;
			reverse = reverse * 10 + fact;
		}
		if(num == reverse)
			System.out.println("Yes");
		else
			System.out.println("Not");
	}
}