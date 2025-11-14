import java.util.Scanner;
class HappyN
{
	public  static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int org = n;
		while(true)
		{
			int sum = 0;
			while(n!=0){
				int rem = n%10;
				sum = sum + (rem*rem);
				n=n/10;
			}
			if(sum==1){
				System.out.println("Number is happy");
				break;
			}
			if(sum==4){
				System.out.println("Number is not happy");
				break;
			}
			n = sum;
		}
	}
}