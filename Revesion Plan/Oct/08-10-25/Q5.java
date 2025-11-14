/*
Q5. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override 
arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override 
arrangeSeq() method from ArrParent and reverse array and display it.

*/

import java.util.Scanner;
class ArrParent
{
	int[] arr;
	void setValue(int[] arr)
	{
		this.arr=arr;
	}

	void arrangeSeq()
	{
		System.out.println("Your sequence is ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

class ArrangeAscendingOrder extends ArrParent
{
	//find array ascending order
	void arrangeSeq()
	{
		System.out.println("Ascending order ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class ReverseArray extends ArrParent
{
	//reverse array
	void arrangeSeq()
	{
		System.out.println("Reverse An Array ");
		for(int i=arr.length-1;i>-1;i--)
		{
			System.out.print(arr[i] +" ");
		}
		
	}
}
class Q5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		ArrParent a=new ArrangeAscendingOrder();
		a.setValue(arr);
		a.arrangeSeq();

		a=new ReverseArray();
		a.setValue(arr);
		a.arrangeSeq();
	}
}