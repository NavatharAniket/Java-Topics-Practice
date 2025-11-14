/*
Q1. Given a sorted array of integers, write a program to search for a specific element using binary search.

Your Task : you have to create class name as BinarySearch with following methods 
void setArray(int a[]): this function can accept integer array as parameter 
int binarySearch(int key): this function can accept the search as parameter and find search key in array and return its index and if search key not found in array return -1


Example: Suppose we have following array
Example1:  
Array :            a=[10,20,30,40,50,60,70,80,90,100];
Search key    key=80
Output: search key found on index  : 7 

Example2:  
Array :            a=[10,20,30,40,50,60,70,80,90,100];
Search key    key=100
Output: search key not found so index   : -1 

*/

import java.util.Scanner;
class BinarySearch
{
	private int[] a;
	public void setAarray(int[] a)
	{
		this.a=a;
	}

	public int searchKey(int key)
	{	
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			System.out.println("value of mid is "+a[mid]);
			if(a[mid]==key)
			{
				return mid;
			}

			if(a[mid]<key)
			{
				start=mid+1;
				
			}
			else
			{
				end=mid-1;	
			}
		}
		return -1;
	}
}

class BinarySearchApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int key=sc.nextInt();
		int[] a={10,20,30,40,50,60,70,80,90,100};
		BinarySearch Bs=new BinarySearch();
		Bs.setAarray(a);
		int num = Bs.searchKey(key);
		System.out.println(num);
		if(num==-1)
			System.out.println("Given key is not present ");
		else
			System.out.println("Given key is present at index "+num);

		
		
	}
}

