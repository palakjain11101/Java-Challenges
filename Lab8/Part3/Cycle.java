/* The RoadVehicle class is made an interface as vehicles cannot extend more 
than one superclass and since Cycle only applies to bicycle and tricycle. */
public interface Cycle {

	//Prints the different number of wheels in cycle and bicycle 
	public void hasWheels();

	//Determines how stable a cycle si. The greater the number of wheels, the higher the stability.
	public void isStable();

}
