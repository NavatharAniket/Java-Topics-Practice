class Q30
{
	public static void main(String[] args)
	{
		int[] arr={1,3,20,4,1,0};
		int start=0;
		int end=arr.length-1;
		System.out.println(start+" "+end);
		while(start<end)
		{
			int mid=start + (end-start)/2;
			System.out.println("mid is "+mid);
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
			{
				System.out.println(arr[mid]);
				break;
			}
			else if(arr[mid+1]>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
	}
}