class Q9
{
	public static void main(String[] args)		
	{
		int[] arr={1,3,5};
		int[] arr1={2,4,6,8};
			
		int[] merge=new int[arr.length+arr1.length];
		for(int i=0;i<merge.length;i++)
		{
			if(i<3)
				merge[i]=arr[i];
			else
				merge[i]=arr1[i-3];	
		}
		
		for(int i=0;i<merge.length;i++)
			System.out.print(merge[i]+" ");
	}
}