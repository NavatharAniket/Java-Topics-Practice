import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Q4
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(60);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(10);
		al.add(50);
		al.add(50);
		
		
		//Collections.sort(al);
		System.out.println(al);

		for(int i=0;i<al.size()-1;i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp=al.get(i);
					al.set(i,al.get(j));
					al.set(j,temp);
					//al.get(j)=temp;
				}
			}
		}

		System.out.println(al);
		

	}
}