package week3.day1.Assignment;

public class CruiseShip extends Ship {
	
	public void maximumPassengers(int maximum)
	{
		System.out.println("The maximum number of passenger is"+maximum);
	}
	public void cruiseCategory(String Category)
	{
		System.out.println("The cruisecategory is:"+Category);
	}
	
	public static void main(String[] args)

	{

		CruiseShip obj = new CruiseShip();
		obj.shipNamehip("Naval Ship");
		obj.shipbuiltYear("2005");
		obj.maximumPassengers(300);
		obj.cruiseCategory("War Ship");
		
	}
}


