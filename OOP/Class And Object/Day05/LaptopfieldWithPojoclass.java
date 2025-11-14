/*Q8. WAP to create POJO class name as Laptop with field id, name ,price and ram space,hard disk space etc and input the details of laptop and display it
*/

import java.util.*;
class Laptop
 {
   private int id;
   private String  name;
   private int price;
   private int ramspace;
   private int harddiskspace;
   public void setid(int i)
   {
	id=i;
   }
   public int getid()
   {
	return id;
   }
   public void setname(String s)
   {
     name=s;
   }
   public String getname()
   {
		return name;
   }
    public void setprice(int k)
	{
		price=k;
	}
	public int  getprice()
	{
		return price;
	}
	public void setramspace(int d)
	{
	  ramspace=d;
	}
	public int getramspace()
	{
	  return ramspace;
	}
	public void setharddiskspace(int e)
	{
	   harddiskspace=e;
	}
	public int getharddiskspace()
	{
		return harddiskspace;
	}
	
 }
 public class LaptopfieldWithPojoclass
 {
	public static void main(String args[])
	{
		Laptop l=new Laptop();
		l.setid(1);
		l.setname("cbb");
		l.setprice(1000);
		l.setramspace(200);
		l.setharddiskspace(500);
		int id=l.getid();
	String name=l.getname();
	int price=l.getprice();
	int ramspace=l.getramspace();
	int harddiskspace=l.getharddiskspace();
	
	
	System.out.println("Laptop id is"+l.getid());
	System.out.println("Laptop name is"+l.getname());
	System.out.println("Laptop price  is"+l.getprice());
	System.out.println("Laptop Ramspace is "+l.getramspace());
	System.out.println("Laptop harddiskspace is "+l.getharddiskspace());
	
	}
		
	
 
 }