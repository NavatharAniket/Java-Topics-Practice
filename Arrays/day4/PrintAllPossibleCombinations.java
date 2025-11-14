/*
28)Write a program in C to print all possible combinations of r elements in a given array. 
Expected Output: 
The given array is: 
1 5 4 6 8 The combination from by the number of elements are: 4 
The combinations are: 
1 5 4 6 
1 5 4 8 
1 5 6 8 
1 4 6 8 
5 4 6 8 
*/

import java.util.Scanner;
class PrintAllPossibleCombinations
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
	
		
	}
}