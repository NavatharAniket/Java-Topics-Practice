class Value
{
	int x,y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	int getresult()
	{
		return 0;
	}
}

class Mul extends Value
{
	int getResult()
	{
		return x*y;
	}
}

class Add extends Value
{
	int getResult()
	{
		return x+y;
	}
}

class Sub extends Value
{
	int getResult()
	{
		return x-y;
	}
}

class Div extends Value
{
	int getResult()
	{
		return x/y;
	}
}

class Calculator
{
	void performOperation(Add ad)
	{
		int result=ad.getresult();
		System.out.println("Result is "+result);
	}
}