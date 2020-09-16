public class CardLock{
	SmartCard lastSwipedCard; //this instance variable remembers the last Smart card seen
	Boolean unlocked = false; //initially CardLock is locked
	Boolean staffOnly = true;
   
	void swipeCard(SmartCard s){ // this swipes the smart card, which will be remembered by the CardLock
		lastSwipedCard= s;
	}
    
	SmartCard getLastCardSeen(){
		return lastSwipedCard; 
	}
 
	Boolean isUnlocked(){//now restrictions are put and removed on the CardLock, as student access is turned off and on 

		if(lastSwipedCard.isStaff() & staffOnly ==true){
			return true;
		}

		else if(staffOnly ==false){// here, CardLock is unlocked in both cases; when the student or staff try to access
            		return true;
		}

		else{ //in this case staffOnly=true and a student is trying to access, thus, it returns false
            		return false;
		}
	}
    
	public void toggleStudentAccess(){// access to only staff members can be turned on and off
		staffOnly=!staffOnly;
	}
}
