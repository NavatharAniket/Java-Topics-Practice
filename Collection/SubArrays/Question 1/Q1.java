import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.*;

class WindowOperation
{
	int[] arr;	
	int window;
	Deque<Integer> index=new ArrayDeque<>();
	Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();

	public WindowOperation(int[] arr,int window)
	{
		this.arr=arr;
		this.window=window;
	}

	public void slindWindow()
	{
		
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				index.addLast(i);
				
			}

			if(!index.isEmpty() && index.peekFirst()<i-k+1)
			{
				index.pollFirst();
			}

			if(i>=k-1)
			{
				if(!index.isEmpty())
				{
					System.out.print(arr[index.peerFirst()]+" ");
				}
				else
				{
					System.out.println("0"+" ");
				}
			}

			System.out.println();
		}	

	}
	
}
class Q1
{
	public static void main(String[] args)
	{

		
		System.out.println("Enter Elements in Arrays");
		int[] arr=new int[8];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter The size of Window");
		int window=sc.nextInt();


		WindowOperation w=new WindowOperation(arr,window);
		w.slindWindow();
	}
}