import java.util.ArrayList;
import java.util.*;
import java.lang.Object;

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



		HashMap<String, Integer> wordCount1 = WordGroup1.getWordCounts();
		HashMap<String, Integer> wordCount2 = WordGroup2.getWordCounts();

		for (String key: wordCount1.keySet()){
		System.out.println( key + ": " +wordCount1.get(key));
		}


		for (String key: wordCount2.keySet()){
			System.out.println( key + ": " +wordCount2.get(key));
		}

		Iterator<String> wordIterator = set.iterator();

     		while(wordIterator.hasNext()){
			String word = wordIterator.next();
			Integer count1 = wordCount1.get(word);
			Integer count2 = wordCount2.get(word);

			if (count1 == null){
				System.out.println(word + " : " + count2);
			}

			else if (count2 == null){
				System.out.println(word + " : " + count1);
			}

			else{
				System.out.println(word + " : " + (count1+count2));
			}
		
		}
	}
}
		
		
