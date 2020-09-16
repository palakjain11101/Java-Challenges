import java.util.*;

//This subclass of Animal defines animals which are herbivores 
public class Herbivore extends Animal{
	public Herbivore( String name, int age){
		super(name, age);
	}

	//The eat method prints that herbivores only eat plant.
	public void eat(Food food) throws Exception{
		System.out.println(super.getName() + " is eating " + food.getName());

		//if food passed in as a parameter is a Plant, it throws an Exception
		if( food instanceof Meat ){
			throw new Exception(" Herbivores only eat plants ");
		}
	}
}