public class Main{
	
	public static void main(String[] args){	
		Toolbox myToolbox = new Toolbox();	
		int timestable;
		int i;
		int number;
		number=myToolbox.readIntegerFromCmd();
		
		for(i=1; i<= 20; i++){
			timestable = number * i;
			System.out.println(timestable);
		}
		
		int a=1;
		int sum=0;
		int x=0; 
			
		while(sum<500){
			sum= sum+a;
			a++;
			x=x+1;	
		}	
		
		System.out.println(x);

	}
	

}
