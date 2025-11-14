class Pattern2
{
	public static void main(String[] args)
	{
		for(int i = 1; i<6; i++)
		{
			for(int j = 1; j <11; j++)
			{
				if(j<=i || j>=11-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}