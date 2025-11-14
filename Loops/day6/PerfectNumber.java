// find perfect number
import java.util.Scanner;
class Perfect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int i =1,sum = 0,temp = num;
		while(i<num)
		{
			
			if(num % i == 0)
			sum = sum + i;
			i++;
		}
		
		if(sum == temp)
		System.out.println("number is perfect number");
		else
		System.out.println("number is not perfect number");
	}
}