/*
Product of Array Except Self - Given an array, calculate the product of all elements except the current element.
*/



import java.util.Scanner;
class Product
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int[] product=new int[5];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
	
			
		for(int i=0;i<arr.length;i++)
		{
			int p=1;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && j==i)
					continue;

				p=p * arr[j];
			}
			product[i]=p;
		}

			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+product[j]);
			}
	}
}