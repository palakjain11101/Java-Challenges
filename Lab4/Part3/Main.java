import java.util.ArrayList;
import java.util.*;

public class Main{
	
	public static void main(String[] args){
		UserGroup myUserGroup = new UserGroup();
		UserGroup administrators = new UserGroup();

		myUserGroup.addSampleData();
		myUserGroup.printUsernames();

		Iterator<User> it = myUserGroup.getUserIterator();
		User u;
		while(it.hasNext()){
			u = it.next();
			if(u.getUserType().equals("admin")){ 		
				administrators.getUsers().add(u);
			}
			
		}

		administrators.printUsernames();
	   	int index = (administrators.getUsers().size() - 1);
		administrators.getUsers().get(index).setUserType("User");
		

		myUserGroup.printUsernames();
		administrators.printUsernames();
	
		// this is an administrators array not a user array. so this can cause confusion 
	}
}
