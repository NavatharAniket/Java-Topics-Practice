import java.util.*;
class Q7
{
	public static void main(String[] args)
	{
		Map<Character,Integer>hm=new HashMap<Character,Integer>();
		String str="programming";
		for(int i=0;i<str.length();i++)
		{
			Integer value=hm.get(str.charAt(i));
			if(value==null)
			{
				value=0;
			}
			value++;
			hm.put(str.charAt(i),value);
		}
		System.out.println(hm);
	}
}