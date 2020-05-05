package Basic;

public class UseAccessModifier {

	//Access Modifier/ access Specifier: class, variable,method
	//Private:only we can call or use within the class it is located
	//public: we can call or or use within the class where it is located and from any other class
	//Protected: only accessible from all class of that particular package.
	
	//Access Modifier:
	// Public
	//Private
	//Protected
	//Default
	
	//Access modifier DtatType variableName = variableValue
	public static String name="Elian Haddadi";
	private static String ssn="854-523-265";
	public static int mobileNumber= 68770642;// should be protescted 
	
	String fName="Elian";
	
	
	public static void main(String[] args) {
		// ctrl+space>>hit Enter
		
		System.out.println(UseAccessModifier.ssn); 
	}
		
	}
	
	
	

