import java.util.*;

//This subclass of Animal defines animals which are carnivores
public abstract class Carnivore extends Animal{

	//The constructor Carnivore takes two parameters, name and age; which it inherits from the Animal class 
	public Carnivore(String name, int age){
		super(name, age);
	}
		
	//This constructor inherits from the Animal class constructor, which passes 'newborn' and '0' as arguments.
	public Carnivore(){
		super();
	}
	
	//The eat method prints that carnivores only eat meat
	public void eat(Food food) throws Exception{
		System.out.println(super.getName() + " is eating " + food.getName());
		
		//if food passed in as a parameter is a Plant, it throws an Exception
		if(food instanceof Plant){
			throw new Exception(" Carnivores only eat meat ");
		}
		
	}

}