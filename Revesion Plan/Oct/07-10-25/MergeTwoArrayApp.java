/*
Q5. Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array

*/


class MergeTwoArray
{
	int[] a;
	int[] b;
	MergeTwoArray(int []a,int[] b)
	{
		this.a=a;
		this.b=b;
	}

	int[] getMergeArray()
	{
		int[] arr=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];	
		}

		int l=a.length;
		for(int i=0;i<b.length;i++)
		{
			arr[l]=b[i];
			l++;
		}
		return arr;
	}
}
class MergeTwoArrayApp
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int[] b={6,7,8,9};
		
		MergeTwoArray m=new MergeTwoArray(a,b);
		
		int[] arr=m.getMergeArray();
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
