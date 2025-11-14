import java.util.Map;
import java.util.HashMap;
class Q15
{
	public static void main(String[] args)
	{
		int[] arr={1,2,2,3,4,4,4,5};

/*		
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
		int sum=0;
		for(Map.Entry<Integer,Integer>entry:mp.entrySet())
		{
			if(entry.getValue()>1)	
			{
				sum =sum+entry.getValue()-1;
			}
		}
		System.out.println(sum);

*/
		int k=0,d=0;
		int dublicate[]=new int[6];
		for(int i:arr)
		{

			boolean flag=true;
			
			for(int j=0;j<k;j++)
			{
				if(i==dublicate[j])
				{
					d++;
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				dublicate[k]=i;
				k++;
			}
			
		}
		System.out.println(d);
		for(int i=0;i<dublicate.length;i++)
		{
			System.out.print(dublicate[i]+" ");
		}
		
	}
}