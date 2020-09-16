//Inherits properties from the Transport class and since a train is Refuelable, it implements the Refuelable interface.
public class Train extends Transport implements Refuelable{

	//The super class allows constructor Train to access the getSpeed and getPrice methods in the Transport class.
	public Train(int transportPrice, float transportSpeed){
	super(transportPrice, transportSpeed);
	}
	
	//Prints the noise that a train makes
	public void makesSound(){
		String sound = "Chugging" ;
		System.out.println(sound);
	}

	//Prints the number of passengers for which it has seats available
	public void hasSeatsForPeople(){
		System.out.println("Seats hundreds of passengers");
	}

	//Prints the type of fuel consumed by most trains 
	public void consumesFuel(){
		System.out.println("Diesel");
	}
}
