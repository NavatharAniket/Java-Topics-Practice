/*
Q4. Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create 
class name as ProfessionalInfo with parameterized constructor like as 
ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit
PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class 
to PersonalInfo using super() constructor and you have to define void show() method in 
ProfessionalInfo and you have to show the all data in show() method.

*/

class PersonalInfo
{
	String name;
	String middlename;
	String lastname;

	PersonalInfo(String name,String middlename,String lastname)
	{
		this.name=name;
		this.middlename=middlename;
		this.lastname=lastname;		
	}
}

class ProfessionalInfo extends PersonalInfo
{
	int id;
	String des;
	int salary;
	String skillset;
	ProfessionalInfo(int id,String des,int salary,String skillset)
	{
		super("Aniket","Abasaheb","Navathar");
		this.id=id;
		this.des=des;
		this.salary=salary;
		this.skillset=skillset;
	}
	void show()
	{
		System.out.println("name "+name+" middlename "+middlename+" lastname "+lastname);
		System.out.println("id "+id+" des "+des+" salary "+salary+" skillset "+skillset);
	}
}
class Q4
{
	public static void main(String[] args)
	{
		ProfessionalInfo p=new ProfessionalInfo(10,"yes",20000,"java");
		p.show();
	}
}