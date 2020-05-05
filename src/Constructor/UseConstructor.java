package Constructor;

public class UseConstructor {

	// Constructor Name will be as Class Name.
	// Constructor has no Return Type.
	// Constructors are used to initialize the object.
	// Before creating Parameterize constructor we must have to create Default.
	// constructor
	
	// Default/ non Parametarized Constructor
	// Parametarized Constructor.
	
	
	// AccessModifier className(){ }
	
	String name;
	String address;
	int id;
	
	
	public UseConstructor() {
		// default constructor
		// System.out.println("Hello World");
		
		}
	
	public UseConstructor(String name) {
		// Signature pattern / parameter
		this.name= name;
		System.out.println("Name is " + this.name);
		
		}
	
	public UseConstructor(String newName, String address) {
		
		// signature pattern / parameter: Multiple Parametarized constructor
		// Dynamic constructor
		
		this.name = newName; // Assign value by calling local variable
		this.address = address;
		
		System.out.println("Name is " + this.name+  " " + "Address is " + this.address);
	}
	
	public static void main(String[] args) {
		
		// Create object a object of UseConstructor class
		
		// className objectName = new constructorOfClass
		UseConstructor obj = new UseConstructor();
		
		UseConstructor ElianObj=new UseConstructor("Elian");  
		
		UseConstructor DarysObj = new UseConstructor("Darys", "338 Curtiss ST, CT"); // argument passing
	}
	
	
	
}
