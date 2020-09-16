public class FizzBuzz{ //creating class

	public static void main(String[] args){ //creating main method
	
		for(Integer i = new Integer(1); i < 61; i++){ //creating a for loop for numbers (represented by variable i) up to 60
		
			if(i % 3 != 0 && i % 5 != 0){
			System.out.print(i);
			}// if i is not divisible by 3 or 5 then print i
		
			if(i % 3 == 0){
			System.out.print("Fizz");
			}// if i is divisible by 3 print 'Fizz'
	
			if(i % 5 == 0){
			System.out.print("Buzz");
			}// if i is divisible by 5 print 'Buzz'
	
			System.out.println();// starts a new line after each iteration

		}

	}

} 
