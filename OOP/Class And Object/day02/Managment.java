/*
Q2. Suppose consider we are working on School Management Project and we have following classes 

Class Student  with field id ,name ,per 
Class Bus with field busid, busno,source,destination , student [] 
Bus is POjo class with methods 
void setStudent(Student …s): this method accept infinite student number 
Student [] getStudents(): this method returns an array of student classes.
Class  School with field name,address, Bus [] 
This is also POJO class with methods 
   void setBuses(Bus …b) : this method can accept infinite number of buses 
   void showBusWiseStudList(): this method can buswise student data.
Main method class or client application or driver class name as 
	SchoolingAppManagment 

*/


class Student
{
	private int id;
	private String name;
	private float per;
	
	public void setId(int i)
	{
		id=i;
	}
	
	public int getId()
	{
		return id;
	}

	public void setName(String s)
	{	
		name=s;
	}

	public String getName()
	{
		return name;
	}

	public void setPer(float f)
	{
		per=f;
	}

	public float getPer()
	{
		return per;
	}
}

class Bus
{



	private int busid;
	private String  busno;
	private String source;
	private String destination ;
	private Student student[];

	public void setBusId(int i)
	{
		busid=i;
	}

	public int getBusId()
	{
		return busid;
	}

	public void setBusNo(String n)
	{
		busno=n;
	}
	public String getBusNo()
	{
		return busno;
	}

	
	public void setSource(String s)
	{
		source=s;
	}
	public String getSource()
	{
		return source;
	}

	public void setDestination(String d)
	{
		destination=d;
	}
	public String getDestination()
	{
		return destination;
	}

	public void setStudent(Student ...arr)
	{
		student=arr;
	}
	public Student[] getStudent()
	{
		return student;
	}
}

class School
{
	private String name;
	private String address;
	private Bus bus[];

	void setBuses(Bus ...b)
	{
		bus=b;
	}

	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String sh)
	{
		address=sh;
	}
	public String getAdress()
	{
		return address;
	}
	
	/*------------------------------------------*/
	
	public void PrintValues()
	{
		System.out.println(" ------------------------------------------------------------------------------------ ");
		System.out.println("School Name:"+getName()+"\t\t"+"getAdress:"+getAdress());
		System.out.println(" ------------------------------------------------------------------------------------ ");
		System.out.println("BusId"+"\t\t"+"BusName"+"\t\t"+"Source"+"\t\t"+"Destination");
		for(int i=0;i<bus.length;i++)
		{
			System.out.println(" ------------------------------------------------------------------------------------ ");
			System.out.println(bus[i].getBusId()+"\t\t"+bus[i].getBusNo()+"\t\t"+bus[i].getSource()+"\t\t"+bus[i].getDestination());
			System.out.println(" ------------------------------------------------------------------------------------ ");
			Student[] stud=bus[i].getStudent();

			System.out.println("id\t\tname\t\tper");
			for(int j=0;j<stud.length;j++)
			{
			
				System.out.println(stud[j].getId()+"\t\t"+stud[j].getName()+"\t\t"+stud[j].getPer()+"%");
			}

		}
	}
	
}
class SchoolingAppManagment 
{
	public static void main(String[] args)
	{

	Student s=new Student();
		s.setId(10);
		s.setName("Aniket");
		s.setPer(10);

	Student s1=new Student();
		s1.setId(20);
		s1.setName("Aniket");
		s1.setPer(60);

	Student s2=new Student();
		s2.setId(30);
		s2.setName("Patil");
		s2.setPer(70);
	
	Student s3=new Student();
		s3.setId(40);
		s3.setName("AAA");
		s3.setPer(90);

	Student s4=new Student();
		s4.setId(50);
		s4.setName("BBB");
		s4.setPer(40);

	Bus b=new Bus();
		b.setBusId(1);
		b.setBusNo("xyz");
		b.setSource("AhilyaNagar");
		b.setDestination("Pune");
		b.setStudent(s,s1,s2);


	Bus b1=new Bus();
		b1.setBusId(2);
		b1.setBusNo("pqr");
		b1.setSource("Pune");
		b1.setDestination("AhilyaNagar");
		b1.setStudent(s3,s4);

		
		
	School school=new School();
		school.setName("XYZ School");
       		school.setAddress("Pune, Maharashtra");
        	school.setBuses(b,b1);
		school.PrintValues();
	}
}