import java.io.*;
import java.util.ArrayList;
import java.io.PrintStream;

//Handles interaction with the user
public class Quiz{
	String userAnswer;

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
	}

	public void play(){
		Toolbox myToolbox = new Toolbox();
		System.out.println("Would you like to save your results when the quiz finishes ?");
		String saveResults = myToolbox.readStringFromCmd();
		
        for (FlashCard flashcard : flashCardsList) {
           	System.out.println(flashcard.getQuestion());
 
        //you could also use toolbox here
       		//Toolbox myToolbox = new Toolbox();
       		//public ArrayList <FlashCard> userAnswersList;
        	userAnswer = myToolbox.readStringFromCmd();
        	flashcard.setUserAnswer(userAnswer);
			//if(flashcard.isCorrect()){
			if((flashcard.getUserAnswer()).equals(flashcard.getAnswer())){
				System.out.println("Your answer is correct !");
			}
			else{
				System.out.println("Your answer is incorrect, the correct answer is: " + flashcard.getAnswer());
			}
		}
		if(saveResults.equals("yes") || saveResults.equals("Yes") || saveResults.equals("Y")) {
			save();
		}
	}

	public void save(){
		/*public static void writeFile1() throws IOException {
	File fout = new File("out.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 
	for (int i = 0; i < 10; i++) {
		bw.write("something");
		bw.newLine();
	}
 
	bw.close();
} */
	try{
		PrintStream printStream = new PrintStream(new File("save.txt"));
		int count = 0;
		for (FlashCard flashCard : flashCardsList){
			printStream.print(flashCard.getQuestion() + "," + flashCard.getUserAnswer());
			//printStream.print(", Your answer: " + userAnswer);
			if(flashCard.getUserAnswer().equals(flashCard.getAnswer())){
				printStream.print(",right");//flashcard.getAnswer()
				count = count + 1;
			}
			else{
				printStream.print(",wrong");
			}
			printStream.println();
		}
			/*if(userAnswer == flashCard.getAnswer()){
				count = count +1;
			} */
		printStream.print(count + ",10," + ((count / 10.0) * 100));
		printStream.close();
	}

	catch (FileNotFoundException fnf) {
		System.out.println("File not found !");

	}
}
	
}