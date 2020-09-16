import java.util.ArrayList;
import java.util.*;

public class UserGroup{
	
	ArrayList<User> userArrayList; 
	
	public UserGroup() {
		userArrayList= new ArrayList<User>();
	}

	
	public ArrayList<User> getUsers(){
		return userArrayList;
	}
	
	public void addSampleData(){

		String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] names = {"Bill", "Joe", "Anna", "Hyde", "Alice", "Stephen", "Laos", "Coonie", "Conner", "Sophie"};
		String[] ranks = {"user", "admin", "editor"};
		
		for(int i=0;i<10;i++){
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

	public void removeFirstUser(){
		userArrayList.remove(0);
	}
	
	public void removeLastUser(){
		int lastIndex;
		lastIndex = userArrayList.size() - 1;
		userArrayList.remove(userArrayList.size() - 1);
	} 

	
	public void removeUser(String userName){
		Iterator<User> it = userArrayList.iterator();
		User u;
		while(it.hasNext()){
			u = it.next();
			if(u.getUsername().equals(userName)){ 		
				it.remove(); 
			}
		}
	
	}
	
	
	public Iterator<User> getUserIterator(){
		return userArrayList.iterator(); 
	}

		
}
		

