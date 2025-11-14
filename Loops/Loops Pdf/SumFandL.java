import java.util.Scanner;
class SumFandL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first=0,last=num%10;
		for(int i = num; i>0; i = i/10)
		{	
			if(i<10)
			{
				first = i;
			}
		}
		
		System.out.println(first+last);
	}
}