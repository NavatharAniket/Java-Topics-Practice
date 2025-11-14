class Q5
{
	public static void main(String[] args)
	{		
		int[] arr={1, 2, 1, 3, 4, 2, 3};
/*		
		int sum=0;
		int size=0;
		int maxSize=0;
		int m=5;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				sum=0;
				size=1;
				for(int k=i;k<=j;k++)
				{
					//System.out.print(" "+arr[k]);
					sum+=arr[k];
					if(sum<m)
					{
						size++;
					}
					else
					{
						break;
					}
					
				}
				if(maxSize<size)
					maxSize=size;
				//System.out.println();
			}
			//System.out.println();
		}
			System.out.println("maxSize is "+maxSize);
*/

//optimal Solution

		int start=0;
		int k=5;
		int end=0;
		int sum=0;
		int size=0;
		int maxSize=0;
		while(end<arr.length)
		{
			if(sum<=k)
			{
				sum+=arr[end];
				size=end-start+1;
				
				maxSize=Math.max(maxSize,size);
				end++;
			}
			else
			{
				sum-=arr[start];
				start++;
			}
		}
		System.out.println("MaxSize is "+maxSize);
	}
}





