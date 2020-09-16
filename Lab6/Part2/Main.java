public class Main{
	public Main(){

	}
	
	public static void main(String[] args){

		Wolf wolf = new Wolf("Jack", 8);
		wolf.makeNoise( );
		System.out.println(wolf.getAge());
		System.out.println(wolf.getName());

		Parrot parrot = new Parrot("Sanne", 5);
		parrot.makeNoise( );
		System.out.println(parrot.getAge());
		System.out.println(parrot.getName());
		
		Cow cow = new Cow("Laos", 6);
		cow.makeNoise( );
		System.out.println(cow.getAge());
		System.out.println(cow.getName());
		
		Meat meat = new Meat("chicken");
		System.out.println(meat.getName());

		Plant plant = new Plant("lotus");
		System.out.println(plant.getName());
	
	}
}



