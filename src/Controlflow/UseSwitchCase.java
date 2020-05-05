package Controlflow;

public class UseSwitchCase {

	public static void main(String[] args) {
		
		int foodseries=9;
		String foodName;
		
		
		switch(foodseries) {
		
		case 1:
			foodName="Pizza";
			break;
			
		case 2:
			foodName="Coffee";
			break;
			
		case 3:
			foodName="cookie";
			break;
			
		case 4:
			foodName="Ice Creama";
			break;
			
		case 5:
			foodName="Steak";
			break;
		case 6:
			foodName="Burger";
			break;
		default:
			foodName = "Invalid Food Item";
			break;
		}
		System.out.println("Selected Food is " + foodName);
		
		
		
		
	}
	
	
	
	
	
	
}
