package HierarchicalInheratance;
import java.util.*;


public class BASE {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		BPersonalInfo obj2=new BPersonalInfo();
		System.out.println("Requered Info ...............");
		System.out.print("Name: ");
		String name=scan.next();
		System.out.print("Son_Of:");
		String f_name=scan.next();
		System.out.print(" ID  : ");
		int id=scan.nextInt();
		System.out.print("Email: ");
		String e_mail=scan.next();
		System.out.print(" Add  : ");
		String address=scan.next();
		obj2.perInfo(name, f_name, id, e_mail, address);
//		obj2.Show_perInfo();
		
		
//		CTreatment_Ext_B obj3=new CTreatment_Ext_B();
//		System.out.print("Problem:");
//		String problem=scan.next();
//		System.out.print("Payment:");
//		int payment=scan.nextInt();
//		obj3.add_problem(problem, payment);
//		obj2.Show_perInfo();
//		obj3.Show_problem();
		
		
		D_Salary_exta_A obj4=new D_Salary_exta_A();
		System.out.print("\n\nSalary:");
		int salary=scan.nextInt();
		System.out.print("Bones: ");
		int bon=scan.nextInt();
		System.out.print("Rent : ");
		int rent=scan.nextInt();
		System.out.print("Ebill: ");
		int ebil=scan.nextInt();
		System.out.print(" Tax : ");
		int tax=scan.nextInt();
		obj4.setSalary(salary, bon, rent, ebil, tax);
		obj2.Show_perInfo();
		obj4.Show_sal();
		
	}

}
