import java.util.HashMap;
import java.util.Map;

class Q2
{
	public static void main(String[] args)
	{
		String s1 = "listen", s2 = "silent";
		Map<Character,Integer>hm=new HashMap<Character,Integer>();
		Map<Character,Integer>hm2=new HashMap<Character,Integer>();

		for(char ch:s1.toCharArray())
		{
			Integer val=hm.get(ch);
			if(val==null)
				val=0;
			val++;
			hm.put(ch,val);
		}

		for(char ch:s2.toCharArray())
		{
			Integer val=hm2.get(ch);
			if(val==null)
				val=0;
			val++;
			hm2.put(ch,val);
		}
		int i=0;
		boolean isAnyagram=true;
		for(Map.Entry<Character,Integer>entry:hm.entrySet())
		{
			if(!hm2.containsKey(entry.getKey()) || !hm2.get(entry.getKey()).equals(entry.getValue()))
			{
				isAnyagram=false;
				break;
			}
		}
		
		if(isAnyagram)
		{
			System.out.println("Anyagram");
		}
		else
		{
			System.out.println("Not Anyagram");	
		}	


		
	}
}