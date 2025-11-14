import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Q5
{
	public static void main(String[] args)
	{
		//List<Intger>al=new ArrayList<intger>();
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

		//Collections.reverse(al);
		System.out.println(al);

		int start=0;
		int end=al.size()-1;
		while(start<end)
		{
			int temp=al.get(start);
			al.set(start,al.get(end));
			al.set(end,temp);
			start++;
			end--;
		}
		System.out.println(al);
	}
}