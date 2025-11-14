import java.util.Scanner;
class Vehicles
{
	String VehicleModel; 
  	String RegistrationNumber;
	int VehicleSpeed; 
	int FuelCapacity; 
	int FuelConsumption;

	Vehicles(String VehicleModel,String RegistrationNumber,int VehicleSpeed,int FuelCapacity,int FuelConsumption)
	{
		this.VehicleModel=VehicleModel; 
  		this.RegistrationNumber=RegistrationNumber;
		this.VehicleSpeed=VehicleSpeed; 
		this.FuelCapacity=FuelCapacity; 
		this.FuelConsumption=FuelConsumption;
	}
		
	
	void display()
	{
		System.out.println("ragistraction no is "+getVehicleModel());
		System.out.println("Vehicle Model "+getVehicleModel());
		System.out.println("Vehicle Speed "+getVehicleSpeed());
		System.out.println("Fuel Capacity "+getFuelCapacity());
		System.out.println("Fuel Consumption "+getFuelConsumption());
	}
	
}


class Truck extends Vehicles
{
	int Cargoweightlimit;
	Truck(String VehicleModel,String RegistrationNumber,int VehicleSpeed,int FuelCapacity,int FuelConsumption,int Cargoweightlimit)
	{
		this.VehicleModel=VehicleModel; 
  		this.RegistrationNumber=RegistrationNumber;
		this.VehicleSpeed=VehicleSpeed; 
		this.FuelCapacity=FuelCapacity; 
		this.FuelConsumption=FuelConsumption;
		this.Cargoweightlimit=Cargoweightlimit;
	}
	
	int getVehicleModel()
	{
		return VehicleModel;
	}

	int getRegistrationNumber()
	{
		return RegistrationNumber;
	}

	int getVehicleSpeed()
	{
		return VehicleSpeed;
	}
	
	int getFuelCapacity()
	{
		return FuelCapacity;
	}
	
	int getFuelConsumption()
	{
		return FuelConsumption;
	}
	
	int fuelNeeded(int distance)
	{
		System.out.println("Fuel needed is "+(getFuelCapacity/60));
	}

	int distanceCovered(int time)
	{
		System.out.println("Distance cover is "+ getVehicleSpeed()*time);	
	}

	void display()
	{
		System.out.println("ragistraction no is "+getVehicleModel());
		System.out.println("Vehicle Model "+getVehicleModel());
		System.out.println("Vehicle Speed "+getVehicleSpeed());
		System.out.println("Fuel Capacity "+getFuelCapacity());
		System.out.println("Fuel Consumption "+getFuelConsumption());
	}
	

}

class Bus extends Vehicles
{
	int NoOfPassengers;
	Bus(String VehicleModel,String RegistrationNumber,int VehicleSpeed,int FuelCapacity,int FuelConsumption,int NoOfPassengers)
	{
		this.VehicleModel=VehicleModel; 
  		this.RegistrationNumber=RegistrationNumber;
		this.VehicleSpeed=VehicleSpeed; 
		this.FuelCapacity=FuelCapacity; 
		this.FuelConsumption=FuelConsumption;
		this.NoOfPassengers=NoOfPassengers;
	}

		int getVehicleModel()
	{
		return VehicleModel;
	}

	int getRegistrationNumber()
	{
		return RegistrationNumber;
	}

	int getVehicleSpeed()
	{
		return VehicleSpeed;
	}
	
	int getFuelCapacity()
	{
		return FuelCapacity;
	}
	
	int getFuelConsumption()
	{
		return FuelConsumption;
	}
	
	int fuelNeeded(int distance)
	{
		System.out.println("Fuel needed is "+(getFuelCapacity/60));
	}

	int distanceCovered(int time)
	{
		System.out.println("Distance cover is "+ getVehicleSpeed()*time);	
	}

	void display()
	{
		System.out.println("ragistraction no is "+getVehicleModel());
		System.out.println("Vehicle Model "+getVehicleModel());
		System.out.println("Vehicle Speed "+getVehicleSpeed());
		System.out.println("Fuel Capacity "+getFuelCapacity());
		System.out.println("Fuel Consumption "+getFuelConsumption());
	}
}

class Transport
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1 for Vehicle");
			System.out.println("2 for Truck");
			System.out.println("3 for Bus");
			System.out.println("Enter Your choice");
			int ch=sc.nextInt();
		}while(true);
	}
}