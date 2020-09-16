import java.util.ArrayList;
import java.util.*;

public class Main{
	
	public static void main (String[] args){
		WordGroup WordGroup1 = new WordGroup ("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup WordGroup2 = new WordGroup ("When you play play hard when you work dont play at all");
	
		String[] myStringArray1 = WordGroup1.getWordArray();
		String[] myStringArray2 = WordGroup2.getWordArray();	
	
		for( int i = 0; i < myStringArray1.length; i++){
			System.out.println( myStringArray1[i] );
		}
	
		for( int i = 0; i < myStringArray2.length; i++){
			System.out.println( myStringArray2[i] );
		}

		HashSet<String> set=new HashSet<String>();
		set=WordGroup1.getWordSet(WordGroup2);

		Iterator<String> it = set.iterator();
     		while(it.hasNext()){
				System.out.println(it.next());
			}

	}	
}	
	
	
