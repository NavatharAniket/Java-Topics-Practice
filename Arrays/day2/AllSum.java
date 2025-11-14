/*
WAP to enter the five elements in array and calculate the sum of all elements  
a[0]                            10 
a[1]                            20 
a[2]                           	30 
a[3]                            40
a[4] 				50 
Output :   Sum of all array elements  : 150
*/

import java.util.Scanner;
class AllSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			 arr[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
		  	sum = sum+ arr[i];
			
		}
		System.out.print(sum);
	}
}