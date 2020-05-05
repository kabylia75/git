package Basic.doenum;

public class UseEnum {

	//Enum: Enum declaration can be done outside of a class or inside a class but 
	//not inside a method
	//Enum vs Class
	//An Enum can just like a class have attributes and methods.
	//Enum constants are public, static, final. unchangeable can not be override
	//An Enum can not be used to create object and it can not extends other classes but
	//it can implement interfaces.
	//Use Enums when you have values that you know are not going to change.
	//Ex: Days, Colors.
	
	
	public enum color{
		RED,BLEU,YELLOW,GREEN;
		
	public static void display() {
		System.out.println("Display is good");
	}	
	}
	
	public static void main(String[] args) {
		System.out.println(color.RED);// call by enum name
		color.display();
		
	}
	

	

}
