/*

Show the difference between == and .equals() for wrapper objects.

*/

import java.util.*;
class Diff
{
	public static void main(String[] args)
	{
		int a=128;
		int b=128;
		Integer c=a;
		Integer d=b;

		System.out.println("a,b "+ (a==b) );
		System.out.println("c,d "+ (c==d) +" reference "+c.equals(d));
	}

}