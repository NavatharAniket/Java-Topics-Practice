import java.util.Scanner;
abstract class Operations
{
	int a;
	int b;
	public void setValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	abstract void performCalculation();
	
}

class Add extends Operations
{
	public void performCalculation()
	{
		System.out.println("Add is "+ (a+b));
	}
}

class Mul extends Operations
{
	public void performCalculation()
	{
		System.out.println("Mul is "+ (a*b));
	}
}

class Sub extends Operations
{
	public void performCalculation()
	{
		System.out.println("Sub is "+ (a-b));
	}
}

class Div extends Operations
{
	public void performCalculation()
	{
		System.out.println("Div is"+ (a/b));
	}
}

class Calculator
{
	public static void main(String[] args)
	{	Operations o=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1 for add");
			System.out.println("2 for Mul");
			System.out.println("3 for sub");
			System.out.println("4 for Div");
			System.out.println("5 for exit code");
			System.out.println("Enter Choice");
			int ch=sc.nextInt();
		
			int num1,num2;

			System.out.println("Enter First Value");
			num1=sc.nextInt();
			System.out.println("Enter second value");
			num2=sc.nextInt();
			switch(ch)
			{
				case 1: o=new Add();
					break;
				case 2: o=new Mul();
					break;

				case 3: o=new Sub();
					break;

				case 4: o=new Div();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter Valid Choice");
			}
			o.setValues(num1,num2);
			o.performCalculation();
		}while(true);
	}
}