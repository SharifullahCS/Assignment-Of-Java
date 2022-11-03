package emplyeeIDENtifications;
import java.util.*;

public class NameIDEmail {
	
	String name;
	double id;
	String email;
	
	void info(String n,double iD,String em){
		n=name;
		iD=id;
		em=email;
		
	}
	void showDetails(){
		Salary sal=new Salary();
		
		System.out.println("Name : "+name);
		System.out.println("  ID : "+id);
		System.out.println("Email: "+email);
		System.out.println("Salary:"+sal);
		
	}
	
	
	
	
	
	
}
