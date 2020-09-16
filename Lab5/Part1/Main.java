import java.util.ArrayList;
import java.util.*;

public class Main{
	
	public static void main (String[] args){
		WordGroup WordGroup1 = new WordGroup ("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup WordGroup2 = new WordGroup ("When you play play hard when you work dont play at all");
	
		String[] myStringArray1 = WordGroup1.getWordArray();
		String[] myStringArray2 = WordGroup2.getWordArray();	
	
		for( int i = 0; i <= myStringArray1.length - 1; i++){
			System.out.println( myStringArray1[i] );
		}
	
		for( int i = 0; i <= myStringArray2.length - 1; i++){
			System.out.println( myStringArray2[i] );
		}
	}	
}	
	
		/* for(String word: string myStringArray1){
		System.out.println(word);
		} */	
