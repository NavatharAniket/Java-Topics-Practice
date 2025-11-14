import java.util.Scanner;
class reverse{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num,reverse = 0,rem ;

		while(num>0)
		{
		rem = num % 10;
		reverse = reverse * 10 + rem;
		num = num / 10;
		}
		System.out.println(reverse);
	}
}