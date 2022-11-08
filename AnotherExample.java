package BasicConstructors;
import java.util.*;

public class AnotherExample {
	String name;
	int id;
	int salary;
	
	void passingDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Name : ");
		name=scanner.next();
		System.out.print("  Id : ");
		id=scanner.nextInt();
		System.out.print("Salary:");
		salary=scanner.nextInt();
	}
	
	
	
	AnotherExample(){
		name=null;
		id=0;
		salary=0;
	}
	
	
	
	
	void show(){
		System.out.println("Name : "+name);
		System.out.println("  Id = "+id);
		System.out.println("Salary="+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		new AnotherExample().passingDetails();		//// 1. Calling ......
		new AnotherExample().show();
		
		
		AnotherExample obj=new AnotherExample();	//// 2. Calling ......
		obj.passingDetails();
		System.out.println("......... Your Entery ................");
		obj.show();
		
		
		System.out.println("........ Defualt Entry ...............");
		AnotherExample obj1=new AnotherExample();
		obj1.show();
		
		
		
		
		
		
		
		
	}

}
