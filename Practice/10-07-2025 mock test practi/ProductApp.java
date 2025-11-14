import java.util.Scanner;
class Product
{
	private int productId;
	private String productName;
	private double price;
	private int quantity;

	public Product(int productId,String productName,double price,int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;	
		this.quantity=quantity;
	}
	
	public void setID(int productId)
	{
		this.productId=productId;
	}
	public int getId()
	{
		return productId;
	}

	public void setName(String productName)
	{
		this.productName=productName;
	}
	public String getName()
	{
		return productName;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}

	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}

}

class ProductApp
{
	Product[] arr;
	ProductApp(Product[] arr)
	{
		this.arr=arr;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		Product[] arr=new Product[size];
	
		System.out.println("Enter Product details");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Product id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product Name");
			String name=sc.nextLine();		
			System.out.println("Enter Product Price");
			double price=sc.nextDouble();
			System.out.println("Enter Product Quantity");
			int quantity=sc.nextInt();

			
			arr[i]=new Product(id,name,price,quantity);
		}
		ProductApp p=new ProductApp(arr);
		
		

		do
		{
			System.out.println("1 calculate total bill 1");
			System.out.println("2 Find product with Highest Quntity");
			System.out.println("3 Apply discount to all products");
			System.out.println("4 for exit from program ");

			System.out.println("Enter Your choice");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1:System.out.println("Total bill is "+p.totalBill());
					break;
				case 2:
					p.highQuantity();
					break;
				case 3:
					System.out.println("20% discount of all price");
					double d=p.totalBill();
				 	double t=d;
					d=(d*20)/100;
					System.out.println("your bill is "+(t-d));
					
					
					break;
				case 4:
					System.exit(0);
					break;
				default:
				System.out.println("Enter Valid choice");
			}
			
		}while(true);
	}

	public double totalBill()
	{
		double total=0;
		for(int i=0;i<arr.length;i++)
		{
			total += arr[i].getPrice();
		}
		return total;
	}

	public void highQuantity()
	{
		int max=Integer.MIN_VALUE;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			int m=arr[i].getQuantity();
			if(max<m)
			{
				max=m;
				j=i;
			}
		}

		System.out.println("Get Product Name "+arr[j].getName());
	}
}