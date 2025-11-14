/*
Q4. Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle

*/

import java.util.Scanner;
class Area
{
	int radious;
	int len;
	int width;

	static double a;
	Area(int radious)
	{
		this.radious=radious;
		a=3.14*radious*radious;
	}

	Area(int len,int width)
	{
		this.len=len;
		this.width=width;
		a=len*width;
	}
}
class AreaApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radious");
		new Area(sc.nextInt());
		System.out.println(Area.a);
		System.out.println("Enter Length and width");
		new Area(sc.nextInt(),sc.nextInt());
		System.out.println(Area.a);

		
		
	}
}