package operators;

public class ConditionOperators {

	// && Condition AND; all condition must have to be true
	// || Condition OR : if one condition is true then block of code will execute
	
	// pipe||
	
	public static void main(String[] args) {
		
		int number1 = 55;
		int number2 = 40;
		
		if (number1== 55 && number2==40) {
			
			System.out.println("We love to eat a Pizza");
			
		if (number1== 45 || number2==40) {
				
			System.out.println("We love to eat Italian Pizza");
			
		}
	}
	
	
	}
	
		
	
}
