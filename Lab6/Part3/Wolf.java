public class Wolf extends Carnivore{

	public Wolf( String name, int age){
	super(name, age);
	}

	public void makeNoise(){
		String noise = "woof";
		System.out.println(noise);
	}
}
