import java.util.Scanner;
class SecondLargest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter Elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		int l=0,sl=0;
		for(int i=0;i<arr.length;i++)
		{
			if(l<arr[i])
			{
				sl=l;
				l=arr[i];
			}
		}

		System.out.println("Second largest element is : "+sl);
	}
}