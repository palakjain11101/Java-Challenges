// This is a super class; all the animals inherit from this class.
public class Animal{
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

}
	
	
	
