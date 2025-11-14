/*
Q3. Given two sorted arrays, the task is to merge them in a sorted manner.
Examples: 
Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 

Your Task: you have to create class name as MergeSort with constructor and methods 
MergeSort(int a[],int []): this function is used for accept two array as parameter 
int[] getMergedArray(): this function is used for return merged array

*/

import java.util.Scanner;
class MergeSort
{
	int[] x=new int[10];
	int[] sort(int[] a,int[] b)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				x[k++]=a[i++];
			}
			else
			{
				x[k++]=b[j++];	
			}
		}
		if(i<a.length)
		{
			x[k]=a[i];
		}
		else
		{
			x[k]=b[j];
		}
		return x;
	}
}

class MergeSortApp
{
	public static void main(String[] args)
	{
	MergeSort m=new MergeSort();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Elements in 1st Arrays ");
	int[] arr=new int[5];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}

	System.out.println("Enter elements in 2nd Arrays ");
	int[] arr2=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr2[i]=sc.nextInt();
	}
	int[] s =m.sort(arr,arr2);
	for(int i=0;i<s.length;i++)
	{
		System.out.println(" "+s[i]);
	}
	}
}