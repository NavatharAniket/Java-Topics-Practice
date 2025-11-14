/*
print all subarrays in array
*/

import java.util.Scanner;
class SubArrays
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Arrays ");	
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			int start=i;
			for(int j=i;j<arr.length;j++)
			{
				int end=j;
				for(int k=start;k<=end;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}