/* The Main Class creates objects wolf, parrot, cow, meat and plant, and calls their properties. Cows do not eat meat
and wolves do not eat plants.Therefore, the class throws an exception error when eat is fed to the cow and vice versa.*/
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
		
		/* Carnivore wolf2 = new Carnivore("Caru", 2);
		wolf2.eat(new Meat("meat"));
		System.out.println(wolf2.getAge());
		System.out.println(wolf2.getName());
		
		Herbivore cow2 = new Herbivore("Malu", 3);
		cow2.eat(new Plant("plant"));
		System.out.println(cow2.getAge());
		System.out.println(cow2.getName());
		
		Omnivore parrot2 = new Omnivore("Shona", 1);
		parrot2.eat(new Plant("plant"));
		System.out.println(parrot2.getAge());
		System.out.println(parrot2.getName());	*/
		
		
		try{ 
			cow.eat(meat);
			wolf.eat(plant);
        } 
		
        catch(Exception e){ 
            System.err.println(e);
        } 
		
	
	}
}



