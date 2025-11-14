class Q23
{
	public static void main(String[] args)
	{
		String str="aniket navathar";
		
		char ch='a';

		for(int i=0;i<str.length();i++)
		{
       			 

      			if (str.charAt(i)==ch) 
			{
				
        	       		str = str.substring(0, i) + str.substring(i + 1);
    			}

       			
		}
		System.out.println("After removing first occurrence of '" + ch + "': " + str);

	}
}