import java.util.Scanner;
class Per
{
	int p;
	void calPer(int[] s)
	{
		int p=0;
		for(int i=0;i<s.length;i++)
		{
			p+=s[i];
		}

		p=(p*100)/600;
		System.out.println(p);
		this.p=p;
	}
}

class CSE extends Per
{
	String name;
	int id;
	String address;
	String year;
	CSE(String name,int id,String address,String year)
	{
		//super(s);
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}

	void showCsePer()
	{

		System.out.println("Percentange of student "+name+" id "+id+" address "+" year "+year+" "+p);
	}
}


class ETC extends Per
{
	String name;
	int id;
	String address;
	String year;

	ETC(String name,int id,String address,String year)
	{
		//super(s);
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}

	void showCsePer()
	{
		System.out.println("Percentange of student "+name+" id "+id+" address "+" year "+year+" "+p);
	}
}

class ResultApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter Values in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		CSE c=new CSE("Aniket",10,"Newasa","Last Year");
		c.calPer(arr);
		c.showCsePer();

		ETC e=new ETC("Aniket",10,"Newasa","Last Year");
		e.calPer(arr);
		e.showCsePer();
		
	}
}