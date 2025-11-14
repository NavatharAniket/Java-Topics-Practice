import java.util.Vector;
import java.util.List;
import java.util.Iterator;
class VectorOperations
{
	public static void main(String[] args)
	{
		List<Integer>v=new Vector<Integer>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);

		Iterator e=v.iterator();
	
		while(e.hasNext())
		{
			System.out.print(" "+e.next());
			
		}
	}
}