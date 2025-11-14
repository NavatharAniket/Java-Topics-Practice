/*
4. Comparator with Lambda
 Question: How can you use a lambda expression with a comparator to sort integers in descending order?
 Example: Sort a list like [10, 3, 5, 7] in reverse order using Collections.sort() and a lambda.
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class SortNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList();
		
		for(int i=0;i<5;i++)
		{
			arr.add(sc.nextInt());
		}

		Collections.sort(arr ,(s1,s2)->s2.compareTo(s1));
		System.out.println(arr);
	}
}