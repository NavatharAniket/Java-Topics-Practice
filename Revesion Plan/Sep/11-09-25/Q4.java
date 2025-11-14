import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
	String str = "hello";
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : str.toCharArray())
        {
		Integer val=freq.get(c);
		if(val==null)
		{
			val=0;
		}
		val++;
		freq.put(c,val);
	}
        System.out.println(freq);
		 
	}
}