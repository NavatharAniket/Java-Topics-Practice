class Q14
{
	public static int first(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		String name="Aniket Navathar";
		System.out.println(first(name,'a'));
	}
}