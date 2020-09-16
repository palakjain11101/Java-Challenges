
// This class is a test harness for a partially implemented class that tests the addition and multiplication of numbers and recognizes invalid operators.
public class TestCalculator{
	Boolean add = false;
	Boolean invalid = false; 
	Boolean multiply = false;
	double x;

	public Boolean testParser(Calculator calculator){

		//tests that x("12+5") returns a Double with value 17
		String a ="12+5";
		Double resultA = calculator.x(a);
		if(resultA == 17){
			add = true;
		}
	
		//tests that x("12*5") returns a Double with value 17
		String m ="12*5";
		Double resultM = calculator.x(m);
		if(resultM == 60){
			multiply = true;
		} 

		//tests that x("12[5") returns a Double with value 17
		String i = "12[3";
		Double resultI = calculator.x(a);
		if(resultI == null){
			invalid = true;
		}
		
		//returns a boolean which is true if the whole test succeeds 
		if(add == true && multiply == true && invalid == true){
			return true;
		}
		else{
			return false;
		}
	
	}

	//tests whether positive and negative numbers can be added with the appropriate x() method
	public Boolean testAdd (Calculator calculator){		
		Double A = 5.0;
		Double B = 3.0;
		Double C = -5.0;
		Double D = -3.0;
		Boolean positiveAddition = false;
		Boolean negativeAddition = false;

		//sets the member variable x in Calculator class to A and the local variable to B
		calculator.x = A;
		if(A+B == calculator.x(B)){
			positiveAddition = true;
		}

		//sets the member variable x in Calculator class to C and the local variable to D
		calculator.x = C;
		if(C+D == calculator.x(D)){
			negativeAddition = true;
		}

		if( positiveAddition == true & negativeAddition == true){
			return true;
		}

		else{
			return false;
		}
	}

		//tests whether positive and negative numbers can be multiplied with the appropriate x() method
		public Boolean testMultiplication (Calculator calculator){
			Double A = 5.0;
			Double B = 3.0;
			Double C = -5.0;
			Double D = -3.0;
			Boolean positiveMultiplication = false;
			Boolean negativeMultiplication = false;
	
			//sets the member variable x in Calculator class to A and the local variable to B
			calculator.x = A;
			if(A*B == calculator.x(B)){
				positiveMultiplication = true;
			}

			//sets the member variable x in Calculator class to C and the local variable to D
			calculator.x = C;
			if(C*D == calculator.x(D)){
				negativeMultiplication = true;
			}

			if( positiveMultiplication == true && negativeMultiplication == true){
				return true;
			}

			else{
				return false;
			}
		}
			
	}

