import java.util.*;
class Person{
	private int id;
	private String name;
	private int age;
	private String address;
	
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
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public void setaddress(String address){
		this.address=address;
	}
	public String getaddrass(){
		return address;
	}

}
public class PersonApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person id name age address");
		int id = sc.nextInt();
		sc.nextLine();// This is to handle the newline left after nextInt()
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String address = sc.nextLine();
	
		
		Person p = new Person();
		p.setid(id);
		p.setname(name);
		p.setage(age);
		p.setaddress(address);
		
		System.out.println("Person Id : "+p.getid());
		System.out.println("Person name : "+p.getname());
		System.out.println("Person age : "+p.getage());
		System.out.println("Person address : "+p.getaddrass());
	}
}