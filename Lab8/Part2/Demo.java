/* An interface is a 100% abstract class; in other words, it's like a 
contract; any class that implements it must provide code for its 
methods. Whereas, only code for only abstract methods in abstract 
classes must provided in a class that extends the abstract class.  */

public class Demo{

	//Main method creates an ArrayList of Animal objects with different names and ages.
	public static void main(String[] args){
		
		ArrayList<Animal> list = new ArrayList<Animal>();
	
		Animal wolf = new Animal ("Josh" , 5);
		Animal parrot = new Animal ("Kyle", 2);
		Animal cow = new Animal ("Harry", 7);

		list.add(new Animal(wolf));
		list.add(new Animal(parrot));
		list.add(new Animal(cow));
	}

}