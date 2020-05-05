package Method;

public class UseMethod {

	// Method : block of code which runs when it is called. Method is used to perform
	// certain action and they are known as function
	//Method Type:
	// Return Method without Parameter:
	// Return Method with Parameter:
	// Non Return Method without Parameter:
	// Non Return Method with Parameter:
	
	// Method Syntax: AccessModifier ReturnType / MethodType MethodName(){ Method Body
	//}
	//ReturnType / MethodType: Data Type / ClassType
	//MethoName : verb+noun
	
	//Method Syntax:
	
	//AccessModifier ReturnType / MethodType MethodName(){ Method Body}
	
	//Return Types are: All Dtat Type, void, class and object.
	
	//Method Syntax: AccessModifier ReturnType / MethodType MethodName(){ Method Body
	//}
	
	// AccessModifier ReturnType / MethodType MethodName(){ Method Body}
	
	
	int a=25;
	int age=25;
	String mongo="Appel";
	String mobileBrand ="Appel";
	
	// Non Return Type:
	
	public static void doSummation() {
		
		int number1 = 45;
		int number2= 55;
		int summation = number1 + number2;
		System.out.println("Summation value is " + summation);
		
	}
	
	// Dynamic Non Return Type Parametarise Method
	
	public void doSummation(int num1, int num2) {
		
		int number1 = num1;
		int number2 = num2;
		int summation = number1 + number2;
		System.out.println("Summation value is " + summation);
		
	}
     public void doSummation(int num1, int num2, int num3) {
		
		int number1 = num1;
		int number2 = num2;
		int number3 = num3;
		int summation = number1 + number2 + number3;
		System.out.println("Summation value is " + summation);
     }
     
     // Return Type Method/ Non Parametarized Return Type Method: / Static type Method
     //AccessModifier returnType methodName(){Method Body}
     
     public int doSubstruction() {
    	int number1 = 65;
 		int number2= 55;
 		int substruction = number1 - number2;
 		System.out.println("Subctruction value is " + substruction);
    	 
    	 
    	 return substruction;
     }
     
     //Dynamic Return type Method with parameter
     public int doSubstruction(int num1, int num2) {
     	int number1 = num1;
  		int number2= num2;
  		int substruction = number1 - number2;
  		System.out.println("Subctruction value is " + substruction);
     	 
     	 
     	 return substruction;
      }
     
	public static void main(String[] args) {
		
		UseMethod obj=new UseMethod();
		obj.doSummation();// call by object Name
		
		
		//UseMethod.doSummation();//call by class Name
		//doSummation(); 
		
		obj.doSummation(500, 600);//pass value when call method
		obj.doSummation(20, 34, 44);
		
		obj.doSubstruction();
		obj.doSubstruction(200, 73);// Return Type parametarized metho call by object name
	}
	
	
	
	
	
	
	
	
}
