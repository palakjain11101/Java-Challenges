/* The Refuealable class is made an interface as vehicles cannot extend more 
than one superclass and since bicycles and tricycles do not need fuel to be used. */
public interface Refuelable{

	// Prints the type of fuel  used by the vehicle
	void consumesFuel();

}