import java.util.*;
public class Carnivore extends Animal{
	public Carnivore( String name, int age){
		super(name, age);
	}
		
	public void eat(Food food) throws Exception{
		System.out.println(super.getName() + " is eating " + food.getName());
		if(food instanceof Plant){
			throw new Exception(" Carnivores only eat meat ");
		}
		
	}

}