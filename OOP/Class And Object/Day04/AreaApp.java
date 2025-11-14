/*
1). WAP to create the class name as Circle with a following methods  
class Circle 
{ 
void setRadius(float radius)//accept the radius  
{ 
} 
void showArea() 
{ //write here calculation logics of circle area and display it 
} 
} 
public class AreaApp 
{ 
public static void main(String x[]) 
{ 
//create here object of scanner and accept the radius as input  
//create the object of area and call setRadius and pass radius input as parameter 
//call showArea() for display the display the area 
} 
} 
*/


import java.util.Scanner;
class Circle
{
	private int radious;
	public void setRadious(int radious)
	{
		this.radious=radious;
	}

	public float getArea()
	{
		float area=(float)3.14*radious*radious;
		return area;
	}
}

class AreaApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Radious");
		int radious=sc.nextInt();

		Circle c=new Circle();
		c.setRadious(radious);
		System.out.println("Area of the circle "+c.getArea());
	}
}