/* This is a super class; all the animals inherit from this class.Comparable 
is an Interface that allows Animal objects to be compared to one another. */

 public abstract class Animal implements Comparable<Animal>{
	public String name;
	public int age;

	// This constructor sets the animalName and the animalAge.
	public Animal(String animalName, int animalAge){
		name = animalName;
		age = animalAge;
	}

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

	public void eat(Food food, Integer n){
		for(int i=1; i <= n; i++){
			System.out.println(food.getName());
		}
	}
	
	//Compares the ages of the Animals so that the animals can be ordered from lowest to highest age.
	public int compareTo(Animal other) {

		if(this.age == other.age){
			return 0;
    		}
		else if(this.age > other.age){
			return 1;
		}
		else{
			return -1;
		}

	}


	
}
