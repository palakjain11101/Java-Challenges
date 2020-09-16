//This subclass of Animal defines animals which are herbivores 
public class Herbivore extends Animal{
	//The eat method prints plant as herbivores only eat plants.
	public void eat(){
		String food = "plant";
		System.out.println("The animal is eating the given food:" + food );
	}
}