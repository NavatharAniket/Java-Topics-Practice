class Q19
{
	public static void main(String[] args)
	{
		int[] rotate={10, 20, 30, 40, 50};
		int r=2;

		for(int i=0;i<2;i++)
		{
			int temp=rotate[rotate.length-1];
			int j=rotate.length-1;
			for(;j>0;j--)
			{
				rotate[j]=rotate[j-1];
			}
			rotate[j]=temp;
		}

		for(int i=0;i<rotate.length;i++)
			System.out.print(rotate[i]+" ");
	}
}