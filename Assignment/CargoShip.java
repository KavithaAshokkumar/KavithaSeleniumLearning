package week3.day1.Assignment;

public class CargoShip extends Ship {
	
	public void cargoCapacityinTons(int Capacity)
	{
		System.out.println("The cargo capacity in tons is:"+Capacity);
	}


public static void main(String[] args)

{

	CargoShip obj = new CargoShip();
	obj.shipNamehip("Liberty Ship");
	obj.shipbuiltYear("2000");
	obj.cargoCapacityinTons(20000);
	
}

}

