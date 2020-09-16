//Inherits properties from the Transport class and since a jetplane is Refuelable, it implements the Refuelable interface.
public class JetPlane extends Transport implements Refuelable{

	//The super class allows constructor JetPlane to access the getSpeed and getPrice methods in the Transport class.
	public JetPlane(int transportPrice, float transportSpeed){
	super(transportPrice, transportSpeed);
	}
	
	//Prints the noise that a jetplane makes
	public void makesSound(){
		String sound = "Loud Aerodynamic Noise" ;
		System.out.println(sound);
	}

	//Prints the number of passengers for which it has seats available
	public void hasSeatsForPeople(){
		System.out.println("Can seat hundreds of passengers");
	}

	//Prints the type of fuel consumed by most cars
	public void consumesFuel(){
		System.out.println("Karosene");
	}
}
