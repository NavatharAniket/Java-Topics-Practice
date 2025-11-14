/*
Q1.Median of two Sorted Arrays of Different Sizes
Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays. 
Assume that the two sorted arrays are merged and then median is selected from the combined array.

 
Examples: 
Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
Output: 3
Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. 
So the median of the merged array is 3.

Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45, 60]
Output: The median is 11.
Explanation : The merged array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45, 60]. 
So the median of the merged array is 17.

Input: a[] = [], b[] = [2, 4, 5, 6]
Output: The median is 4.5
Explanation: The merged array is [2, 4, 5, 6]. The total number of elements are even,
 so there are two middle elements. Take the average between the two: (4 + 5) / 2 = 4.5

Your Task : you have to create class name as Median with constructor and some methods given below 
Median(int a[],int b[]): this constructor help us to accept two array as parameter 
float getMedian(): this function can find the median of an array and return its result.



*/

import java.util.Scanner;
class Find
{
	int[] x=new int[11];
	void setValue(int arr[],int[] arr2)
	{
		int k=0,i=0,j=0;
		
		while(i < arr.length && j < arr2.length)
		{
			
			
				if(arr[i]<arr2[j])
				{
					x[k++]=arr[i++];
					
				}
				else
				{
					x[k++]=arr2[j++];
					//k++;
				}
			
		}
	}

	int getMedian()
	{
		if((x.length-1)/2==0)
			return x[(x.length-1)/2];
		else
		{
			int num1=(x.length-1)/2;
			int num2 = (x.length-1)/2+1;
			int mid=(x[num1]+x[num2])/2;
			return mid;
		}
	}
}

class MedianOfSortedArray
{
	public static void main(String[] args)
	{
		Find f=new Find();
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int[] arr2=new int[6];

		System.out.println("Enter in first Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter in Second Array");
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		f.setValue(arr,arr2);
		int num = f.getMedian();
		System.out.println("Medium of number is "+num);
	}
		
}