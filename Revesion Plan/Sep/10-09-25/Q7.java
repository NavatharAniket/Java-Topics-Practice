class Q7
{
	public static void main(String[] args)
	{
		int[] arr={1, 1, 0, 1, 1, 1};

//optimal
	/*	int count=0;
		int maxCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
			else
			{
				count=0;
			}
			 maxCount=Math.max(count,maxCount);
		}
		System.out.println("Maxium count is "+maxCount);
	*/

//using sliding window
		int start=0;
		int end=0;
		int count=0;
		while(end<arr.length)
		{
			 if(arr[end]==1)
			{
				end++;
				
			}
			else
			{
				count=end-start+1;
				end++;
				start=end;
				
			}
		}
		System.out.println(count);
	}
}