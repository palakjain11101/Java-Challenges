//This class models a wolf, it is also a subclass of animal and extends it.
public class Wolf extends Animal{

	//The super class allows constructor wolf to access the getAge and getName methods in the Animal class.
	public Wolf( String name, int age){
	super(name, age);
	}

	//Prints the noise that the wolf makes 
	public String makeNoise(){
		String noise = "woof";
		System.out.println(noise);
		return noise;
	}
	
}

	