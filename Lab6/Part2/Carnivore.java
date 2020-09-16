//This sublass of Animal defines animals which are carnivores
public class Carnivore extends Animal{

	//The eat method prints meat as carnivores only eat meat
	public void eat(){
		String food = "meat";
		System.out.println("The animal is eating the given food:" + food );

	}
}