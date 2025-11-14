/*
Move Zeroes to End - Given an array, move all zeroes to the end while maintaining the relative order of other elements.
*/

import java.util.Scanner;
class MoveZeroes
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=0;
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}