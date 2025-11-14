class Q18
{
	public static void main(String[] args)
	{
		int[] rotate={10, 20, 30, 40, 50};
		int r=2;

		for(int i=0;i<2;i++)
		{
			int temp=rotate[0];
			int j=0;
			for(;j<rotate.length-1;j++)
			{
				rotate[j]=rotate[j+1];
			}
			rotate[j]=temp;
		}

		for(int i=0;i<rotate.length;i++)
			System.out.print(rotate[i]+" ");
	}
}