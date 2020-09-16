// This is a super class; all the animals inherit from this class.
 public abstract class Animal{
	public String name;
	public int age;

	// This constructor sets the animalName and the animalAge.
	public Animal(String animalName, int animalAge){
		name = animalName;
		age = animalAge;
	}
		
	//This constructorcalls the previous 'Animal' constructor, providing new arguments.
	public Animal(){
	this ("newborn", 0);
	}
	
	//getAge method returns the age  of the animal
	public int getAge(){
		return age;
	}
	
	//getName method returns the age  of the animal
	public String getName(){
		return name;
	}
	
	//eat method throws an exception
	abstract void eat(Food food)throws Exception;

	//another eat method with a different signature is created 
	public void eat(Food food, Integer n){
		//feeds the Food object to the animal, n number of times
		for(int i=1; i <= n; i++){
			System.out.println(food.getName());
		}
	}


	
}
	
	
	
