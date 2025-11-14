/*
15) Write a program in C to find the ceiling in a sorted array? 
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array 
greater than or equal to x, and the floor is the greatest element smaller than or equal to x. 
Expected Output : 
The given array is : 1 3 4 7 8 9 9 10 
The ceiling of 5 is: 7
*/

import java.util.Scanner;
class Ceiling
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Arrays ");
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a key ");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=key)
			{
				System.out.println(arr[i]);
				break;
			}
		}

		
	}
}