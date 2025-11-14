/*
Find Duplicate in Array - Given an array with repeated elements, find the element that appears more than once.
*/
import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		int n=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(n<arr[i])
			{
				n=arr[i];
			}
		}

		int[] max=new int[n+1];

		for(int i=0;i<arr.length;i++)
		{
			max[arr[i]]++;
		}

		for(int i=0;i<max.length;i++)
		{
			if(max[i]>=2)
				System.out.print(" "+i);
		}	

	}

}