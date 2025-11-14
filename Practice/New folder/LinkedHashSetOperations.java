/*Q2. WAP to Create LinkedHashSet and perform following operation on it
Case 1: add new element 
Case 2: View all elements 
Case 3: Search element 
Case 4: remove element 
Case 5: count element
Case 6: arrange all elements in ascending order
*/
import java.util.*;
public class LinkedHashSetApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		do{
			System.out.println("1: add new element ");
			System.out.println("2: View all elements ");
			System.out.println("3: Search element");
			System.out.println("4: remove element ");
			System.out.println("5: count element");
			System.out.println("6: arrange all elements in ascending order");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter the number:");
				int n=sc.nextInt();
				lhs.add(n);
				break;
				case 2:
				for(Object obj:lhs)
				{
					System.out.println(obj);
				}
				break;
				case 3:
				System.out.println("Enter the search value:");
				int skey=sc.nextInt();
				boolean flag=false;
				for(int obj:lhs)
				{
					if(!flag && obj==skey)
					{
						flag=true;
						break;
					}
				}
				if(flag)
				{
					System.out.println("Element found");
				}
				else
				{
					System.out.println("Element Not found");
				}
				break;
				case 4:
				System.out.println("Enter the remove value:");
				int rkey=sc.nextInt();
				if (lhs.remove(rkey))
					System.out.println("Element removed successfully.");
				else
					System.out.println("Element not found.");
				break;
				case 5:
				System.out.println("the count of the element is ==>"+lhs.size());
				break;
				case 6:
				
				ArrayList<Integer> al=new ArrayList<Integer>(lhs);
				for(int i=0;i<al.size();i++)
				{
					int n1=al.get(i);
					for(int j=i+1;j<al.size();j++)
					{
						int n2=al.get(j);
						if(n1>n2)
						{
							al.set(i,n2);
							al.set(j,n1);
						}
					}
				}
				for(Object obj:al)
				{
					System.out.println(obj);
				}
				break;
				default:
				System.out.println("Invalid choice");
			}
		}while(true);
		
	}
}