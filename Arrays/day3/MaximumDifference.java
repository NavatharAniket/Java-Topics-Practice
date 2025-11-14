/*
25) Write a program in C to find out the maximum difference between any two elements such that 
larger element appears after the smaller number. 
Expected Output : 
The given array is : 7 9 5 6 13 2 
The elements which provide maximum difference is: 5, 13 
The Maximum difference between two elements in the array is: 8 
*/

import java.util.Scanner;
class MaximumDifference
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];

		int maxDiff=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int diff=arr[j]-arr[i];
					if(maxDiff<diff)
					{
						maxDiff=diff;
					}
				}
			}
		}
		System.out.println("Max diff is "+maxDiff);
	}
}