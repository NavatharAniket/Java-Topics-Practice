import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Stack
{
	int top=-1;
	List li;

	Stack(List li)
	{
		this.li=li;	
	}

	public void push(int data)
	{	
		top++;
		li.addLast(data);
		System.out.println("Data Added");
	}

	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Underflow");
		}	
		else
		{
			top--;
			li.removeLast();
		}
	}
	
	public void display()
	{
		System.out.println(li);
	}
}
class Q11
{
	public static void main(String[] args)
	{
		List<Integer>li=new LinkedList<Integer>();
		
		Stack s=new Stack(li);
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter 1 for add data");
			System.out.println("Enter 2 for remove data ");
			System.out.println("3 Used display");
			System.out.println("4 Used for Exit loop");
			System.out.println("Enter Your choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: 
					System.out.println("Enter Data for add in Stack");
					s.push(sc.nextInt());
					break;
				case 2:
					System.out.println("Data Deleted");
					s.pop();
					break;
				case 3:
					s.display();
					break;
			
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Enter valid choice");
			}
		}while(true);
	}
	
}