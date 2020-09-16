// This is a super class; all the animals inherit from this class.
public abstract class Animal{
	public String name;
	public int age;

	// This constructor sets the animalName and the animalAge.
	public Animal(String animalName, int animalAge){
		name = animalName;
		age = animalAge;
	}
	
	//getAge method returns the age  of the animal
	public int getAge(){
		return age;
	}
	
	//getName method returns the age  of the animal
	public String getName(){
		return name;
	}

	/*As different animals make different noises, each class has to provide its own implementation for making 
	a noise, thus an abstract method is created here. Extended classes are required to implement the makeNoise method.*/
	abstract void makeNoise();
}
	
	
	
