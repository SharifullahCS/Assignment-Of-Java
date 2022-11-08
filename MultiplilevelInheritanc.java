package Multilevelnheratence;
import java.util.*;




class Less_Info{
	String name;
	String f_name;
}

class Mid_Info extends Less_Info{
	int id;
	String address;
}


class Salary extends Mid_Info{
	int salary;
	int bones;
}







class Expences extends Salary{
	int rent;
	int ebill;
	int tax;
	void setValues(String na,String f_n,int i,String add,int sal,int bon,int re,int eb,int ta){
		name=na;
		f_name=f_n;
		id=i;
		address=add;
		salary=sal;
		bones=bon;
		rent=re;
		ebill=eb;
		tax=ta;	}////////////End Of Set_Values
	void show(){
		System.out.println("\n\nWelcome Agian ("+name+")! Check Your Entry !!! ");
		System.out.println("Name : "+name);
		System.out.println("Son_of:"+f_name);
		System.out.println(" ID  : "+id);
		System.out.println(" Add : "+address);
		System.out.println("Salary:"+(salary+bones));
		System.out.println("Net_Sal:"+(salary+bones-rent-ebill-tax));
		
	}
	
	
}


public class MultiplilevelInheritanc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome To Employee Info_Deportment !!! ");
		System.out.print("Name : ");
		String name=scan.next();
		System.out.print("Son_of:");
		String sonof=scan.next();
		System.out.print(" ID  : ");
		int iden=scan.nextInt();
		System.out.print(" Add : ");
		String add=scan.next();
		System.out.print("Salary:");
		int sal=scan.nextInt();
		System.out.print("Bonse: ");
		int bons=scan.nextInt();
		System.out.print("Rent : ");
		int rnt=scan.nextInt();
		System.out.print("E_bill:");
		int ebil=scan.nextInt();
		System.out.print(" Tax : ");
		int tax=scan.nextInt();
		
		Expences obj4=new Expences();
		obj4.setValues(name, sonof, iden, add, sal, bons, rnt, ebil, tax);
		
		//Call To Showing Function !???
		obj4.show();
		
	}

}
