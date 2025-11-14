/*
 5. Default Methods in Interface
Question: How do default methods in interfaces work in Java 8?
 Example: Create an interface Vehicle with a default method start() and use it in a class Bike.

*/

//@Functionalinterface
interface Vehicle
{
	default void start()
	{
		System.out.println("Bhurrrr!");
	}
}

class Bike implements Vehicle
{
	void yes()
	{
		start();
	}
}
class defaultInInterface
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		Bike b=new Bike();
		b.yes();
	}
}