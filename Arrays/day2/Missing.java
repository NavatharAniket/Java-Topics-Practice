/*
5). Write a program to enter the 5 values in ascending order and store in array and find out the 
missing element from array? 
a[0]      a[1]        a[2]            a[3]              a[4]  
1 	   5 		9 		13 		 17 
 
Missing elements : output should like as   
2 3 4 6 7 8 10 11 12 14 15 16
*/
import java.util.Scanner;
class missig
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Values in arrays");
		int[] arr=new int[5];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=arr[1]+1;
		for(int i=0;i<arr.length;i++)
		{
			for(;j<arr[i];j++)
			{
			 System.out.print(" "+j);	
			}
			j=arr[i]+1;
		}
	}
}