import java.util.Map;
import java.util.HashMap;
class Q6
{
	public static void main(String[] args)
	{
		int[] arr={4,5,6,4,5,7,4};
		
		Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			Integer val=mp.get(i);
			if(val==null)
			{
				val=0;
			}
				val++;
			mp.put(i,val);
		}
		
		System.out.println(mp);

		//int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;i++)
			{
				
			}
		}
	}
}