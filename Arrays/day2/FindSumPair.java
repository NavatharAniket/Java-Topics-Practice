/*
12) . Write a program in C to find a pair with given sum in the array.  
Expected Output : 
The given array : 6 8 4 -5 7 9 
The given sum : 15 
Pair of elements can make the given sum by the value of index 0 and 5 
*/

import java.util.Scanner;
class FindSumPair
{
	public static void main(String[] args)
	{
		int[] arr={6,8,4,-5,7,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Element For Sum");
		int sum=sc.nextInt();

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(sum == (arr[i]+arr[j]))
				{
					System.out.println("The index is "+i+" "+j);
					
				}	
			}
		}
	}
}