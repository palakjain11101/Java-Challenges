public class ATM{

	int balance;
	int withdrawal;
	int deposit;
	int number;
	Toolbox myToolbox = new Toolbox();
	// all member variables and the toolbox object can be used throughout the class

	public void go(){
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		balance=myToolbox.readIntegerFromCmd();// the user determined balance is now printed 

		System.out.println("What do you want to do ?");
		System.out.println(" 1: Withdraw");
		System.out.println(" 2: Deposit");
		System.out.println(" 3: Inquire");
		System.out.println(" 4: Quit");
		number=myToolbox.readIntegerFromCmd();//this now allows the user the choose from the 4 options above
		
		if(number == 1){ //conditional statements instruct the program to call the method that corresponds to each number
			withdraw();
		}

		else if(number == 2){
			deposit();
		}

		else if(number == 3){
			inquire();
		}

		else if(number == 4){
			quit();
		}
	
	}


	public static void main(String args[]){ //the program reads the 'main' method first
		ATM myATM = new ATM();
		myATM.go();// go method is called here
	}

	
	public void withdraw(){ // if the user presses '1' the 'withdraw' method is called
		System.out.println("*****************************************");
		System.out.println("		Withdrawal		");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		withdrawal=myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");
		balance=balance-withdrawal; /* withdrawal is deducted from the 
		balance to result in the new balance */ 
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}	
	
	
	public void deposit(){  // if the user presses '2' the 'deposit' method is called
		System.out.println("*****************************************");
		System.out.println("		Deposit			");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit?");
		deposit=myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");
		balance=balance+deposit;/* deposit is added to the 
		balance to result in the new balance */ 
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}
	
	public void inquire(){// if the user presses '3' the 'inquire' method is called
		System.out.println("*****************************************");
		System.out.println("Your balance is " + balance );
		System.out.println("*****************************************");
		//in this case, the program simply displays the user's balance 
	}
	
	public void quit(){// if the user presses '4' the 'quit' method is called
		System.out.println("*****************************************");
		System.out.println("GoodBye!" );
		System.out.println("*****************************************");
		System.exit(0);
		//this allows the user to quit/ leave the program directly
	}
	
}
	
