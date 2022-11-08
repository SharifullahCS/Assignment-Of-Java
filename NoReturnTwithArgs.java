package methods;

import java.util.Scanner;

public class NoReturnTwithArgs {
	
	void emp(String name,int id,int tot){
		System.out.println("");
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		NoReturnTwithArgs obj=new NoReturnTwithArgs();
		
		String nam;
		int i;
		int sal;
		int bon;
		
		System.out.print("Want fill the form Yes='1' or No='2' ? ");
		int choice=scan.nextInt();
		
		int total=0;
		
		if(choice==1){
		
			System.out.println("Name : ");
			nam=scan.next();
			
			System.out.println("  ID : ");
			i=scan.nextInt();
			
			System.out.println("Salary: ");
			sal=scan.nextInt();
			
			System.out.println("Bones: ");
			bon=scan.nextInt();
			
			total=sal+bon;
			System.out.print("Name : "+nam+"   Id : "+i+"    Salary : "+total);
			
			obj.emp(nam, i, total);
			
		}
		else{
			
			System.out.println(".................Ok Goodbye !!!..............");
		}
		
		
		
	}
	
	
}
