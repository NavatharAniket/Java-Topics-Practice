import java.util.Scanner;
abstract class Product
{
	abstract void AppyDiscount(float price);
}

class Electronics extends Product
{
	float price;
	void AppyDiscount(float price)
	{
		float x=price;
		price=(float)(price*0.10);
		price=x-price;
		this.price=price;	
	}

	void displayFinalPrice()
	{
		System.out.println("Discount on Electronics is "+this.price);
	}
}

class Clothing extends Product
{
	float price;
	void AppyDiscount(float price)
	{
		float x=price;
		price=(float)(price*0.20);
		price=x-price;
		this.price=price;	
	}
	
	void displayFinalPrice()
	{
		System.out.println("Discount on Clothing is "+this.price);
	}
}

class ProductApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1 for clothing");
			System.out.println("2 for Electronics ");
			System.out.println("3 for exit ");
			System.out.println("Enter Your choice");
			int ch=sc.nextInt();515:48 29-04-2025
987
			int price=0;
			switch(ch)
			{
				case 1: Electronics e=new Electronics();
					System.out.println("Enter Price for Electronics ");
					price =sc.nextInt();
					e.AppyDiscount(price);
					e.displayFinalPrice();
					break;
				case 2:
					Clothing c=new Clothing();
					System.out.println("Enter Price for clothing ");
					price =sc.nextInt();
					c.AppyDiscount(price);
					c.displayFinalPrice();
					break;

				case 3:
					System.exit(0);
				default:
					System.out.println("Enter Valid Choice");
				
					
			}
		}while(true);
	}
}