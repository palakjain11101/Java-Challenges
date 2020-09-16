public class ATM{

	int balance;
	int withdrawal;
	int deposit;
	int number;
	Toolbox myToolbox = new Toolbox();
	//all member variables and the toolbox object can be used throughout the class

	public void go(){
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		balance=myToolbox.readIntegerFromCmd(); //the user determined balance is now printed 
		
		Boolean check=true;/* the variable 'check' is given the boolean value true, so that 
		the while loop runs only when the user inputs a negative value for the balance */ 
		while (check==true){
			if(balance<0){
				System.out.println("You entered an invalid input");
				balance=myToolbox.readIntegerFromCmd();/* since the user input a value less 
				than 0 for the balance,the program asks the user to enter another (valid) input */
			}

			else{
				check=false;/*if the user's input was greater than 0, the variable 'check' 
				is assigned the boolean value false, and the prgram quits this loop */
			}
		}
		
		while(true){ /* here, a variable is not assigned the boolean true value as this 
		loop must run endless number of times, until the user quits the program */
				
			System.out.print("What do you want to do?\n");
			System.out.print("1 : Withdraw\n");
			System.out.print("2 : Deposit\n");
			System.out.print("3 : Inquire\n");
			System.out.print("4 : Quit\n");
			number=myToolbox.readIntegerFromCmd(); //this now allows the user the choose from the 4 options above
		
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
			
			else{
			System.out.println("You have entered an invalid input");
			}
				

		}
	}

	public static void main(String args[]){ //the program reads the 'main' method first
		ATM myATM = new ATM();
		myATM.go(); //go method is called here
	}

	
	public void withdraw(){ //if the user presses '1' the 'withdraw' method is called
		System.out.println("*****************************************");
		System.out.println("		Withdrawal		");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		withdrawal=myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");

		Boolean check=true; //again the local variable check is given the boolean value true
		while (check){
			if(withdrawal<0 || withdrawal>balance){ 

			/* the amount of withdrawal must be a value greater than 0 and less 
			than the balance, this 'if' statement tells the program to only take an 
			input from the user again if the original input does not satisfy these conditions */

				System.out.println("You entered an invalid input");
				withdrawal=myToolbox.readIntegerFromCmd();		
			}

			else{
				check=false; //in the case the input satisfies the conditions, the program exits the loop
			}
		}

		balance=balance-withdrawal;/* withdrawal is deducted from the 
		balance to result in the new balance */ 
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}	
	
	
	public void deposit(){ //if the user presses '2' the 'deposit' method is called
		System.out.println("*****************************************");
		System.out.println("		Deposit			");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit?");
		deposit=myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");

		Boolean check=true;
		while (check){
			if(deposit<0){

			/* the deposit value must be a positive value, this if statement 
			tells the program to take the user's input again if the deposit is less than 0 */

				System.out.println("You entered an invalid input");
				deposit=myToolbox.readIntegerFromCmd();			
			}
			else{
				check=false;
			}
		}
		
		balance=balance+deposit;/* deposit is added to the 
		balance to result in the new balance */
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}
	
	public void inquire(){ //if the user presses '3' the 'inquire' method is called
		System.out.println("*****************************************");
		System.out.println("Your balance is " + balance );
		System.out.println("*****************************************");
		//in this case, the program simply displays the user's balance	
	}
	
	public void quit(){ //if the user presses '4' the 'quit' method is called
		System.out.println("*****************************************");
		System.out.println("GoodBye!");
		System.out.println("*****************************************");
		System.exit(0);
		//this allows the user to leave the program directly
	}
	
}
