class Q18
{
	public static void main(String[] args)
	{
		String str="anniket"; 
		int[] arr=new int[26];
     		for(int i=0;i<str.length();i++)
		{
			int count=str.charAt(i)-'a';
			arr[count]++;
		}
	
		int temp=0;
		int t=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
				t=i;
			}
			
			//System.out.printf("\n"+(char)(i+'a')+" --> "+arr[i]);
		}

		System.out.printf((char)(t+'a')+" ----> "+temp);
	}
}