package tourestsAPP;
import java.util.*;

public class Tour {
	String name;
	int passno;
	int date;
	
	Tour(String name,int passno,int date){
		System.out.println("... Your Entery in Constructore .............");
		System.out.println("Name : "+name);
		System.out.println("PassNo:"+passno);
		System.out.println("Date : "+date);
		
		this.name=name;
		this.passno=passno;
		this.date=date;
	}
	
	
	
	void show(){
		System.out.println("\n\n............ Your Entery in Show()_fun .............");
		System.out.println("Name : "+name);
		System.out.println("PassNo:"+passno);
		System.out.println("Date: "+date);
		
		
		this.name=name;
		this.passno=passno;
		this.date=date;
	}
	
	
	{
		System.out.println("\n\n...... Your Entery in Instance Blocks .............");
		System.out.println("Name : "+name);
		System.out.println("PassNo:"+passno);
		System.out.println("Date: "+date);
		
		
		this.name=name;
		this.passno=passno;
		this.date=date;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Info : ");
		
		System.out.println("Name : ");
		String ename=scanner.next();
		
		System.out.println("PassNo:");
		int passportNo=scanner.nextInt();
		
		System.out.println("Date: ");
		int date=scanner.nextInt();
		
		
		
		
		new Tour(ename,passportNo,date).show();	//Calling to Constructor && Instance Blocks
		
		Tour obj1=new Tour(ename,passportNo,date);
		obj1.show(); 						//Calling to Object of Tour_Class
		
		
		
		
	}

}