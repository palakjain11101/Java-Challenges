import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FlashCardReader{
	BufferedReader reader;
	String line;

	//constructor provides fileName and creates BufferedReader which reads from the file with the given fileName
	public FlashCardReader(String fileName) {
		try{
			reader = new BufferedReader(new FileReader(fileName));
    	}

    	//catches this exception as compiler reports fileNotFound exception
		catch (FileNotFoundException fnf) {
			System.out.println("File not found !");

		}
	}
		
	//returns the next line of the contents of the file
	public String getLine(){
		try{
			while ((line = reader.readLine()) != null) {
       			return line;          
    		}
    	}
		catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Boolean fileIsReady(){
		try {
			if(reader != null){
				return reader.ready();
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

		public ArrayList<FlashCard> getFlashCards(){
		ArrayList<FlashCard> flashCardsList = new ArrayList<FlashCard>();
		try{
			while(reader.ready() == true){
		//	try{
				//for(int i=0; i< flashCardsList.size(); i++){		
					getLine();
					String flashcards[] = line.split(":"); 
					String question = flashcards[0]; 
					String answer = flashcards[1];
					flashCardsList.add(new FlashCard(question, answer));
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

					/*
					String colon = "Java:J2EE:JavaFX:JavaME"; String[] strings = colon.split(":"); System.out.println("Original Colon Separated String : " + colon); System.out.println("String splitted using Split() method of java.lang.String in Java"); for(String str : strings){ System.out.println(str); }

		Read more: http://www.java67.com/2013/03/how-to-split-string-in-java-regular-expression.html#ixzz5Y60VUJ1G */	
					//for(FlashCard flashcard : flashCardsList){

						//flashCardsList.add(new FlashCard(question, answer));
					//}
		
			//}

			//catch (IOException e){
			//e.printStackTrace();
			//}
		//}

		return flashCardsList;
	}
}
/*flashCardsList.add(new FlashCard( question, answer));
			flashCardsList.add(new FlashCard( "Which state was Franklin Roosevelt born in?", "New York"));
			flashCardsList.add(new FlashCard("In which year did Roosevelt become Governor of New York?", "1929"));
			flashCardsList.add(new FlashCard( "What was the name of Franklin Roosevelt's wife?", "Eleanor"));
			flashCardsList.add(new FlashCard( "How many children did Franklin Roosevelt have?", "6"));
			flashCardsList.add(new FlashCard("From which university did Franklin Roosevelt graduate with an A.B in history?","Harvard"));
			flashCardsList.add(new FlashCard("What was the first name of Franklin Roosevelt's 5th cousin, who was also President?","Theodore"));
			flashCardsList.add(new FlashCard( "Which disease is believed to be the causes of Franklin Roosevelt's paralysis?","Polio"));
			flashCardsList.add(new FlashCard("At what age did Franklin Roosevelt die?","63")); */
			/*flashCardsList.add(new FlashCard( "By what initials was Franklin Roosevelt better known?","FDR"));
			flashCardsList.add(new FlashCard( "Which number president was Franklin Roosevelt?", "32"));
			flashCardsList.add(new FlashCard( "Which state was Franklin Roosevelt born in?", "New York"));
			flashCardsList.add(new FlashCard("In which year did Roosevelt become Governor of New York?", "1929"));
			flashCardsList.add(new FlashCard( "What was the name of Franklin Roosevelt's wife?", "Eleanor"));
			flashCardsList.add(new FlashCard( "How many children did Franklin Roosevelt have?", "6"));
			flashCardsList.add(new FlashCard("From which university did Franklin Roosevelt graduate with an A.B in history?","Harvard"));
			flashCardsList.add(new FlashCard("What was the first name of Franklin Roosevelt's 5th cousin, who was also President?","Theodore"));
			flashCardsList.add(new FlashCard( "Which disease is believed to be the causes of Franklin Roosevelt's paralysis?","Polio"));
			flashCardsList.add(new FlashCard("At what age did Franklin Roosevelt die?","63")); */
