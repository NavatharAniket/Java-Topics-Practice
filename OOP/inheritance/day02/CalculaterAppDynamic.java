import java.util.Scanner;
class Operations
{
	int a;
	int b;
	public void setValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public int getResult()
	{
		return a;
	}
}

class Addition extends Operations
{
	public int getResult()
	{
		return a+b;
	}
}

class Multiplication extends Operations
{
	public int getResult()
	{
		return a*b;
	}
}

class Subtraction extends Operations
{
	public int getResult()
	{
		return a-b;
	}
}

class Division extends Operations
{
	public int getResult()
	{
		return a/b;
	}
}

class helper
{
	//Operations op;
	void setValue(Operations op)
	{
		System.out.println("Result is "+op.getResult());
	}
}
class CalculaterAppDynamic
{
	public static void main(String[] args)
	{
		helper h=new helper();
		Operations o=null;
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
				case 1: o=new Addition();
					break;
				case 2: o=new Multiplication();
					break;

				case 3: o=new Subtraction();
					break;

				case 4: o=new Division();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter Valid Choice");
			}
			o.setValues(num1,num2);
			h.setValue(o);
		}while(true);
	}
}