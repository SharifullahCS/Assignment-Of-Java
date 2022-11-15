package project1;
                  // Encapsulation Concept In Java....
public class encapsulation {

	private String Name= "Sharifullah";
	private int accNo = 42;
	
	
	void setName(String name){
		this.Name=name;
	}
	void setaccNo(int accNo){
		this.accNo=accNo;
	}
	// Get Name from setter method.
	String getName(){
		return Name;
	}
	// Get Account_number from setter method.
	int getaccNo(){
		return accNo;
	}
	
	
	public static void main(String[] args) {
		
		
		encapsulation obj = new encapsulation();
		obj.setName("Amin");
		obj.setaccNo(12398);
		
		// To access only returned Values...
		System.out.println(obj.getName());
		System.out.println(obj.getaccNo());

	}

}
