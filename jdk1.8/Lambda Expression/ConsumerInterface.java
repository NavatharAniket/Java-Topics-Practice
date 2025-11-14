import java.util.function.Consumer;
class ConsumerInterface
{
	public static void main(String[] args)
	{
		/*Consumer<Integer> c=new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};

		c.accept(10);*/
		
		/*
		Consumer<Integer>c= (Integer i)->System.out.println(i);
		c.accept(10);*/

		Consumer<Integer>c= (Integer i)->System.out.println(i).accept(10);
	}
}