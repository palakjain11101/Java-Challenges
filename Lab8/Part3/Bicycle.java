//This class inherits properties from the Transport class and since the bicycle is a type of cycle and RoadVehicle, it implements these interfaces. 
public class Bicycle extends Transport implements Cycle, RoadVehicle{

	//The super class allows constructor Bicycle to access the getSpeed and getPrice methods in the Transport class.
	public Bicycle(int transportPrice, float transportSpeed){
	super(transportPrice, transportSpeed);
	}
	
	//Prints the noise that a bicycle makes; code for makesSound() method in Transport super class.
	public void makesSound(){
		String sound = "clinking" ;
		System.out.println(sound);
	}

	//Prints the number of seats available; code for hasSeatsForPeople() method in Transport super class.
	public void hasSeatsForPeople(){
		System.out.println("Has seats for two people");
	}

	//Prints the number of wheels in a bicycle; implements the hasWheels() method from Cycle interface.
	public void hasWheels(){
		System.out.println("Has two wheels");
	}

	//Prints the stability of the cycle; implements the isStable() method from Cycle interface.
	public void isStable(){
		System.out.println("Somewhat stable compared to a tricycle.");
	}	

	//Prints the storage space; implements the hasStorageSpace() method from RoadVehicle interface.  
	public void hasStorageSpace(){
		System.out.println("Typically has no storage space; it may have a basket in which one can store relatively small things");
	}
}
