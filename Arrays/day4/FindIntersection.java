/*
Q2. Intersection of two Arrays
Given two arrays a[] and b[], the task is find intersection of the two arrays.
Intersection of two arrays is said to be elements that are common in both arrays.
The intersection should not count duplicate elements and the result should contain items in any order.
Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
Output: {1,  3}
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements
Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
Output: {1}
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
Output: {}
Explanation: No common element in both the arrays.
Your Task is : Note you have to create class name as Intersection with two methods 
void setArray(int a[],int b[]): this function is used for accept two array as parameter 
Int [] getIntersection(): this function can find the intersection of array and return it.

*/

import java.util.Scanner;

class Intersection
{
	public void intersectionArrays(int[] arr,int[] arr2)
	{

		System.out.print("Common Elements in arrays is ");
		int[] k=new int[5];
		for(int i=0;i<arr.length;i++)
		{
		
			
				for(int j=0;j<arr2.length;j++)
				{
					if(arr[i]==arr[j])
					{
						k[arr[i]]++;
						
					}
				}	
				
			
		}

		//System.out.println("Repeted elements in Arrays are ");
		for(int i=0;i<k.length;i++)
		{
			if(k[i]>0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
class FindIntersection
{
	
	public static void main(String[] args)
	{
		Intersection in = new Intersection();
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int[] arr2=new int[5];
	
		System.out.println("enter elements in 1st arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements in second arrays ");
		for(int i=0;i<arr2.length;i++)
		{	
			arr2[i]=sc.nextInt();
		}

		in.intersectionArrays(arr,arr2);
			
	}
}