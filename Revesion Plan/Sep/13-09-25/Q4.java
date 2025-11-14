import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
		String arr = "swiss";

		Map<Character, Integer>hm=new HashMap<Character,Integer>();
		for(char str:arr.toCharArray())
		{
			Integer val=hm.get(str);
			if(val==null)
			{
				val=0;
			}
			val++;
			hm.put(str,val);
		}

		System.out.println(hm);
	}
}