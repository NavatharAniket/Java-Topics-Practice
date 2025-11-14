import java.util.Scanner;
import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;

class AddArrayAndSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={10,2,5,7,45,53,2,5,8,6,5,4,2,4,67,89,9,875,4,32,2,1,4,6,7,898,64,346,67,875,5345,5789,78,755,7854,656};

		
		Set<Integer>hm=new TreeSet<Integer>();
		for(int i:arr)
		{
			hm.add(i);
		}
		System.out.println("Printed hashset is");
		System.out.println(hm);

		System.out.println("give element to chack that is present or not");
		int n=sc.nextInt();
	
		boolean b=hm.contains(n);
		if(b)
			System.out.println("Present");
		else
			System.out.println("Not present");
		
		System.out.println("Enter remove Element");
		int r=sc.nextInt();
		b=hm.contains(r);
		if(b)
		{
			hm.remove(r);
			System.out.println(hm);
		}
		else
		{
			System.out.println("Not present");
		}

		System.out.println("ArrayList");
		ArrayList<Integer> Al=new ArrayList(hm);
		System.out.println(Al);
		

		System.out.println("ArrayList Size is "+Al.size());
	}
}