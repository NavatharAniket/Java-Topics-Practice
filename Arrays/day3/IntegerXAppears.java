/*
21) Write a program in C to find if a given integer x appears more than n/2 times in a sorted array 
of n integers ? 
Expected Output : 
The given array is : 1 3 3 5 4 3 2 3 3 
The given value is : 3 
3 appears more than 4 times in the given array[] 

*/

import java.util.Scanner;
class IntegerXAppears
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[9];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					temp++;
				}
			}
			if(temp>3)
			{
				System.out.println(arr[i]+" is appears more than "+temp+" times in the given arrays[]");
				break;
			}
		}
	}
}