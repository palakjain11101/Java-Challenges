//This class models a parrot, it is also a subclass of animal and extends it.
public class Parrot extends Animal{

	//The super class allows constructor parrot to access the getAge and getName methods in the Animal class.
	public Parrot(String name, int age){
	super(name, age);
	}

	//Prints the noise that the parrot makes 
	public String makeNoise(){
		String noise = "prr" ;
		System.out.println(noise);
		return noise;
	}

}
	
	
	
	