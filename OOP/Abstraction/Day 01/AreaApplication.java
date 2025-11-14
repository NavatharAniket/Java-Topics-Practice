import java.util.Scanner;
abstract class Area
{
	 abstract void showArea();
}

class Circle extends Area
{
	int radious;
	void setRadious(int radious)
	{
		this.radious=radious;
	}

	void showArea()
	{
		double a=(double)3.14*radious*radious;
		System.out.println("Area of circle is "+a);
	}
}

class Rectangle extends Area
{
	int l,b;
	void setLb(int l,int b)
	{
		this.l=l;
		this.b=b;
	}

	void showArea()
	{
		int a=l*b;
		System.out.println("Area of Rectangle is "+a);
	}
}

class AreaApplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Area a=null;
		do
		{
			System.out.println("1 for circle ");
			System.out.println("2 for Rectangle ");
			System.out.println("3 for exit ");
			System.out.println("enter choice ");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter Radious of Circle");
					int r=sc.nextInt();
					Circle c=new Circle();
					c.setRadious(r);
					c.showArea();
					break;
		
				case 2:
					System.out.println("Enter l and b of Rectangle");
					int l=sc.nextInt();
					int b=sc.nextInt();
					Rectangle rect=new Rectangle();
					rect.setLb(l,b);
					rect.showArea();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Enter Valid choice ");
			}

			
			
			
		}while(true);
	}
}