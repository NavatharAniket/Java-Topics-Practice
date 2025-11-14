/*
 Q2. Rearrange an array such that arr[i] = i
Given an array of elements of length n, ranging from 0 to n – 1. 
All elements may not be present in the array.
 If the element is not present then there will be -1 present in the array. 
 Rearrange the array such that arr[i] = i and if i is not present, display -1 at that place.
Examples: 
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of them.
Input: arr[] = [0, 1, 2, 3, 4, 5] 
Output: [0, 1, 2, 3, 4, 5]
Explanation: In range 0 to 5, all numbers are present.

Your Task: You have to create class name as ReArrange with constructor and methods 
ReArrange(int a[]): this function is used for accept array as parameter
int [] getReArrange(): this function can rearrange all arrays and return it.

*/

import java.util.Scanner;

class Find
{
	void arrange(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length;j++)
			{
			
				if(i==arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					flag=false;
					
				}
				
			}
			if(flag)
			 arr[i]=-1;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}


	
}
class Rearrange
{
	public static void main(String[] args)
	{
		Find f=new Find();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Arrays ");
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		f.arrange(arr);
	}
}