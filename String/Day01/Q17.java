class Q17
{
	public static int Occurance(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		String name="Aniket Navathar";
		System.out.println(Occurance(name,'a'));
	}
}