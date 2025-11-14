import java.util.LinkedHashMap;
import java.util.Map;

class Q1
{
	public static void main(String[] args)
	{
		String s = "swiss";
		Map<Character,Integer>ls=new LinkedHashMap<Character,Integer>();
		
		for(char ch:s.toCharArray())
		{
			Integer val=ls.get(ch);
			if(val==null)
				val=0;
			val++;
			ls.put(ch,val);
		}
		System.out.println(ls);
			

		for(Map.Entry<Character,Integer>entry:ls.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First Character is "+entry.getKey());
				break;
			}
		}
	}
}