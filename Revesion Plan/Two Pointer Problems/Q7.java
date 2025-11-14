import java.util.*;
class Q7
{
	public static void main(String[] args)
	{
		int[] arr={1, 5, 3, 4, 2};
		int start=0;
		//int end=arr.length-1;
			
		Arrays.sort(arr);
		int i=1;	
		while(i<arr.length)
		{
			if(arr[i]-arr[start]==6)
			{
				System.out.println(arr[i]+" "+arr[start]);
				i++;
				start++;
			}
			else if(arr[i]-arr[start]>6)
			{
				start++;
			}		
			else
			{
				i++;
			}
		}
	}
}