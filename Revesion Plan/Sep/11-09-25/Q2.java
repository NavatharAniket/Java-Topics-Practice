class Q2
{
	public static void main(String[] args)
	{
		String str="madam";
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				System.out.println("not Palindrom");
				break;
			}
			start++;
			end--;
		}

	}
}