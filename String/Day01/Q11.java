class Q11
{
	public static void reverse(String str)
	{	
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args)
	{
		String str="Aniket";
		reverse(str);
	}
}