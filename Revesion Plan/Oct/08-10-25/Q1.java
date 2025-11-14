/*
Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and
 we have to create three child classes name as Add with function int getAdd() , Mul with function 
getMul() and Div with function getDiv() and getAdd() function return addition of two value which 
is inherited from Value class , getMul() function return multiplication of two values which is 
inherited from Value class and gitDiv() function return division of two values which Is inherited 
from Value class.
*/


class Value
{
	int a;
	int b;

	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}

}

class Add extends Value
{
	
	int getAdd()
	{
		return a+b;
	}
}

class Mul extends Value
{
	int getMul()
	{
		return a*b;
	}
}

class Div extends Value
{
	int getDiv()
	{
		return a/b;
	}
}

class Q1
{
	public static void main(String[] args)
	{
		Add v=new Add();
		v.setValue(10,20);
		System.out.println("Addition is "+v.getAdd());
		Mul m=new Mul();
		m.setValue(1,2);
		System.out.println("Addition is "+m.getMul());
		Div d=new Div();
		d.setValue(10,20);
		System.out.println("Addition is "+d.getDiv());

	}
}