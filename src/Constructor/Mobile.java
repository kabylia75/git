package Constructor;

public class Mobile {

	String mobileBrand;
	String mobileModel;
	double price;
	int ramSize;
	
	
	
	public Mobile() {  // default constructor
			
		
	}


	public Mobile(String mobileBrand) {
		this.mobileBrand = mobileBrand;
		
		}


	public Mobile(String mobileBrand, String mobileModel) {
		
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
	}


	public Mobile(String mobileBrand, String mobileModel, double price) {
	
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
	}


	public Mobile(String mobileBrand, String mobileModel, double price, int ramSize) {
	
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramSize = ramSize;
	}
	
	public static void main(String[] args) {
		
		Mobile mobileobj = new Mobile();
		
	}
	
	
		
	
	
	
	
	
	
}
