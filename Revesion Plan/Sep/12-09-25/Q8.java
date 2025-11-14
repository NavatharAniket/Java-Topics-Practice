import java.util.ArrayList;
import java.util.List;


class Q8
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(60);
		al.add(20);
		al.add(10);
		al.add(30);
		
		List<Integer>al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(10);
		al1.add(50);
		al1.add(50);

		al.addAll(al1);
		System.out.println(al);

		
	}
}