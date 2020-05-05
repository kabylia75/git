package Basic;

public class UseVariable {

	// Variable : variable is a container which can hold value
	
	// Variable Type: 
	
		/** 
		 * Variable:local variable: inside of a method Global variable / instance
		 * Variable: Reference variable :inside of a method of a class but outside of method
		 * Variable: static keyword is used
		 * 
		 */
// if variable and method is static then you can call those variable and method by its class name.
// if variable and method is Non-static then you can call those variable and method by its objects name. 
	
	// Integer is data type
	
	// DataType variableName= value;
	
	// Non static Global variable
	int x = 5;
	int p= 7;
	
	//class variable
	static int q=10;
	
	//Declare variable
	int a;
	
	//Declare and Initialize value
	int b=80;
	
	// Constant variable:
	String MAX_WIDTH="44";
	final String MIN_WISTH="36";
	
	
	public static void main(String[] args) {
		//local variable
		int y=4;
		System.out.println(UseVariable.q);
		// Always Need to create a object then call it by object name 
		// how to create object?
		//ClassName objectName = new Constructor of Class();
		UseVariable Objvar= new UseVariable();
		//Objvar.p = 14; we assigned p
		System.out.println(Objvar.p);// call by object name 
		Objvar.p=33; // RE-Assign/ Re-Initialize value            NB: (before P=7 Re-Initialize P=33)any time 
		System.out.println(Objvar.p);
		Objvar.a=55;
		System.out.println(Objvar.a);
		Objvar.p=34;
		System.out.println(Objvar.p);
		Objvar.MAX_WIDTH="46";
		System.out.println(Objvar.MAX_WIDTH);
		//Objvar.MIN_WIDTH="32"; // we can not Re-Initialize  NB: WE Putted Final MIN_WIDTH the value must be same "36"
		

	
	}
	
	
	
}
