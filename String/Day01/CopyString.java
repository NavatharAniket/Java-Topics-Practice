class CopyString
{
	public static boolean check(String str1,String str2)	
	{
		return str1.equals(str2);
	}
	public static void main(String[] args)
	{
		String str="Aniket";
		String str1=new String("Aniket");
		boolean st=check(str,str1);

		System.out.println(st);
	}
}