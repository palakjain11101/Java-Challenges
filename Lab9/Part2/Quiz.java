import java.io.*;
import java.util.ArrayList;


//Handles interaction with the user
public class Quiz{

	public FlashCardReader flashCardReader;
	public ArrayList <FlashCard> flashCardsList;

	public String s;

	public Quiz(String s){
		flashCardReader = new FlashCardReader("Questions.txt");
		flashCardsList = flashCardReader.getFlashCards();
		play();
	}

	public static void main(String[] args){
		Quiz quiz = new Quiz("Questions.txt");
		//quiz.play();
	}

	public void play(){
		
        for (FlashCard flashcard : flashCardsList) {
           	System.out.println(flashcard.getQuestion());
 
        //you could also use toolbox here
       		Toolbox myToolbox = new Toolbox();
        	String userAnswer = myToolbox.readStringFromCmd();
			if(userAnswer == flashcard.getAnswer()){
				System.out.println("Your answer is correct !");
			}
			else{
				System.out.println("Your answer is incorrect, the correct answer is: " + flashcard.getAnswer());
			}

		}
	}
	
}