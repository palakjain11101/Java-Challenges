public abstract class Animal{
	public String name;
	public int age;

	public Animal(String animalName, int animalAge){
		name = animalName;
		age = animalAge;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}

	abstract void eat(Food food)throws Exception;
}
	
	
	
