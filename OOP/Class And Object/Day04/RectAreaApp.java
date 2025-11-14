/*
2.Create the Class Name as Rectangle with a following methods and write its logics. 
class Rectangle 
{ void setLengthWidth(int len,int wid)//accept the radius  
{ 
} 
void showArea() 
{ //write here calculation logics of circle area and display it 
} 
} 
public class AreaApp 
{  public static void main(String x[]) 
{  //create here object of scanner and accept the length and width as input  
//create the object of Rectangle and call setLengthWidth and pass radius input as parameter 
//call showArea() for display the display the area 
} 
}
*/

import java.util.Scanner;
class Rectangle
{
	private int length;
	private int width;
	public void setLengthWidth(int length,int width)
	{
		this.length=length;
		this.width=width;
	}

	public int showArea()
	{
		int area = length*width;
		return area;
	}
}

public class RectAreaApp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a width");
		int width=sc.nextInt();
		System.out.println("enter a lenght");
		
		int length=sc.nextInt();

		Rectangle r=new Rectangle();
		r.setLengthWidth(length,width);
		System.out.println("Area of Reactangle "+r.showArea());
	}
}