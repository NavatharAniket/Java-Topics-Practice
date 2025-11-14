class NumberTriangle
{
	public static void main(String[] args)
	{
		int a = 1;
		for(int i=1; i< 5; i++)
		{
			for(int j =1; j < 8 ; j++)
			{
				if(j<5-i || j > 3+i) //external spaces
				{
					System.out.print(" "); 
				}
				else
				{	if((i%2==0 && j%2==1)|| (i%2==1 && j%2==0))
					{
						System.out.print(a);
						a++;
					}
					else
						System.out.print(" ");
				}
			}
		
		System.out.println();
		}
	}
}