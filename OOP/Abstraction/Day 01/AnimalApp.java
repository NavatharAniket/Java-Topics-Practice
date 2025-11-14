import java.util.Scanner;
	
abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog sound");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat Sound");
	}
}

class AnimalApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);		
				do
		{
			System.out.println("1 for Dog ");
			System.out.println("2 for Cat ");
			System.out.println("3 for exit ");
			System.out.println("enter choice ");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					Dog d=new Dog();
					d.makeSound();
					break;
		
				case 2:
					Cat c=new Cat();
					c.makeSound();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Enter Valid choice ");
			}

			
			
			
		}while(true);
	}
}