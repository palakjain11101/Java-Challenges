//This subclass of Animal defines animals which are omnivores. 
public class Omnivore extends Animal{
	public Omnivore(String name, int age){
		super(name, age);
	}
	
	//The eat method prints anything as omnivores eat anything.
	public void eat(Food food){
		System.out.println(super.getName() + " is eating " + food.getName());
	}	

}