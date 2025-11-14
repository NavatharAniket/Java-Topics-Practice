/*
Q3.Binary search in a sorted array
      
Your Task
 _________________________________________________________
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index
of search element and returns -1 when the element is not found and show the element
at function calling point using index if index is not -1

*/
//Scanner sc=new Scanner(System.in);
import java.util.Scanner;
class Binary
{
	int[] x=new int[10];
	public void setArray(int[] arr)
	{
		x=arr;
	}
	
	int getIndex(int key)
	{
		int first=0;
		int last=x.length-1;
		while(first < last)
		{
			int mid=(first+last)/2;
			if(x[mid]==key)
				return mid;
			if(x[mid]<key)
				first=mid+1;
			if(x[mid]>key)	
				last=mid-1;

			
		}
		return -1;
		
	}
	
}
class BinarySearch
{
	public static void main(String[] args)
	{
		Binary bs=new Binary();
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter Elements in Arrays in Sorted Formate");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		bs.setArray(arr);
		System.out.println("Enter Number for Find in index ");
		int key=sc.nextInt();
		int num = bs.getIndex(key);
		if(key>=0)
			System.out.println("Element is present in "+num+" index ");
		else
			System.out.println("Element is not present in Arrays");
	}
}