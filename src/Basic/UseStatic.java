package Basic;

public class UseStatic {

	public static void main(String[] args) {
		
		UseStatic.display(); // we create obj method (for Static Method) and we called by class name
	
		// create a object
		UseStatic myObject = new UseStatic();
		myObject.TVDisplay(); // this is object for Non_static Method (TV Display())
		
		
	}
		
	public static void display() {
		System.out.println("Display is good");
		
	}
					
	public void TVDisplay() {
		System.out.println("TV Display is FHD");
}
}
	
	
