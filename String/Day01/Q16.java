class Q16
{
	public static void last(String str,char ch)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==ch)
			{
				System.out.print(" "+i);
			}
		}
		 
	}
	public static void main(String[] args)
	{
		String name="Aniket Navathar";
		last(name,'a');
	}
}