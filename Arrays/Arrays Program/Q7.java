/*
7. Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.
Input: [1, 2, 2, 3, 4, 2, 5], element 2
Output: 3
*/

class Q7
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 2, 3, 4, 2, 5};
		int max=0;
		for(int i:arr)
		{
			if(max<i)
				max=i;
		}
		int[] freq=new int[max+1];

		for(int i:arr)
		{
			freq[i]++;
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
				System.out.print(i+" ");
		}
	}
}