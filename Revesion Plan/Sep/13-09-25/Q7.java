// Q7. Check if Array Contains Duplicates
import java.util.*;
class Q7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        Set<Integer> set = new HashSet<>();
        for(int i:arr)
	{
		if(set.contains(i))
		{
			System.out.println("Array Contains Dublicate");
			break;
		}
		else
		{
			set.add(i);
		}
	}
    }
}
