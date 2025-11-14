/*
Find the Missing Number - Given an array containing n distinct numbers in the range 1 to n+1, find the missing number.

*/

import java.util.Scanner;
class MissingNumber
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
			
		int n=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(n<arr[i])
			{
				n=arr[i];
			}
		}

		for(int i=1;i<=n;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length;j++)
			{
				if(i == arr[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(" "+i);
			}
		}
	}
}