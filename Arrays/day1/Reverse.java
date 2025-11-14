import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[9];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		int temp = 0;
		System.out.println("Enter in loop");
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.println("Enter loop");
			temp=arr[i];
			System.out.println("Check Condition"+i);
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			System.out.println("loop COmpleted"+i);
		}

		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}