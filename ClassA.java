package tests;

public class ClassA {

	public static void main(String[] args) {
		
		Details stu1=new Details();
		Details stu2=new Details();
		Details stu3=new Details();
		
		stu1.setValues("Sharf", 9000, "Sep ");
		stu2.setValues("SherKhar",15000,"Dec ");
		stu3.setValues("Khan", 8000, "Oct");
		
		Payments pay=new Payments();
		pay.printDetails(true, stu1);
		pay.printDetails(false, stu2);
		pay.printDetails(true, stu3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
