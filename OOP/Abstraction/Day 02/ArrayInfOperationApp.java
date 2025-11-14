import java.util.Scanner;
abstract class ArrayOperation
{
	abstract void PerformOperation(int[] arr);
	
}

class Sort extends ArrayOperation
{
	void PerformOperation(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}

class Insertion extends ArrayOperation
{
	int no,index;
	void setValue(int no,int index)
	{
		this.no=no;
		this.index=index;
	}
	
	void PerformOperation(int[] arr)
	{
		if(index>=0 && index<arr.length)
		{
			arr[index]=no;
		}
		else
		{
			System.out.println("invalid index ");
		}
	}
}

class Deletion extends ArrayOperation
{
	int index;
	void setValue(int index)
	{
		this.index=index;
	}

	void PerformOperation(int[] arr)
	{
		if(index>=0 && index<arr.length)
		{
			arr[index]=-1;
		}
		else
		{
			System.out.println("invalid index ");
		}
	}

	
}

class Reverse extends ArrayOperation
{
	void PerformOperation(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}

}
class ArrayInfOperationApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		ArrayOperation Ao=null;
	do{
		System.out.println("1 for sort");
		System.out.println("2 for reverse");
		System.out.println("3 deletion");
		System.out.println("4 for Insertion");
		System.out.println("5 for exit code");
		
		System.out.println("6 for display array ");
		System.out.println("Enter Your choice");
		int ch=sc.nextInt();
			switch(ch)
			{
				case 1: Sort s=new Sort();
					s.PerformOperation(arr);
					break;
				case 2: Reverse r=new Reverse();
					r.PerformOperation(arr);
					break;

				case 3: Deletion d=new Deletion();
					d.setValue(3);
					d.PerformOperation(arr);
					break;

				case 4: Insertion i=new Insertion();
					i.setValue(4,3);
					i.PerformOperation(arr);
					break;
				case 5:
					System.exit(0);
				case 6:
					for(int k=0;k<arr.length;k++)	
					{
						System.out.println(" "+arr[k]);
					}
					break;
				default:
					System.out.println("Enter Valid Choice");
			}
			
	}while(true);

		
	}
}