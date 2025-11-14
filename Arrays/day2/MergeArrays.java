/*
8) 
Write a program in C to merge two arrays of same size sorted in decending order. 
Test Data : 
Input the number of elements to be stored in the first array :3 
Input 3 elements in the array : 
element - 0 : 1 
element - 1 : 2 
element - 2 : 3 
Input the number of elements to be stored in the second array :3 
Input 3 elements in the array : 
element - 0 : 1 
element - 1 : 2 
element - 2 : 3 
Expected Output : 
The merged array in decending order is : 
3 3 2 2 1 1
*/

import java.util.Scanner;
class MergeArrays
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr2=new int[5];
		int[] arr1=new int[5];
		int[] arr=new int[10];

		System.out.println("Enter a elements in 1st arrays size 5");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Elements in 2nd Arrays size 5");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int k=arr1.length-1;
		for(int i=0;i<arr.length;i=i+2)
		{
			arr[i]=arr1[k];
			arr[i+1]=arr2[k];
			k--;
		}
			
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}
}