import java.util.*;
import java.util.function.*;

class PredicateInterface
{
	public static void main(String[] args)
	{			
		System.out.println(((Predicate<Integer>)(Integer i)->i%2==0).test(10)?"Even":"Odd");
	}
}
