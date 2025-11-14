/*

Write a program that takes an array of String numbers and converts them into Integer list.

*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class ArrayStringToInteger
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}

		List<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			al.add(Integer.parseInt(arr[i]));
		}
	}
}