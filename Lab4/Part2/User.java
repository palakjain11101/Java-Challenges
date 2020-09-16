public class User{
	String username;
	String userType;
	String name;
	User(String newUsername, String newUserType, String newName){
	username = newUsername;
	userType = newUserType;
	name = newName;
	}
	
	public String getUsername(){
	return username;
	}
	
	public String getUserType(){
	return userType;
	}
	
	public String getName(){
	return name;
	}
	
	public void setUserType(String thisUserType){
	userType = thisUserType; 
	}
}
	
	
	