class Q1
{
	public static boolean primeNumber(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%2==0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(primeNumber(11));
	}
}