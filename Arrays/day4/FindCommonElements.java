/*
Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”], 
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task 
________________________________________________________
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and return it.

*/

import java.util.Scanner;
class FindCommonElementsOperations
{
	int[] com=new int[8];
	int x[],y[];
	public void setArray(int a[],int b[])
	{
		x=a;
		y=b;
	}
		
	void getCommonElements()
	{
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					com[k]=x[i];
					k++;
				}
			}	
		}
		 
	}

	void display()
	{
		System.out.println("Common Elements are ");
		for(int i=0;i<com.length;i++)
		{
			System.out.print(" "+com[i]);
		}
	}
}
class FindCommonElements 
{
	public static void main(String[] args)
	{

		FindCommonElementsOperations op=new FindCommonElementsOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in 1st arrays ");
		int[] arr = new int[8];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[8];
		System.out.println("Enter Elements in Second arrays ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		op.setArray(arr,arr2);		
		op.getCommonElements();
		op.display();
		System.exit(0);
		
	}
}