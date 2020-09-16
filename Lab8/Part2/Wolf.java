//This class models a wolf, it is also a subclass of Carnivore and extends it.
public class Wolf extends Carnivore{

	//The super class allows constructor wolf to access the getAge and getName methods in the Animal class.
	public Wolf( String name, int age){
	super(name, age);
	}

	public Wolf(){
		super();
	}

	//Prints the noise that the wolf makes.
	public void makeNoise(){
		String noise = "woof";
		System.out.println(noise);
	}
}
