package CompileTime;

public class ndOverloding {
	int salary;
	int tax;
	int rent;
	int netsalary;
	
	
	ndOverloding(int salary){
		this.salary=salary;
	}
	public int Payment(int rent){
		this.rent=rent;
		netsalary=salary-rent;
		System.out.println("You only paid Rent !!! ");
		return netsalary;
	}
	public int Payment(int rent,int tax){
		this.rent=rent;
		this.tax=tax;
		netsalary=salary-rent-tax;
		
		System.out.println("U Paid Re/Tax Now netsal="+netsalary);
		return netsalary;
		
	}
}
