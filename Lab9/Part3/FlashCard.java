import java.util.ArrayList;

public class FlashCard{
	String question;
	String answer;
	String userAnswer;
	//instance variable that will hold the ArrayList of FlashCards

	public FlashCard(String question, String answer){
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion(){
		return question;
	}

	public String getAnswer(){
		return answer;
	}

	public String getUserAnswer(){
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	/*public bool isCorrect() {

	} */
		
}
