/*
1. Sort a List Using Lambda (No Stream)
Question: How can you sort a list of strings using a lambda expression without using the Stream API in Java 8?
Example: Sort a list like ["Raj", "Amit", "Karan"] in alphabetical order using Collections.sort() and a lambda.

*/
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class SortStringApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList();
		
		for(int i=0;i<5;i++)
		{
			arr.add(sc.nextLine());
		}

		Collections.sort(arr ,(s1,s2)->s1.compareTo(s2));
		System.out.println(arr);
	}
}