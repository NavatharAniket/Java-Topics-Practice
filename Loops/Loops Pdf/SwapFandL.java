import java.util.Scanner;
class SwapFandL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int first=0,last=num%10,count=1;
		for(int i = num; i>0; i = i/10)
		{	
			if(i<10)
			{
				first = i;
			}
			count=count*10;
		}
		count = count/10;

		int mid = (temp % count)/10;

		int n = last*count + mid*10+first;
		System.out.println(n);
	}
}