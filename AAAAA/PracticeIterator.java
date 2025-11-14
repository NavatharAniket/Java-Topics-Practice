import java.util.ArrayList;
import java.util.Iterator;
class PracticeIterator
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(Ssytem.in);
		ArrayList<Integer> Al=new ArrayList<Integer>();
		Al.add(10);
		Al.add(20);
		Al.add(30);
		Al.add(40);
		Al.add(50);
		System.out.println(Al);



		Iterator i=Al.iterator();
		System.out.println("Using Iterator Interface");
		while(i.hasNext())
		{
			object val=i.next();

			System.out.print(val+" ");
		}
	}


}