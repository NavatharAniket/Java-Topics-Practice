class Q22
{
	public static void main(String[] args)
	{
		String str="aniket navathar";
		
		char ch='a';

       		 int index = str.lastIndexOf(ch); 

      		if (index != -1) 
		{
        	       str = str.substring(0, index) + str.substring(index + 1);
    		}

       			System.out.println("After removing first occurrence of '" + ch + "': " + str);


	}
}