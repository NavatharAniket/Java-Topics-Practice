public class Q1
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3, 2, 1};
		int start=0;
		int end=arr.length-1;
		boolean flag=true;
		while(start<end)
		{
			if(arr[start]!=arr[end])
			{
				System.out.println("not palindrom");
				flag=false;
				break;
			}
			start++;
			end--;
		}

		if(flag)
			System.out.println("Palindrom");
	}
}