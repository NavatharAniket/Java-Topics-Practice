/*
Q3. Write Program create class name as ArrSum with method 
void setValue(int arr[]) you have to create child class
 name as GetSum with method int getArrSum() you have 
to accept array values from ArrSum and calculate its sum and return it
*/


class ArrSum
{
	int[] arr;
	void setValue(int[] arr)
	{
		this.arr=arr;
	}
}

class GetSum extends ArrSum
{
	int getArrSum()
	{
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum;
	}
}
class Q3
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		GetSum g=new GetSum();
		g.setValue(arr);
		System.out.println(g.getArrSum());
	}
}