package emplyeeIDENtifications;
import java.util.*;


public class EmployeeAllinfos {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		NameIDEmail nie=new NameIDEmail();
		
		Salary salary=new Salary();
		
		System.out.println("Sir! pls Finrst Enter Your Idintification !!!");
		System.out.print("Name : ");
		String name=scan.next();
		System.out.print("  ID : ");
		int id=scan.nextInt();
		System.out.print("E_mail:");
		String email=scan.next();
		
		nie.info(name,id,email);		///////Passing your info ......................
		
		salary.salary();	///////////// For Salary adding ///////////////
		System.out.println(".............Your Entry.................");
		
		
		
		
		
		
	}

}
