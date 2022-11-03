package emplyeeIDENtifications;

import java.util.Scanner;

public class Salary {
	
	void salary(){
		
		Scanner scan=new Scanner(System.in);
		NameIDEmail emp_info=new NameIDEmail();
		emp_info.showDetails();
		
		System.out.println("1. for Boss \n"
				+ "2. for Manager \n"
				+ "3. for M_Helper\n"
				+ "4. for Coworker \n"
				+ "5. for Officer \n"
				+ "..................");
		System.out.println("Enter your position : ");
		int pos=scan.nextInt();
		
		if(pos==1){
			emp_info.showDetails();
			System.out.println("Salary = "+(50000+5000-1200)+"Af. ");
			
		}
		else if(pos==2){
			emp_info.showDetails();
			System.out.println("Salary = "+(40000+2000-1000)+"Af. ");
			
		}
		else if(pos==3){
			emp_info.showDetails();
			System.out.println("Salary = "+(35000+1500-800)+"Af. ");
			
		}
		else if(pos==4){
			emp_info.showDetails();
			System.out.println("Salary = "+(28000+1000-700)+"Af. ");
			
		}
		else if(pos==5){
			emp_info.showDetails();
			System.out.println("Salary = "+(15000+800-500)+"Af. ");
		}
		else{
			System.out.println("............... Wrong Entry Try Agian ...............");
		}
		
		
		
		
	}
	
	
}
