/*
find Max Sub Array Sum
*/

import java.util.Scanner;
class MaxSubArraySum
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter Elements in arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxSum=0;
		for(int i=0;i<arr.length;i++)
		{
			int start=i;
			for(int j=i;j<arr.length;j++)
			{
				int end=j;
				int sum=0;
				for(int k=start;k<=end;k++)
				{
					sum +=arr[k];
				}
				System.out.print(sum+" ");
				if(maxSum<sum)
				{	
					maxSum = sum;
				}
			}
			System.out.println();
		}

		System.out.println("This is the maximum Sum for all SubArrays "+maxSum);
	
		
	}
}