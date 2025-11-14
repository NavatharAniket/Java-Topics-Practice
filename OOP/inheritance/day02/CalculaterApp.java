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
class CalculaterApp
{
	public static void main(String[] args)
	{
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
			switch(ch)
			{
				case 1: Addition a=new Addition();
					System.out.println("Enter First Value");
				 	num1=sc.nextInt();
					System.out.println("Enter second value");
					num2=sc.nextInt();
					a.setValues(num1,num2);
					System.out.println("Addition is "+a.getResult());
					break;
				case 2: Multiplication m=new Multiplication();
					System.out.println("Enter First Value");
					 num1=sc.nextInt();
					System.out.println("Enter second value");
					 num2=sc.nextInt();
					m.setValues(num1,num2);
					System.out.println("Addition is "+m.getResult());
					break;

				case 3: Subtraction s=new Subtraction();
					System.out.println("Enter First Value");
					 num1=sc.nextInt();
					System.out.println("Enter second value");
					 num2=sc.nextInt();
					s.setValues(num1,num2);
					System.out.println("Addition is "+s.getResult());
					break;

				case 4: Division d=new Division();
					System.out.println("Enter First Value");
					 num1=sc.nextInt();
					System.out.println("Enter second value");
					 num2=sc.nextInt();
					d.setValues(num1,num2);
					System.out.println("Addition is "+d.getResult());
					break;
				case 5:
					System.exit;
				default:
					System.out.println("Enter Valid Choice");
			}
		}while(true);
	}
}