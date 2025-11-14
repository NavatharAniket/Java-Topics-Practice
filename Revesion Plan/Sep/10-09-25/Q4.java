import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 1, 3, 4, 2, 3};
		int k=4;
		Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
		List<Integer>l=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			Integer val=hm.get(arr[i]);
			if(val==null)
			{
				val=0;
			}
			val++;
			hm.put(arr[i],val);
		}
		
		l.add(hm.size());

		for(int i=k;i<arr.length;i++)
		{
			int outElement=arr[i-k];
			
			Integer val=hm.get(outElement);
			val--;
			hm.put(outElement,val);
			if(hm.get(outElement)==0)
			{
				hm.remove(outElement);
			}

			int inElement=arr[i];
			val=hm.get(inElement);
			if(val==null)
			{
				val=0;
			}
			val++;
			hm.put(inElement,val);
			l.add(hm.size());
		}
		System.out.println(l);
	}
}