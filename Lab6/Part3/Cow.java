public class Cow extends Herbivore{

	public Cow(String name, int age){
	super(name, age);
	}

	public void makeNoise(){
		String noise = "moo" ;
		System.out.println(noise);
	}
}