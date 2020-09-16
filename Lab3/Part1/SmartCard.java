public class SmartCard{
	public String owner;
	boolean staff;/* the SmartCard can either belong to a student or a staff, 
	if staff=false,then the card belongs to a student*/
	
	public SmartCard(String name){
       		owner= name;
        	staff=false;
	} //this constructor takes a string parameter to set the name of the owner

        
	public String getOwner(){
        	return owner;
	}
    
	public boolean isStaff(){
        	return staff; //returns true if the card belongs to a member of staff	
	}
    
	public void setStaff(Boolean status){
        	staff=status;
	} /* this method sets the staff status to true or false depending on if 
	the person is a member of staff or student, respectively */
}
