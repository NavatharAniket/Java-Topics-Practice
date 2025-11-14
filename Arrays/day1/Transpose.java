/* WAP to create two matrices of 3 x 3 and perform transpose operation on it */

import java.util.Scanner;
class Transpose
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[3][3]; 
		System.out.println("Enter Elements in array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j = 0,k=0;j<arr.length ;j++,k++)
			{
				int temp = arr[i][j];
				arr[i][j]=arr[k][i];
				arr[k][i]=temp;
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
		System.out.println();
		}
	}
}





