/*
1. Reverse an Array
Description: Reverse the order of elements in an array.
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
*/

class Q1
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3, 4, 5};
		
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp; 
			start++;
			end--;
		}	

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}