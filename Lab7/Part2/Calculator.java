public class Calculator {
	Double x;
	/*
	* Chops up input on ' ' then decides whether to add or multiply.
	* If the string does not contain a valid format returns null.
	*/
	public Double x(String x){
		String[] list = x.split(" ");
		this.x = Double.parseDouble(list[0]);
		String secondOperand = list[2];

		Double returnValue = 0.0;
		if(list[1].equals("+") || list[1].equals("x")){
	
			if(list[1].equals("+")){
				returnValue = this.x(new Double(secondOperand));
			}
			else{
				returnValue = this.x(Double.parseDouble(secondOperand));
			}

		}
		else {
			returnValue = null;
		}
		return returnValue;
	}
	
	/*
	* Adds the parameter x to the instance variable x and returns the answer as a Double.
	*/
	public Double x(Double x){
		System.out.println("== Adding ==");
		Double returnValue = new Double (this.x.doubleValue() + x.doubleValue());
		return returnValue;
	}
	
	/*
	* Multiplies the parameter x by instance variable x and return the value as a Double.
	*/
	public Double x(double x){
		System.out.println("== Multiplying ==");
		Double returnValue = new Double (this.x.doubleValue() * x);
		return returnValue;
	}	
}
