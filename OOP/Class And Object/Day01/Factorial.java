/*
Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it

*/

class Factorial
{
	int num;
	public void setValue(int x)
	{
		num=x;
	}
		
	public void getValue()
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		f.setValue(5);
		f.getValue();
	}
}