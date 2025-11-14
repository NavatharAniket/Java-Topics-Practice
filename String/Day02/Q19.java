class Q19
{
	public static void main(String[] args)
	{
		String str="anniikkeett"; 
		int[] arr=new int[26];
     		for(int i=0;i<str.length();i++)
		{
			int count=str.charAt(i)-'a';
			arr[count]++;
		}
	
		int temp=Integer.MAX_VALUE;
		int t=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<temp && arr[i]>0)
			{
				temp=arr[i];
				t=i;
			}
			
			//System.out.printf("\n"+(char)(i+'a')+" --> "+arr[i]);
		}

		System.out.printf((char)(t+'a')+" ----> "+temp);
	}
}