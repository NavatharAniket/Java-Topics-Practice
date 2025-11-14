/*
26) Write a program in C to count all distinct pairs for a specific difference 
Expected Output: 
The given array is: 
5 2 3 7 6 4 9 8 
The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4] 
Number of distinct pairs for difference 5 are: 3 
*/

import java.util.Scanner;
class CountAllDistinctPairs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[8];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Specific Differance ");
		int diff=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]==diff)
				{
					System.out.println("("+arr[j]+","+arr[i]+")"+" ");
				}
			}
		}
	}
}

