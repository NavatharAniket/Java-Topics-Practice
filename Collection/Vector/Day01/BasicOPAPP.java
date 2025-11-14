import java.util.Scanner;
import java.util.Vector;
import java.util.*;
class BasicOPAPP
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		do
		{
			System.out.println("1:Add New Element in Vector");
			System.out.println("2:View All elements");
		 	System.out.println("3:Search element using index");
		 	System.out.println("4:Search element using contains");
		 	System.out.println("5:remove element using index");
		 	System.out.println("6:Travel collection in backward direction");
		 	System.out.println("Enter your choice");
			int ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
					System.out.println("Enter Data");
					int data=sc.nextInt();
					boolean b = v.add(data);
					if(b)
					{
						System.out.println("Data added Succesfully ");
					}
					else
					{
						System.out.println("Data not Added");
					}

					break;
				case 2:
					for(Object obj:v)
					{
						System.out.println(obj);
					}
					break;
				case 3:
					System.out.println("Enter Index");
					int index=sc.nextInt();
					if(index<v.size())
					{
						System.out.println("you data at that index is "+v.get(index));
					}
					else
					{
						System.out.println("index Not Present");
					}
					break;
				case 4:
					System.out.println("enter data");
					data=sc.nextInt();
					b=v.contains(data);
					if(b)
					{
						System.out.println("Data available in vector");
					}
					else
					{
						System.out.println("data Not Available ");
					}
					break;
				case 5:
					System.out.println("Enter value for Remove");
					int value=sc.nextInt();
					index=v.indexOf(value);
					if(index!=-1)
					{
						v.remove(index);
						System.out.println("Data Removed Succesfully ");
					}
					else
					{
						System.out.println("Data Not Found");
					}
					break;
				case 6:
					ListIterator li = v.listIterator(v.size());
					while(li.hasPrevious())
					{
						Object obj = li.previous();
						System.out.println(obj);
					}
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice ...!");
			}
		}while(true);
	}
}