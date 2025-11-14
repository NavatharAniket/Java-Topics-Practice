class Q6
{
	public static void main(String[] args)
	{
		int[] arr={2, 5, 6};
		int k=10;
//Brute Force
/*		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum <k)
				{
					System.out.print(" "+arr[j]);
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.println();
		}
		System.out.println(" Count is "+count);
*/

		int start=0;
		int end=0;
		int count=0;
		int sum=0;
		while(end<arr.length)
		{
			sum +=arr[end];
			while(sum>k && start<=end)
			{
				sum-=arr[start];
				start++;
			}
			count +=(end-start+1);
			end++;
		}
		System.out.println("Coount is "+count);
	}
}