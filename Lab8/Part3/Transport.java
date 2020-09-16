/* All vehicles are modes of Transport, therefore Transport is the super 
class from which all sub classes inherit properties and methods. */
public abstract class Transport{
	public int price;
	public float speed;
	
	//This constructor takes the average price of the transport and speed as arguments.
	public Transport(int transportPrice, float transportSpeed){
	this.price = transportPrice;
	this.speed = transportSpeed;
	}
	
	//Returns speed anf price of using the particular transport
	public float getSpeed(){
		return speed;
	}

	//Returns the price of the particular transport
	public float getPrice(){
		return price;
	}

	//All vehicles make different sounds therefore the method is made abstract.
	public abstract void makesSound();

	/* Each transport accommodates a different number of people.This method 
	records the suitable number of people the tranport can seat. */
	public abstract void hasSeatsForPeople();
}
