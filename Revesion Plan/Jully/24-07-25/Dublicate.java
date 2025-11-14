/*
Q1. Find Duplicates in an Array?
Problem: Identify elements that appear more than once.
Approach:Use a Map<Integer, Integer> to store frequencies.
Example : Input:  [1, 2, 3, 2, 4, 5, 1, 6]
Output: 1, 2
Description of above output
  1 appears twice
  2 appears twice
  Others appear only once

*/

import java.util.Map;
import java.util.HashMap;
class Dublicate
{
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 3, 2, 4, 5, 1, 6};
		Map<Integer,Integer>m=new HashMap<Integer,Integer>();

		for(int i:arr)
		{
			Integer value=m.get(i);
			if(value==null)
			{
				value=0;
			}
			value++;
			m.put(i,value);	
		}

		System.out.println(m);

		for(int i:m.keySet())
		{
			int v=m.get(i);
			if(v>1)
			{
				System.out.print(" "+i);
			}
		}
	}
}