/* WAP to create two matrices of 3 x 3 and perform transpose operation on it */

import java.util.Scanner;
class large
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5]; 
		System.out.println("Enter Elements in array");
		for(int i=0;i<arr.length;i++)
		{
			
				arr[i]=sc.nextInt();
			
		}

		int l=0;
		int l2=0;
		System.out.println("h");
		for(int i=0;i<arr.length;i++)
		{
		
			
				if(arr[i]>l)
				{	
					l2=l;
					l=arr[i];
				}
			System.out.println("k");
		
		}
		System.out.println(l2);
	}
}





