package Class;
// Goal: we want to Associate two different classes through thier object in Main method....

// Back Class ...
 class Bank{
	 private String Name;// Attributes of Back Class.
	 
	 public void SetName(String name){//  //  Set Bank_Name..
		 this.Name=name;
		 
	 }
	 public String GetName(){        // Return Name of the Bank;
		 return Name;
	 }
	 
	 
 }
 
class Employee{              // Emp Class.
	
	private String EmpName;//   Attributes
	
	public void SetEmpName(String empName){      
		this.EmpName=empName;
	}
	public String GetEmpName(){
		return EmpName;
	}
}
public class Association {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	    Bank obj = new Bank();
		Employee obj1 = new Employee();
		
		obj1.SetEmpName("Sharifullah");// Set Name for employee.
		obj.SetName("Azizi");               // Set Name for Bank;
		System.out.println(obj1.GetEmpName()+ " is Employee of  "+obj.GetName()+ " Bank");// Show the setted Names from setter metod.
		
	}

}
