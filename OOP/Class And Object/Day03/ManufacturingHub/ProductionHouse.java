/*
ProductionHouse : this class can accept Machinery and machine class have some details Machinery class contain field id, name, comp, capacity 

Note: machinery cannot accept product count more than its capacity of products 

ProductionHouse class contain following methods 
void allocateMachine(Machinery m[]): this method can accept multiple machinery
Machinery [] getMachinery(): this method can return all machineries with details 
Product [] getProductsByMachineryId(int id): this function can accept machinery id and return all products produced by machine and if id not found return null
Machinery [] getAllProductionByAllMachine(): this method can return all machinery and its product details 

*/

class ProductionHouse
{
	private int id;
	private String name;
	private String comp;
	private int capacity;
	private Machinery[] m;
	private Scanner sc;
	
	public void setMachinery(Machinery ...m)
	{
		this.m=m;
	}

	public Machinery[] setMachinery()
	{
		return Machinery[];
	}

	public product[] getProductsByMachineryId(int id)
	{
		for(int i=0;i<m.length;i++)
		{	
			if(m[i].getId()==id)
			{
				return m[i].getProducts();
			}
		}
	}

		
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setComp(String comp)
	{
		this.comp=comp;
	}
	public String getComp()
	{
		return comp;
	}

	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getCapacity()
	{	
		return capacity;
	}

	public void machineryApp(Scanner sc)
	{
		this.sc=sc;
		System.out.println("set Machinery for Production House ");
		int num=sc.nextInt();
	
		Machinery[] m=new Machinery[num];
		for(int i=0;i<num;i++)
		{
			m[i]=new Machinery();
			System.out.println("Enter Machinery Id ");
			int id=sc.nextInt();
			m[i].setId(id);
			sc.nextLine();

			System.out.println("Enter Machinery Name ");
			String name=sc.nextLine();
			m[i].setName();

			System.out.println("Enter Machinery Company Name ");
			String comp=sc.nextLine();
			m[i].setComp();

			m[i].
		}
	}
	
}





















