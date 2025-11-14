/*
20) Write a program in C to find a subarray with given sum from the given array? 
Expected Output : 
The given array is : 3 4 -7 1 3 3 1 -4 
[0..1] -- { 3 4 } 
[0..5] -- { 3 4 -7 1 3 3 } 
[3..5] -- { 1 3 3 } 
[4..6] -- { 3 3 1 } 
*/

import java.util.Scanner;
class SubarrayWithGivenSum
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

		System.out.println("Enter Starting index ");
		int start=sc.nextInt();
		System.out.println("Enter Ending index ");
		int end=sc.nextInt();
	
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");	
			sum += arr[i];
		}
			System.out.println();
		System.out.println("the sum of subarray from index "+start+" to end index "+end+" is "+sum);
	}
}