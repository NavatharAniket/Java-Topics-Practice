/*
11). Write a program in C to find the second largest element in an array ? 
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 
*/

import java.util.Scanner;
class SecondLargest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Arrays ");
		int[] arr=new int[5];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		//sort array
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		
		System.out.println("Second Largest Number is "+arr[3]);
	}
}