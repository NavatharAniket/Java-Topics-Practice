
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class StoreDatabase
{
	pubblic static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList store=new LinkedList();
		do
		{
			System.out.println("1 for Add Company Product in store");
			System.out.println("2 for view all store details");
			System.out.println("3 for search product by its company name, store name and product id");
			System.out.println("4 for break the loop");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();

			Switch(ch)
			{
				case 1:
					Store s=new Store();
					System.out.println("Enter Store name");
					String nm=sc.nextLine();
					s.setName(nm);	
					
					ArrayList com=new ArrayList(); //create arraylist for company
					while(true)
					{
						Company c=new Company(); //company object
						System.out.println("Enter Company name");
						String name=sc.nextLine();
	
						System.out.println("Enter TanNum ");
						int num=sc.nextInt();

						
						
						ArrayList p=new ArrayList(); //create product object
						while(true)
						{
							product pr=new Product();
							System.out.println("Enter Product id");
							int id=sc.nextInt();
							pr.setId(id);
						
							System.out.println("Enter Product Name");
							String n=sc.nextLine();
							pr.setName(n);	
	
							System.out.println("Enter Price For product");
							float price=sc.nextFloat();
							pr.setPrice(price);
							
							p.add(pr);

							System.out.println("if you want to add one more Product enter 1 if want to stop enter 0");
							int flag=sc.nextInt();
							if(flag==0)
							{
								break;
							}
						}

						c.setProduct(p);  //set product array

						com.add(c); // call Company Method
						
						System.out.println("if you want to add one more company enter 1 if want to stop enter 0");
						int flag=sc.nextInt();
						if(flag==0)
						{
							break;
						}
					}
					
					s.setCompany(com);
					
					store.add(s);
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.exit(0);
				default:
				System.out.println("Enter Valid Chice...!");
			}
		}while(true);
	}
}