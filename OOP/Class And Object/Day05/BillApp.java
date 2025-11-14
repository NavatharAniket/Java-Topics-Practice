import java.util.*;
class Costomer{
	private int id;
	private String name;
	private long mobile;
	
	//Setter && Getter...
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setmobile(long mobile){
		this.mobile=mobile;
	}
	public long getmobile(){
		return mobile;
	}
	
}
class Product{
	private int id;
	private String name;
	private int qty;
	private int rate;
	
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setqty(int qty){
		this.qty=qty;
	}
	public int getqty(){
		return qty;
	}
	public void setrate(int rate){
		this.rate=rate;
	}
	public int getrate(){
		return rate;
	}
	public int gettotal(){
		return (rate*qty);
	}
}
class Bill{
	private Costomer c;
	private Product p[];
	
	void calBill(Costomer c,Product ...p){
		this.c=c;
		this.p=p;
	}
	void showBill(){
		
		System.out.println("Costomer Name : "+c.getname());
		System.out.println("Mobile : "+c.getmobile());
		System.out.println();
		int sum=0;
		System.out.println("Id\tName\tQuantity\tRate\tTotal");
		for(int i=0;i<p.length;i++){
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getqty()+"\t\t"+p[i].getrate()+"\t"+p[i].gettotal());
			sum=sum+p[i].gettotal();
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Complete : "+sum);
	}
	

}
public class BillApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 Costomer c= new Costomer();
		// System.out.println("Enter the Costomer id name mobile");
		// int id=sc.nextInt();
		// sc.nextLine();
		// String name=sc.nextLine();
		// long mobile=sc.nextLong();
		 
		 System.out.println();
		 System.out.println();
		 c.setid(1);
		 c.setname("Aniket");
		 c.setmobile(12345);
		 
		Product p1  = new Product();
		p1.setid(1);
		p1.setname("a");
		p1.setqty(10);
		p1.setrate(100);
		
		Product p2 = new Product();
		p2.setid(2);
		p2.setname("b");
		p2.setqty(20);
		p2.setrate(100);
		
		Bill b = new Bill();
		b.calBill(c,p1,p2);
		b.showBill();
	}

}