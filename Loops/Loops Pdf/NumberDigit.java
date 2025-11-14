import java.util.Scanner;
class NumberDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = num; i>0; i = i/10)
		{	
			sum++;
		}
		
		System.out.println(sum);
	}
}