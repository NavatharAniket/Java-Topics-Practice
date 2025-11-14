/*
Q2. Write program to create class name Area with methods name as 
void setRadius(float   radius) 
 void setLengthWidth(int len,int wid) 
and two child classes name as Circle and Rectangle so you have to define 
float getCircleArea() method in Circle child class and calculate area of
circle and return it and You have to define 
getRectArea() method in Rectangle class and calculate area of rectangle and return it
*/

class Area
{
	float radious;
	int len;
	int wid;
	void setRadious(Float radious)
	{
		this.radious=radious;
	}

	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}

}


class Circle extends Area
{
	float getCircleArea()
	{
		return (float)3.14*radious;
	}
}

class Rectangle extends Area
{
	int getRectArea()
	{
		return len*wid;
	}
}
class Q2
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.setRadious((float)10);
		System.out.println("Area Of Circle "+c.getCircleArea());

		Rectangle r=new Rectangle();
		r.setLengthWidth(10,20);
		System.out.println("Area Of Rectangle "+r.getRectArea());
	}
}