//Inherits properties from the Transport class and since a car is a type of RoadVehicle and is Refuelable, it implements these interfaces. 
public class Car extends Transport implements RoadVehicle, Refuelable{

	//The super class allows constructor Car to access the getSpeed and getPrice methods in the Transport class.
	public Car(int transportPrice, float transportSpeed){
	super(transportPrice, transportSpeed);
	}
	
	//Prints the noise that a car makes
	public void makesSound(){
		String sound = "Vroom" ;
		System.out.println(sound);
	}

	//Prints the number of seats available
	public void hasSeatsForPeople(){
		System.out.println("Typically as seats for 5 people");
	}

	//Prints the type of fuel consumed by most cars
	public void consumesFuel(){
		System.out.println("Diesel or Petrol");
	}
	
	//Prints the typical storage space in a car
	public void hasStorageSpace(){
		System.out.println("Has more storage space than cycles. Depending on the model and brand of the car, the storage space differs.");

	}
}