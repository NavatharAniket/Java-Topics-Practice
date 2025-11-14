/*
4. Word Frequency in a Sentence
 Problem: Count how many times each word appears in a sentence.
Example
Input: "this is a test this is only a test"
Output:
this → 2  
is → 2  
a → 2  
test → 2  
only → 1

*/

import java.util.HashMap;
import java.util.Map;
class WordFrequency
{
	public static void main(String[] args)
	{
		String str="this is a test this is only a test";
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		String[] words=str.split(" ");

		for(String s:words)
		{
			Integer value=m.get(s);
			if(value==null)
			{
				value=0;
			}
			value++;
			m.put(s,value);
		}

		for(Map.Entry<String,Integer>entry:m.entrySet())
		{
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
		
	}

}