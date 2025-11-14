class Q21
{
	public static String FirstRemove(String str,int index)
	{
		if(str.length()==index)
		{
			return 
		}
		String sb = FirstRemove(str,++index);
	}



	public static void main(String[] args)
	{
		String str="aniket navathar";
		FirstRemove(str,0);
	}



/*	public static void main(String[] args)
	{
		String str="aniket navathar";
		StringBuilder sb=new StringBuilder(str);
		
		char ch='a';

       		 int index = str.indexOf(ch); 

      		if (index != -1) 
		{
        	       str = str.substring(0, index) + str.substring(index + 1);
    		}

       			System.out.println("After removing first occurrence of '" + ch + "': " + str);


	}
*/
}