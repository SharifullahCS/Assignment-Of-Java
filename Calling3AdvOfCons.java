package BasicConstructors;

public class Calling3AdvOfCons {
	
	int id;
	String name;
	int salary;
	
	Calling3AdvOfCons(){
		id=1;
		name="Ali Abid";
		salary=25000;
		
	}
	void setValue(int i,String n,int s){
		id=i;
		name=n;
		salary=s;
		
	}
	void show(){
		System.out.println("  Id = "+id);
		System.out.println("name = "+name);
		System.out.println("Salary="+salary+"Afg");
		System.out.println("........... Typing .............\n");
		
	}
	
	
	
	

	public static void main(String[] args) {
		Calling3AdvOfCons obj1=new Calling3AdvOfCons();
		obj1.show();
		////  1- If you don't pass any value to it ! (Cons Will pass)
		
		Calling3AdvOfCons obj2=new Calling3AdvOfCons();
		obj2.setValue(2, "Khan M.", 50000);
		obj2.show();
		////  2- If u pass value pro will pass that .................
		
		Calling3AdvOfCons obj3=new Calling3AdvOfCons();
		obj3.setValue(3, "Boss Sharf", 120000);
		obj3.show();
		//// 3- is Same to 2nd One ...............
		
		Calling3AdvOfCons obj4=new Calling3AdvOfCons();
		System.out.println("\n Automaticallly ! \n Agian Will be Call that firstone : ");
		obj4.show();
		//// 4- is Same to 1st One ...............
		
	}

}
