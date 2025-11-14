/*
Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.

*/

class FindMax
{
	int[] arr;
	void setArray(int[] arr)
	{
		this.arr=arr;
	}

	int getMax()
	{		
		int max=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(max<i)
			{
				max=i;
			}
		}
		return max;
	}
}

class FindMaxApp
{
	public static void main(String[] args)	
	{
		int[] arr={10,20,70,30,20,40};
		FindMax f=new FindMax();
		f.setArray(arr);
		System.out.println("find max value "+f.getMax());
	}
}