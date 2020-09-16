import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FlashCardReader{
	BufferedReader reader;

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
			String line;
			while ((line = reader.readLine()) != null) {
       			return line;          
    		}
    	}
			/*if( reader != null){
				return reader.readLine();
			} */

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
}
