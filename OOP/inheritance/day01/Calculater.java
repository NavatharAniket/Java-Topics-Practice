//write program for add,multi,sub,div
import java.util.Scanner;
class Values
{
	private int a;
	private int b;
	public void setValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public int getA()
	{
		return a;
	}
	public int getB()
	{	
		return b;
	}
}

class ADD extends Values
{
	public int getAdd()
	{
		int sum = getA()+getB();
		return sum;
	}
}

class SUB extends Values
{
	public int getSub()
	{
		int sub=getA()-getB();
		return sub;
	}
}
	
class MULTI extends Values
{
	public int getMulti()
	{
		int m=getA()*getB();
		return m;
	}
}

class DIV extends Values
{
	public int getDiv()
	{
		int div = getA()/getB();
		return div;
	}
}
	
class Calculater
{
	public static void main(String[] argh)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Value for a");
		int a=sc.nextInt();

		System.out.println("Enter Value for b");
		int b=sc.nextInt();

		do
		{
			System.out.println("1 for ADD");
			System.out.println("2 for SUB");
			System.out.println("3 for MULTI");
			System.out.println("4 for DIV");
			System.out.println("5 for exit from code");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					ADD add =new ADD();			
					add.setValues(a,b);
					System.out.println("Addition for "+a+" and "+b+" is "+ add.getAdd());
					break;
				case 2:
					SUB sub =new SUB();
					sub.setValues(a,b);
					System.out.println("Sub for "+a+" and "+b+" is "+ sub.getSub());
					break;
				case 3:
					MULTI multi = new MULTI();
					multi.setValues(a,b);
					System.out.println("Multi for "+a+" and "+b+" is "+ multi.getMulti());
					break;
				case 4:
					DIV div= new DIV();
					div.setValues(a,b);
					System.out.println("div for "+a+" and "+b+" is "+ div.getDiv());
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter Invalid Choice");
			}
		}while(true);
	}
}