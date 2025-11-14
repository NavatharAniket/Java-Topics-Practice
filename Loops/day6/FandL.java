import java.util.Scanner;
class FandL{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int df = 0,dl=num %10;
		while(num>0)
		{
			num = num/10;
			if (num > 10 && num < 99)
			{
			df = num / 10;
			break;
			}
		}
		System.out.println("first digit "+df);
		System.out.println("last Digit "+ dl);
		
	}
}