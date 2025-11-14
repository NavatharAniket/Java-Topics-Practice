class SolidDiamond
{
	public static void main(String[] args)
	{
		for(int i =1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((j<5+i && j> 5-i) )//|| (j>i-5 && j < 15-i)  )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}