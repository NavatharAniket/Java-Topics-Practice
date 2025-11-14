/*
Two Sum Problem - Given an array, find two numbers whose sum equals a target value
*/

import java.util.Scanner;
class TwoSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		System.out.println("Enter A target");
		int target=sc.nextInt();
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]);
				}
			}
		}
	}
}