/*
13) Write a program in C to find the majority element of an array ? 
A majority element in an array A[] of size n is an element that appears more than n/2 times (and 
hence there is at most one such element). 
Expected Output : 
The given array is : 4 8 4 6 7 4 4 8 
There are no Majority Elements in the given array. 
*/

import java.util.Scanner;
class majority
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int[] count=new int[10];
		System.out.println("Enter Elements in Array");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			count[temp]++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(count[i]>=5)
			{
				System.out.println("This is the majority repeated element "+i);
				break;
			}
		}	
		
	}
}