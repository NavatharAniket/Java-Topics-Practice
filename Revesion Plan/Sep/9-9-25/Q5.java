class Q5
{
	public static void main(String[] args)
	{
		int[] arr={0, 1, 2, 0, 1, 2};
		int start=-1;
		int end=arr.length;
		int mid=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				start++;
				arr[i]=arr[start];
				arr[start]=0;
				
				
			}
			else if(arr[i]==2){
				end--;
				arr[i]=arr[end];
				arr[end]=2;
				
			}
			else
			{
				mid=start+1;
				arr[i]=arr[mid];
				arr[mid]=1;	
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}