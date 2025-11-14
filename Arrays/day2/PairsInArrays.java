import java.util.Scanner;
class PairsInArrays
{
	public static void pairs(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print(" "+"( "+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in arrays");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		pairs(arr);	
	}
}