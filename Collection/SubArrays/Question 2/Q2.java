import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class WindowMaxElement
{
	int[] arr;
	int window;
	Deque<Integer>d=new ArrayDeque<>();

	WindowMaxElement(int[] arr,int window)
	{
		this.arr=arr;
		this.window=window;
	}

	public Deque getMaxElementInWindow()
	{
		for(int i=0;i<arr.length;i++)
		{
			while(!d.isEmpty() && d.peekFirst()<=i-k)
			{
				d.removeFirst();
			}	

			while(!d.isEmpty() && )
			{
				
			}
				
		}			
	}
}

class Q2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[8];

		System.out.println("Enter Elements in Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Window Size");
		int window=sc.nextInt();

		WindowMaxElement w=new WindowMaxElement(arr,window);
		Deque<Integer>d=w.getMaxElementInWindow();
		System.out.println(d);
		
	}
}