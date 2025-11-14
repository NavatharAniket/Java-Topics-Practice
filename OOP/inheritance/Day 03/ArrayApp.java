import java.util.Scanner;

class Array
{
	int arr[];
	void createArray()
	{
		int[] arr=new int[10];
		this.arr=arr;
	}

}

class Stack extends Arrays 
{
	int top=-1;
	boolean emptyStatus=false;
	void push(int data)
	{
		if(top==arr.length-1)
		{
			System.out.println("stack is OverFlows");
		}
		else
		{
			top++;
			arr[top]=data;
			System.out.println("Data Added "+data );
		}
	}

	int pop()
	{
		int value=0;
		if(top==-1)
		{
			emptyStatus=true;
		}
		else
		{
			value=arr[top];
			top--;
			
		}	
		return value;

	}

	boolean isEmpty()
	{
		return emptyStatus;
	}

	void display()
	{
		if(top==-1)
		{
			emptyStatus=true;
			System.out.println("Stack is Underflows");
		}
		else
		{
			for(int i=top;i>=0;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}

clss Queue extends Arrays 
{
	int rear=0;
	int front=-1;
	int value=0;
	
	void push(int data)
	{
		if((rear==-1 && front ==0 ) || (front==rear+1))
		{
			System.out.println("Queue is Overflows");
		
		}
		else
		{
			rear=rear+1;
			arr[rear]=data;
		}
	}

	int del()
	{
		if(rear==front && rear=arr.length)
		{
			return -1;
		}
		else
		{
			value=arr[front];
			front++;		
			return value;
		}
		
	}

	void display()
	{
		if((front==0 && rear==-1)||(front==rear+1))
		{
			System.out.println("Queue is Empty ");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	
}

class ArrayApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1 for stack");
			System.out.println("2 for Queue");
			System.out.println("3 for exit");
			System.out.println("Enter your choice ");
			int ch=sc.nextInt();
			switch(ch)	
			{
				case 1:
				
			}

		}
	}
}