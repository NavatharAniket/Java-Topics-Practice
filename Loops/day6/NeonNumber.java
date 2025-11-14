import java.util.Scanner;
class Neon
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int temp = num;
	int fact ,sum = 0;
	num = num * num;

	 while(num > 0)
	{
		fact = num % 10;
		num = num / 10;
		sum = sum + fact;
	}
	
	if(sum == temp)
		System.out.println("number is neon");
	else
		System.out.println("number is neon");
	
	}

}