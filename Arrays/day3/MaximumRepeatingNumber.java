/*
27) Write a program in C to find the maximum repeating number in a given array. 
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n.. 
Expected Output: 
The given array is: 
2 3 3 5 3 4 1 7 7 7 7 
The maximum repeating number is: 7
*/

import java.util.Scanner;
class MaximumRepeatingNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[11];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int[] temp=new int[11];
		for(int i=0;i<arr.length;i++)
		{
			temp[arr[i]]++;
		}
			int max=Integer.MIN_VALUE;
			int big=0;
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>max)
			{
				max = temp[i];
				big=i;
			}
		}

		System.out.println("The maximum repeating number is: "+big);
	}
}