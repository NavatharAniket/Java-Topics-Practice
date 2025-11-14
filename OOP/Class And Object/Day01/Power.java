/*
Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.

*/

class Power
{	
	int base,index;
	public  void setValue(int b,int i)
	{
		base=b;
		index=i;
	}
	public int getValue()
	{
		int p=1;
		for(int i=0;i<index;i++)
		{
			p=p*base;
		}
		return p;
	}
	public static void main(String[] args)
	{
		Power pw=new Power();
		int b=10;
		int i=4;
		pw.setValue(b,i);
		System.out.println(pw.getValue());
	}
}