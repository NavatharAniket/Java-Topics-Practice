class Q7
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}