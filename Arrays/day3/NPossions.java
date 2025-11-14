/*
14) Write a program in C to rotate an array by N positions ? 
Expected Output : 
The given array is : 0 3 6 9 12 14 18 20 22 25 27 
From 4th position the values of the array are : 12 14 18 20 22 25 27 
Before 4th position the values of the array are : 0 3 6 9 
After rotating from 4th position the array is: 
12 14 18 20 22 25 27 0 3 6 9 
*/

import java.util.Scanner;
class NPossions
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter index for rotation ");
		int key=sc.nextInt();
		int[] arr2=new int[key];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<key)
			{
				arr2[i]=arr[i];
			}
			if(i+key == 10)
				break;	
			arr[i]= arr[i+key];
			
		}
		for(int i=0,k=0;i<arr.length;i++)
		{
			
			if(i>arr.length-key-1)
			{
				arr[i]=arr2[k];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}	
	}
}