package operators;

public class UnaryOperators {

	// Icrement operator: ++ always add 1 
	// PreIncrement : ++number
	// PostIncrement: number++
	
	// Decrement operator: -- Decrease -1 
	// PreDecrement : --number
	// PostIDecrement: number--
		
	
	public static void main(String[] args) {
		
		// ++ Icrement Unary operator
		
		// PreIncrement : ++number : 1+ Present Value
		// PostIncrement: number ++ :its add value (+1)for future
				
		
		// -- Decrement Unary operator
		
		// PreDecrement : --number : -1 Present Value
		// PostIDecrement: number-- :its Deduct value (-1)for future
		
		int number = 6;
		System.out.println(number++);
		System.out.println(number); // 1+number // 7
		number++;
		number++;		
		System.out.println(number); // 9
		
		--number;
		System.out.println(number);
		++number;
		System.out.println(number);
		number--;
		number--;
		number++;
		number++;
		--number;
		++number;
		System.out.println(number);
		
		
		
		
		
		
	}
	
	
}
