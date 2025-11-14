class Q16
{
	public static void main(String[] args)
	{
		int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
		int even[]=new int[5];
		int odd[]=new int[5];
		int m=0;
		int j=0;
		for(int i:arr)
		{
			if(i%2==0)
			{
				even[m]=i;
				m++;
			}
			else
			{
				odd[j]=i;
				j++;
			}
		}
			
		for(int k:even)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		for(int l:odd)
		{
			System.out.print(l+" ");
		}
		
	}
}