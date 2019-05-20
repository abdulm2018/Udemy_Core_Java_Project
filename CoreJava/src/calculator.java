
public class calculator {
	
	
	/*
	 * 
	 * 
	 * Calculators - add, sub, mul, div
	 * 1. method  --> add, sub, mul, div
	 * 2. return --> int
	 * 3. parameters --> 2 int
	 * 
	 * 
	 * 
	 */
	
	
	

	// Add
	public int getSum(int num1, int num2) { // parameters
		
		int result = num1+num2;
		return result;
		
	}
	
	//Sub
   public int getSub(int num1, int num2) {
		
		int result = num1-num2;
		return result;
		
	}

   
   //Mult
   public int getMult(int num1, int num2) {
	
	int result = num1*num2;
	return result;
	
}


   //Div
   public int getDiv(int num1, int num2) {
	
	int result = num1/num2;
	return result;
	
}



}

