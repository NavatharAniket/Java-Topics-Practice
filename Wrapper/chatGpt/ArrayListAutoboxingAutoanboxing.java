/*
Demonstrate autoboxing and unboxing in ArrayList<Integer>.
*/

import java.util.List;
import java.util.ArrayList;

class ArrayListAutoboxingAutoanboxing
{
	public static void main(String[] args)
	{
		List<Integer>Al=new ArrayList<Integer>();
		Al.add(10);
		Al.add(20);
		Al.add(30);
	
		for(int i:Al)
		{
			System.out.println(i);
		}
	}
}