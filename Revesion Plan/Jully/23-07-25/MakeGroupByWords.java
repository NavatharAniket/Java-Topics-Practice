/*
5. Group Words by Length
  Problem: Group words from a list by their lengths.
Example:  String[] words = {"apple", "bat", "car", "door", "egg", "fish", "go"};

Sample output 
Length 5: [apple, fish]
Length 3: [bat, car, egg]
Length 4: [door]
Length 2: [go]

*/
import java.util.Map;
import java.util.HashMap;
class MakeGroupByWords
{
	public static void main(String[] args)
	{

		String[] words = {"apple", "bat", "car", "door", "egg", "fish", "go"};
		Map<String,Integer>m=new HashMap<String,Integer>();
		int max=0;
		for(String s:words)
		{
			int value = s.length();
			m.put(s,value);
			if(max<s.length())
			{
				max=s.length();
			}
		}

		System.out.println(m);

		while(max>0)
		{
			System.out.print("Group by "+max+"  ");
			for(Map.Entry<String,Integer>entry:m.entrySet())
			{
				if(entry.getValue()==max)
				{
					System.out.print(entry.getKey()+" ");
				}
			}
			System.out.println();
			max--;
		}
	}
}