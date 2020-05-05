package problemsandsolutions;

public class FindoutLargestNumber {

	public static void main(String[] args) {
		
		int x = 35;
		int y = 88; 
		int z = 87;
		System.out.println("Enter three integers");
		
		if(x > y && x > z)
			System.out.println("First number is largest.");
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		else 
			System.out.println("The numbers are not distinct.");
	}
		
		
	}
		
	

