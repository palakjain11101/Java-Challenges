public class ATM{

	int balance;

	public void go(){
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		Toolbox myToolbox = new Toolbox();
		balance=myToolbox.readIntegerFromCmd();
		/* The line above takes the input from the user through the toolbox. 
		Because of the toolbox,'Enter your number' is also printed 
		automatically */
		System.out.println(balance);
	}

	public static void main(String args[]){ //The program reads the main method first
		ATM myATM = new ATM();
		myATM.go();//The 'go' method is called here
	}

}
