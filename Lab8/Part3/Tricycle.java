//This class inherits properties from the Transport class and since the tricycle is a type of Cycle and RoadVehicle, it implements these interfaces. 
public class Tricycle extends Transport implements Cycle, RoadVehicle{

	//The super class allows constructor Tricycle to access the getSpeed and getPrice methods in the Transport class.
	public Tricycle(int transportPrice, float transportSpeed){
	super(transportPrice, transportSpeed);
	}

	//Prints the noise that a tricycle makes	
	public void makesSound(){
		String sound = "tinkling" ;
		System.out.println(sound);
	}

	//Prints the number of seats available
	public void hasSeatsForPeople(){
		System.out.println("Typically has seat only for one person");
	}

	//Prints the number of wheels in a tricycle
	public void hasWheels(){
		System.out.println("Has three wheels");
	}

	//Prints the stability of the cycle
	public void isStable(){
		System.out.println("A tricycle is quite stable and is therefore used by many children to learn cycling");
	}

	//Prints the storage space
	public void hasStorageSpace(){
		System.out.println("Usually has no storage space");
	}

}
