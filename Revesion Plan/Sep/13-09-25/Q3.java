import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Q3
{
	public static void main(String[] args)
	{
		String[] arr= {"eat","tea","tan","ate","nat","bat"};
		
		Map<String, List<String>>hm=new HashMap<String,List<String>>();

		for(String str:arr)
		{
			char ch[]=str.toCharArray();
			Arrays.sort(ch);
				
			String sort=new String(ch);
		
			if(!hm.containsKey(sort))
			{
				hm.put(sort,new ArrayList<>());
			}
			hm.get(sort).add(str);
		}

		System.out.println(hm);
	}
}
