import java.util.Scanner;
import java.util.function.Consumer;

class LowerToUpperString
{
	public static void main(String[] arghs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String str=sc.nextLine();

		Consumer<String> c=s->{
				String upper =str.toUpperCase();
				System.out.println("inside the consumer interface "+upper);
			};

		c.accept(str);
		System.out.println("OutSide the consumer interface "+str);
	}
}