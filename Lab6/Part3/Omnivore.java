public class Omnivore extends Animal{
	public Omnivore(String name, int age){
		super(name, age);
	}
		
	public void eat(Food food){
		System.out.println(super.getName() + " is eating " + food.getName());
	}	

}