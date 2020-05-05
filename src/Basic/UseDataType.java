package Basic;

public class UseDataType {

	/*
	 * DataType:
	 * 
	 *         Premitive:
	 *               
	 * A- Non Numeric:
	 * 1 boolean
	 * 2 Char
	 * 
	 * B- Numeric:
	 * 1 byte
	 * 2 int
	 * 3 short
	 * 4 long
	 * 
	 * 5 float
	 * 6 double
	 * 
	 *         Non-Premitive
	 * string
	 * arrays
	 * Objects 
	 */
	// Primitive DataType
	byte age=127;
	int number=45;
	short dailySale = 5987;
	long annualSale = 84909080;
	double salary = 5000.500;
	float coursefee = 4500.500f;
	boolean isInStock=true;
	char namestartWith='S';
	
	// Non-Primitive DataType
	
	String fullName="Elian Haddadi 11/02/2011"; // String type can take all type of Data
	String elianfullName="Elian";
	String darysfullName="Darys";
	String manafullName="Manal";
	
	
	public static void main(String[] args) {
		UseDataType Useobjname= new UseDataType();
		
		// con-cat-e-nate: concatenate +
		
		System.out.println("Full  Name is " + Useobjname.fullName);// + is concatenation
		System.out.println("First Name is " + Useobjname.darysfullName);
		System.out.println("First Name is " + Useobjname.manafullName);
		System.out.println("First Name is " + Useobjname.elianfullName);
		
		
	}
	
	
	
	
	
	
}
