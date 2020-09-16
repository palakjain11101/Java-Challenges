import java.util.ArrayList;
import java.util.*;

public class WordGroup{
	
	public String words;
	
	public WordGroup(String upperCaseWord){
	words = upperCaseWord.toLowerCase();
	}
	
	public String[] getWordArray(){
	String[] parts = words.split(" ");
	return parts;
	}
}

	
	