/*
Find Duplicate in Array - Given an array with repeated elements, find the element that appears more than once.
*/

class Q2
{
	//using brute Force method
	public static void DublicateBruteForce(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{	
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(arr[i]+" Value present is "+count);
			}
		}
	}


	//Binary Search
	public static void DublicateBinarySearch(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start-(start-end)/2;
			if(arr[mid]==arr[mid-1] || arr[mid]==arr[mid+1])
			{
				return arr[mid];
			}
			
			if()
			{
				
			}
			else
			{
			}
		}
		
	}

	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,4,6,4,5,8,9,3,5,4};
		//DublicateBruteForce(arr);
		DublicateBinarySearch(arr)
	}
}