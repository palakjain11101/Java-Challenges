/* The Main Class creates objects wolf, parrot, cow, meat and plant, and calls their properties.*/
public class Main{
	public Main(){

	}
	
	/* Animals wolf, parrot and cow take two parameters, the name and age,
	whereas food types meat and plant only take name as the variables. */
	public static void main(String[] args){

		Wolf wolf = new Wolf("Jack", 8);
		wolf.makeNoise( );
		System.out.println(wolf.getAge());
		System.out.println(wolf.getName());
		wolf.eat(meat, 5);

		//new Wolf object created as an instance of the Wolf class
		Wolf wolf1 = new Wolf();

		Parrot parrot = new Parrot("Sanne", 5);
		parrot.makeNoise( );
		System.out.println(parrot.getAge());
		System.out.println(parrot.getName());
		
		Cow cow = new Cow("Mosho", 7);
		cow.makeNoise( );
		System.out.println(parrot.getAge());
		System.out.println(parrot.getName());
		
		Meat meat = new Meat("chicken");
		System.out.println(meat.getName());

		Plant plant = new Plant("grass");
		System.out.println(plant.getName());
		
		/* Cows do not eat meatand wolves do not eat plants.Therefore, the class 
		throws an exception error when eat is fed to the cow and vice versa. */
		try{ 
			cow.eat(meat);
			wolf.eat(plant);
        	} 
		
        	catch(Exception e){ 
           		System.err.println(e);
       		} 
		
	
	}
}



