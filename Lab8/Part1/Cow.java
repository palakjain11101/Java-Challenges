//This class models a wolf, it is also a subclass of Herbivore and extends it.
public class Cow extends Herbivore{
	
	//The super class allows constructor cow to access the getAge and getName methods in the Animal class.
	public Cow(String name, int age){
	super(name, age);
	}

	//Prints the noise that the cow makes. 
	public void makeNoise(){
		String noise = "moo" ;
		System.out.println(noise);
	}
}