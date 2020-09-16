
public class GuessingGame{
 
	public static void main(String[] args){
		Integer numberToGuess;
		Integer guessedNumber;
 
		Toolbox myToolbox = new Toolbox();
 
		System.out.println("Welcome to Guessing Game");
		numberToGuess = myToolbox.getRandomInteger(10);
		guessedNumber = myToolbox.readIntegerFromCmd();

		if(numberToGuess < guessedNumber){
			System.out.println("The number is too high");
		}

		else if(numberToGuess > guessedNumber){
			System.out.println("The number is too low");
		}

		else{
			System.out.println("Your guess was right");
		}
	
	}
}
