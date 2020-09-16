//This class models a parrot, it is also a subclass of Omnivore and extends it.
public class Parrot extends Omnivore{

	//The super class allows constructor parrot to access the getAge and getName methods in the Animal class.
	public Parrot(String name, int age){
		super(name, age);
	}

	//method overloading used in constructor parrot
	public Parrot(Integer n){ 
	//'this' keyword calls the previous parrot constructor
		this("Polly", n);
	}

	//Prints the noise that the parrot makes. 
	public void makeNoise(){
		String noise = "prr" ;
		System.out.println(noise);
	}

}
	
	
	
	