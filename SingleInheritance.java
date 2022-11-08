package SigleInheratence;
import java.util.*;


class baseInfo{
	String name;
	int id;
	
}
class EMP extends baseInfo{
	String address;
	int salary;
	int bones;
	int rent;
	int ebill;
	int tax;
	
	void setValues(String n,int i,int sal,String add){
		name=n;
		id=i;
		salary=sal;
		address=add;	}//End of Set Values ...........
	void expences(int bon,int ta,int re,int eb){
		bones=bon;
		tax=ta;
		rent=re;
		ebill=eb;	}//End of expences ..........
	void showing(){
		System.out.println("\n\n..............Your Entry...............");
		System.out.println("Name : "+name);
		System.out.println("  Id : "+id);
		System.out.println("Address:"+address);
		System.out.println("NetSalary= "+(salary+bones-tax-rent-ebill));	}//End of Showing ..........
	
}






public class SingleInheritance {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EMP obj2=new EMP();
		
		System.out.println("Welcome to Empoyee Services !!!");
		
		System.out.print("Name : ");
		String nam=scan.next();
		System.out.print("  ID : ");
		int ident=scan.nextInt();
		System.out.print("Salary:");
		int salar=scan.nextInt();
		System.out.print("Address:");
		String addres=scan.next();
		System.out.print("Bones: ");
		int bon=scan.nextInt();
		System.out.print(" Tax : ");
		int tax=scan.nextInt();
		System.out.print("Rent : ");
		int ren=scan.nextInt();
		System.out.print("Ebill: ");
		int ebil=scan.nextInt();
		
		obj2.setValues(nam, ident, salar, addres);//For Passing Values..........
		obj2.expences(bon,tax, ren, ebil);
		obj2.showing();		//For Showing.............
		
		
		/*baseInfo obj1=new baseInfo();   //For ClassB(emp) Calling!
		System.out.println("Enter your info ..............");
		
		System.out.print("Name : ");
		String nam=scan.next();
		System.out.print("  ID : ");
		int ident=scan.nextInt();
		System.out.print("Salary:");
		int salar=scan.nextInt();
		System.out.print("Address:");
		String addres=scan.next();
		obj2.setValues(nam, ident, salar, addres);		// For Store upper Values...........
		
		obj2.show();		// For showing back.............
		*/
	}

}
