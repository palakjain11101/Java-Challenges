import java.util.*;
public class Herbivore extends Animal{
	public Herbivore( String name, int age){
		super(name, age);
	}

	public void eat(Food food) throws Exception{
		System.out.println(super.getName() + " is eating " + food.getName());
		if( food instanceof Plant ){
			throw new Exception(" Herbivores only eat plants ");
		}
	}
}