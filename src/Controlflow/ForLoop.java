package Controlflow;

public class ForLoop {

	// Loop is allowing us to execute a statement ou group of statements multiple times.
	// For Loop
	// While Loop
	// Do. .While loop
	// For each Loop
		
	public static void main(String[] args) {
		
		System.out.println("Hello world");
	   	//System.out.println("Hello world");
    	//System.out.println("Hello world");
    	//System.out.println("Hello world");
    		
		// For Loop
		// for (Declaration: Expression) { // statements}
		// for (Initialization; Condition) Iteration}{ }
		// Initialization = StartPoint; Condition= EndPoint; Iteration =Looping/AgainNAgain
		
		//for (int i = 0; i < 5; i++ ) {
			//System.out.println("We are learning For Loop");	
		//}
	
		// Nested For Loop
		for (int i = 0; i < 3; i++ ) {
			// parent for loop			
			System.out.println("We are learning NestedFor Loop");			
			// child for loop			
			for (int j = 0; j < 2; j++ ) {
				System.out.println("Nested Loop");	
								
			}
		}
		}
	
}
