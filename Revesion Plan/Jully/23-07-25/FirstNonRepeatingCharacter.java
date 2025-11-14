 /*3. First Non-Repeating Character
Problem: Find the first character that doesn't repeat in a string.
Example:
Input: "swiss"
 Output: 'w'
 Explanation:
 's' appears 3 times, 'w' appears once, 'i' appears once — but 'w' comes before 'i'.
*/

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
class FirstNonRepeatingCharacter
{
	public static void main(String[] args)
	{
		String str="swiss";
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();

		for(Character ch:str.toCharArray())
		{
			Integer value=m.get(ch);
			if(value==null)
			{
				value=0;
			}
			value++;
			m.put(ch,value);
		}

			
		System.out.println(m);

		for(Map.Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}