package Controlflow;

public class WhileLoop {

	
	// While Lopp is used situation where we do not know many times loop.
	// need to be execute beforehand.
	// For loop is used where we already know about the number of times loop needs.
	// to be executed. Typically for a index used in iteration.
	
	// While Loop: pre condition check
	// While(condition){ ++ or -- }
	
	public static void main(String[] args) {
		
	int x=45;
	int y=20;
		
	// While(condition){ ++ or -- }
	
	while (x>40) {
		
		System.out.println("We are learning while Loop");
		x++;
		
		while (y<25) {
		y++;	
			System.out.println("Nested While Loop Loop");
	}
	}	
		
	}
	
}
