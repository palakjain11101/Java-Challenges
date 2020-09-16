import java.util.ArrayList;
import java.util.*;

public class UserGroup{
	int i;
	
	ArrayList<User> userArrayList = new ArrayList<User>();

	
	public ArrayList<User> getUsers(){
		return userArrayList;
	}
	
	public void addSampleData(){

		String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] names = {"Bill", "Joe", "Anna", "Hyde", "Alice", "Stephen", "Laos", "Coonie", "Conner", "Sophie"};
		String[] ranks = {"user", "admin", "editor"};
		
		for(i=0;i<10;i++){
			String userName = names[i].substring(0,2) + numbers[i];
			String userType = ranks[i%3];
			String name = names[i];
				
			userArrayList.add(new User(userName, userType, name));
		}
	}
	
	public User getUser(int slot){
		return userArrayList.get(slot);	
	} 
	
	public void printUsernames(){
		for(User thisUser:userArrayList){
			System.out.println(thisUser.getUsername() + " " + thisUser.getUserType());
		}
	}

}

	
