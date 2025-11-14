import java.util.List;
import java.util.ArrayList;

class Q7
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(60);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(10);
		al.add(50);
		al.add(50);
		int k=3;

/*		List<Integer>sl=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			int index=0;
			sl.add(al.get(0));
			al.remove(0);	
		}

		for(Integer i:sl)
		{
			al.add(i);
		}
		System.out.println(al);
*/
		List<Integer>sl=new ArrayList<Integer>(al.subList(0,k));
		al.subList(0,k).clear();
		al.addAll(sl);
		System.out.println(al);

		
	}
}