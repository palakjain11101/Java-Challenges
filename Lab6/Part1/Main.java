/* This Main class creates wolf and parrot objects and uses the 
methods defined in Animal. It also creates a Meat and Plant object. */
public class Main{
	public Main(){
	}
	
	public static void main(String[] args){

		Wolf wolf = new wolf("Jack", 8);
		wolf.makeNoise( );

		Parrot parrot = new parrot("Sanne", 5);
		parrot.makeNoise( );
		
		Meat meat = new meat("chicken");

		Plant plant = new plant("lotus");
	
	}
}